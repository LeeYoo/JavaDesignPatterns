package Bridge;

/**
 * Created by LIYAO-SZ on 2016/7/18.
 *
 */

/**
 * Created by LIYAO-SZ on 2016/7/18.
 * 10【桥接模式】（创建型模式）
 *      桥接模式就是把事物和其具体实现分开，使他们可以各自独立的变化。桥接的用意是：将抽象化与实现化解耦，使得二者可以独立变化，像我们常用的JDBC桥DriverManager一样，
 *      JDBC进行连接数据库的时候，在各个数据库之间进行切换，基本不需要动太多的代码，甚至丝毫不用动，原因就是JDBC提供统一接口，每个数据库提供各自的实现，
 *      用一个叫做数据库驱动的程序来桥接就行了。这样，就通过对Bridge类的调用，实现了对接口Sourceable的实现类SourceSub1和SourceSub2的调用
 * 总结：
 *      意图：将抽象部分与实现部分分离，使它们都可以独立的变化。
 *
 * 其他相关介绍：http://blog.csdn.net/jason0539/article/details/22568865
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
