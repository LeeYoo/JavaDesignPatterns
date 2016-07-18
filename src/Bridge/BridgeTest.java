package Bridge;

/**
 * Created by LIYAO-SZ on 2016/7/18.
 *
 */

/**
 * Created by LIYAO-SZ on 2016/7/18.
 * 10【桥接模式】（结构式模式）
 *      桥接模式是用于“把抽象和实现分开，这样它们就能独立变化”。 桥接模式使用了封装、聚合，可以用继承将不同的功能拆分为不同的类。
 *      桥接模式就是把事物和其具体实现分开，使他们可以各自独立的变化。桥接的用意是：将抽象化与实现化解耦，使得二者可以独立变化，像我们常用的JDBC桥DriverManager一样，
 *      JDBC进行连接数据库的时候，在各个数据库之间进行切换，基本不需要动太多的代码，甚至丝毫不用动，原因就是JDBC提供统一接口，每个数据库提供各自的实现，
 *      用一个叫做数据库驱动的程序来桥接就行了。这样，就通过对Bridge类的调用，实现了对接口Sourceable的实现类SourceSub1和SourceSub2的调用
 * 总结：
 *      意图：将抽象部分与实现部分分离，使它们都可以独立的变化。
 *      Bridge模式是一个非常有用的模式，也非常复杂，它很好的符合了开放-封闭原则和优先使用对象，而不是继承这两个面向对象原则。
 *
 * 应用场景：
 *      1．如果一个系统需要在构件的抽象化角色和具体化角色之间增加更多的灵活性，避免在两个层次之间建立静态的联系。
 *      2. 设计要求实现化角色的任何改变不应当影响客户端，或者说实现化角色的改变对客户端是完全透明的。
 *      3. 一个构件有多于一个的抽象化角色和实现化角色，系统需要它们之间进行动态耦合。
 *      4. 虽然在系统中使用继承是没有问题的，但是由于抽象化角色和具体化角色需要独立变化，设计要求需要独立管理这两者。
 *
 * 其他相关介绍： 1. http://blog.csdn.net/jason0539/article/details/22568865
 *              2. http://www.cnblogs.com/jingmoxukong/p/4224661.html
 */
public class BridgeTest {

    public static void main(String[] args) {

        Bridge bridge = new MyBridge();

        /*调用第一个对象*/
        Sourceable source1 = new SourceSub1();
        bridge.setSourceable(source1);
        bridge.method();

        /*调用第二个对象*/
        Sourceable source2 = new SourceSub2();
        bridge.setSourceable(source2);
        bridge.method();
    }
}
