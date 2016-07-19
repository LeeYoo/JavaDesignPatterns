package Strategy;

/**
 * Created by LIYAO-SZ on 2016/7/19.
 * 【环境角色】存放妙计的锦囊
 */
public class Context {

    //持有一个具体策略的对象
    private IStrategy strategy;

    //构造函数，传入一个具体策略对象
    public Context(IStrategy strategy){
        this.strategy = strategy;
    }

    //策略方法
    public void operate(){
        strategy.operate();
    }
}
