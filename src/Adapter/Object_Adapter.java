package Adapter;

/**
 * Created by LIYAO-SZ on 2016/6/6.
 * 【对象的适配器】
 * 适配器类，直接关联被适配的类。同时实现标准接口
 */
public class Object_Adapter implements Targetable {

    private Source source;//直接关联被适配类

    //通过构造函数传入具体需要适配的被适配类对象
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
        source.method1();   //使用委托的方式访问
    }



}
