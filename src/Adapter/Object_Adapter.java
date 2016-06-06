package Adapter;

/**
 * Created by LIYAO-SZ on 2016/6/6.
 * 【对象的适配器】
 */
public class Object_Adapter implements Targetable {

    private Source source;

    public Object_Adapter(Source source){
        super();
        this.source = source;
    }
    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }

    @Override
    public void method1() {
        source.method1();
    }



}
