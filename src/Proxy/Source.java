package Proxy;

/**
 * Created by LIYAO-SZ on 2016/7/15.
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("the original method!");
    }
}
