package Decorator;

/**
 * Created by LIYAO-SZ on 2016/6/13.
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("the original method!");
    }
}