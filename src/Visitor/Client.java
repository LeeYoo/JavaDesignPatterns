package Visitor;

/**
 * Created by LIYAO-SZ on 2016/7/28.
 * 21【访问者模式】（行为型模式）。
 *      访问者模式的目的是封装一些施加于某种数据结构元素之上的操作。一旦这些操作需要修改的话，接受这个操作的数据结构则可以保持不变。
 *      访问者模式就是一种【分离对象数据结构与行为的方法】，通过这种分离，可达到为一个被访问者动态添加新的操作而无需做其它的修改的效果。
 *
 * 使用场景：
 *      该模式适用场景：如果我们想为一个现有的类增加新功能，不得不考虑几个事情：
 *      1、新功能会不会与现有功能出现兼容性问题？
 *      2、以后会不会再需要添加？
 *      3、如果类不允许修改代码怎么办？
 *      面对这些问题，最好的解决方法就是使用访问者模式，访问者模式适用于数据结构相对稳定的系统，把数据结构和算法解耦，
 *
 *  更多详细介绍：http://www.cnblogs.com/java-my-life/archive/2012/06/14/2545381.html
 */
public class Client {

    public static void main(String[] args) {

        Visitor visitor = new MyVisitor();
        Subject sub = new MySubject();
        sub.accept(visitor);
    }
}
