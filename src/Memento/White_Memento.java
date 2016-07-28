package Memento;

/**
 * Created by LIYAO-SZ on 2016/7/27.
 * 【白箱实现】备忘录角色类
 *      备忘录对象将发起人对象传入的状态存储起来。
 */
public class White_Memento {

    private String state;

    public White_Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
