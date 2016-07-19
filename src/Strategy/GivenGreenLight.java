package Strategy;

/**
 * Created by LIYAO-SZ on 2016/7/19.
 * 【具体策略角色】
 * 策略二：求吴国太开个绿灯。
 */
public class GivenGreenLight implements IStrategy {

    @Override
    public void operate() {
        System.out.println("求吴国太开个绿灯，放行！");
    }
}
