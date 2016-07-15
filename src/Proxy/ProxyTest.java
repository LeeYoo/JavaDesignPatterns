package Proxy;

/**
 * Created by LIYAO-SZ on 2016/7/15.
 */
public class ProxyTest {

    public static void main(String[] args) {
        Sourceable source = new Proxy();
        source.method();
    }
}
