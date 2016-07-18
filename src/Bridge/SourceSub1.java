package Bridge;

/**
 * Created by LIYAO-SZ on 2016/7/18.
 */
public class SourceSub1 implements Sourceable {

    @Override
    public void method() {
        System.out.println("this is the first sub!");
    }
}
