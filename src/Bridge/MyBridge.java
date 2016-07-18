package Bridge;

/**
 * Created by LIYAO-SZ on 2016/7/18.
 */
public class MyBridge extends Bridge {

    public void method(){
        getSourceable().method();
    }
}
