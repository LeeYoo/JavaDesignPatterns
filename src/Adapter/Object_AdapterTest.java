package Adapter;

/**
 * Created by LIYAO-SZ on 2016/6/6.
 * 【对象的适配器测试】输出与第一种一样，只是适配的方法不同而已
 */
public class Object_AdapterTest {

    public static void main(String[] args) {
        Source source = new Source();
        Targetable target = new Object_Adapter(source);
        target.method1();
        target.method2();
    }
}
