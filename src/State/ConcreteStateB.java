package State;

/**
 * Created by LIYAO-SZ on 2016/7/28.
 * 【具体状态类】
 *      每一个具体状态类都实现了环境的一个状态所对应的行为。
 */
public class ConcreteStateB implements State {

    @Override
    public void handle(String sampleParameter) {

        System.out.println("ConcreteStateB handle ：" + sampleParameter);
    }
}
