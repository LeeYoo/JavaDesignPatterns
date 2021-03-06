package Singleton;

/**
 * Created by LIYAO-SZ on 2016/5/24.
 * 【最佳实现】共有5个实现单例的方案，逐步完善，最佳实践！
 * 总结：
 *      synchronized关键字锁定的是对象，在用的时候，一定要在恰当的地方使用（注意需要使用锁的对象和过程，可能有的时候并不是整个对象及整个过程都需要锁）。
 *      到这儿，单例模式基本已经讲完了，结尾处，笔者突然想到另一个问题，就是采用类的静态方法，实现单例模式的效果，也是可行的，此处二者有什么不同？
 *      首先，静态类不能实现接口。（从类的角度说是可以的，但是那样就破坏了静态了。因为接口中不允许有static修饰的方法，所以即使实现了也是非静态的）
 *      其次，单例可以被延迟初始化，静态类一般在第一次加载是初始化。之所以延迟加载，是因为有些类比较庞大，所以延迟加载有助于提升性能。
 *      再次，单例类可以被继承，他的方法可以被覆写。但是静态类内部方法都是static，无法被覆写。
 *      最后一点，单例类比较灵活，毕竟从实现上只是一个普通的Java类，只要满足单例的基本需求，你可以在里面随心所欲的实现一些其它功能，但是静态类不行。
 *      从上面这些概括中，基本可以看出二者的区别，但是，从另一方面讲，我们上面最后实现的那个单例模式，内部就是用一个静态类来实现的，所以，二者有很大的关联，
 *      只是我们考虑问题的层面不同罢了。两种思想的结合，才能造就出完美的解决方案，就像HashMap采用数组+链表来实现一样，其实生活中很多事情都是这样，
 *      单用不同的方法来处理问题，总是有优点也有缺点，最完美的方法是，结合各个方法的优点，才能最好的解决问题！
 */
public class Singleton3 {

    //1. 将默认构造函数私有化，不允许外界直接通过其创建多个实例
    private Singleton3(){}

    //2. 持有类的唯一实例（私有静态），此处赋值为null，目的是实现延迟加载
    private static Singleton3 instance = null;

    //3. 静态工程方法，创建实例：提供给外部用于获取实例的方法

    //【A方案】：最基础的单例实现
    /*public static Singleton3 getInstance(){
        if(instance == null){
            instance = new Singleton3();    //随着用户获取而加载
        }
        return instance;
    }*/

    /*【注意】线程不安全！性能问题！等等
        到此，这个类已经可以满足基本的单例要求，但是，像这样毫无线程安全保护的类，如果我们把它放入多线程的环境下，
        肯定就会出现问题了，如何解决？我们首先会想到对getInstance方法加synchronized关键字，来解决线程不安全问题。
        但是，synchronized关键字锁住的是这个对象，这样的用法，在性能上会有所下降，因为每次调用getInstance()方法，
        都要对对象上锁，事实上，只有在第一次创建对象的时候需要加锁，之后就不需要了，所以，这个地方需要改进：
    */
    //【B方案】：加锁初步实现单例（线程依然不安全）
    /*public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (instance) {
                instance = new Singleton3();    //随着用户获取而加载
            }
        }
        return instance;
    }*/

    /*但是，此时此刻，修改synchronized的位置，虽然是解决了性能的问题，但使用synchronized加锁就是为了解决线程不安全的问题，
        而此方案，虽然是解决了性能问题，确没有解决线程不安全的问题，当多线程访问时，该模式依然是线程不安全的！
        所以，在获得锁之后，还需要再一次判断实例是否被创建，采用二次判断的机制，可以解决线程不安全问题，又可以提高效率！
    * */
    //【C方案】：加锁和二次判断实现单例
    /*public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (instance) {
                if (instance == null) {
                    instance = new Singleton3();    //随着用户获取而加载
                }
            }
        }
        return instance;
    }*/

    /*
        似乎解决了之前提到的问题，将synchronized关键字加在了内部，也就是说当调用的时候是不需要加锁的，只有在instance为null，
        并创建对象的时候才需要加锁，性能有一定的提升。但是，这样的情况，还是有可能有问题的。
        【内存分析】
            看下面的情况：“在Java指令中创建对象和赋值操作是分开进行的”，也就是说instance = new Singleton();语句是分两步执行的。
            但是JVM并不能够保证这两个操作的先后顺序，也就是说有可能JVM会为新的Singleton实例分配空间，然后直接赋值给instance成员，
            然后再去初始化这个Singleton实例。这样就可能出错了，我们以A、B两个线程为例：
            a>  A、B线程同时进入了第一个if判断
            b>  A首先进入synchronized块，由于instance为null，所以它执行instance = new Singleton();
            c>  由于JVM内部的优化机制，JVM先划出了一些分配给Singleton实例的空白内存，并赋值给instance成员（注意此时JVM没有开始初始化这个实例），
                然后A离开了synchronized块。
            d>  B进入synchronized块，由于instance此时不是null，因此它马上离开了synchronized块，并将结果返回给调用该方法的程序。
            e>  此时B线程打算使用Singleton实例，却发现它没有被初始化，于是错误发生了。
        【结论】
            所以程序还是有可能发生错误，其实程序在运行过程是很复杂的，从这点我们就可以看出，尤其是在写多线程环境下的程序更有难度，有挑战性。
            我们对该程序做进一步优化：
            实际情况是，【单例模式使用内部类来维护单例的实现】，JVM内部的机制能够保证当一个类被加载的时候，这个类的加载过程是线程互斥的。
            这样当我们第一次调用getInstance的时候，JVM能够帮我们保证instance只被创建一次，并且会保证把赋值给instance的内存初始化完毕，
            这样我们就不用担心上面的问题。同时该方法也只会在第一次调用的时候使用互斥机制，这样就解决了低性能问题。这样我们暂时总结一个完美的单例模式：
     */
    //【D方案】：使用内部类来维护单例的实现
    /*private static class SingletonFactory{  //内部类
        private static Singleton3 instance = new Singleton3();
    }
    public static Singleton3 getInstance(){
        return SingletonFactory.instance;
    }*/


    //4. 如果该对象被用于序列化，可以保证对象在序列化前后保持一致
    public Object readResolve() {
        return instance;
    }


    /*【后续】
        其实说它完美，也不一定，如果在构造函数中抛出异常，实例将永远得不到创建，也会出错。
        所以说，十分完美的东西是没有的，我们只能根据实际情况，选择最适合自己应用场景的实现方法。
        也有人这样实现：因为我们只需要在创建类的时候进行同步，所以【只要将创建和getInstance()分开】，单独为创建加synchronized关键字，也是可以的：
        考虑性能的话，整个程序只需创建一次实例，所以性能也不会有什么影响。
    */
    //【E方案】：使用创建及获取实例分离的方式实现单例
    private static synchronized void syncInit() {   //创建实例
        if (instance == null) {
            instance = new Singleton3();
        }
    }
    public static Singleton3 getInstance() {        //获取实例
        if (instance == null) {
            syncInit();
        }
        return instance;
    }
}
