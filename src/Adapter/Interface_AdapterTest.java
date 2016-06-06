package Adapter;

/**
 * Created by LIYAO-SZ on 2016/6/6.
 */
public class Interface_AdapterTest {
    public static void main(String[] args) {
        Interface_Sourceable source1 = new Interface_SourceSub1();
        Interface_Sourceable source2 = new Interface_SourceSub2();

        source1.method1();
        source1.method2();
        source2.method1();
        source2.method2();
    }
}
