package Strategy;

/**
 * Created by LIYAO-SZ on 2016/7/19.
 * 【抽象策略角色】
 * 统一接口，提供统一的方法
 * 首先定义一个策略接口，这是诸葛亮老人家给赵云的三个锦囊妙计的接口。
 */
public interface IStrategy {

    //策略方法：每个锦囊妙计都是一个可执行的算法。
    public void operate();
}
