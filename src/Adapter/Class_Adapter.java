package Adapter;

/**
 * Created by LIYAO-SZ on 2016/6/6.
 * 【类的适配器】
 */
public class Class_Adapter extends Source implements Targetable{

    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
