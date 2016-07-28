package State;

/**
 * Created by LIYAO-SZ on 2016/7/28.
 * 【抽象角色类】
 *      定义一个接口，用以封装环境对象的一个特定的状态所对应的行为。
 */
public interface State {

    //状态对应的处理
    public void handle(String sampleParameter);
}
