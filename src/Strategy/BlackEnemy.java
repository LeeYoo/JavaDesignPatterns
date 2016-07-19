package Strategy;

/**
 * Created by LIYAO-SZ on 2016/7/19.
 * 【具体策略角色】
 * 策略三：孙夫人断后，挡住追兵。
 */
public class BlackEnemy implements IStrategy {

    @Override
    public void operate() {
        System.out.println("孙夫人断后，挡住追兵...");
    }
}
