package Memento;

/**
 * Created by LIYAO-SZ on 2016/7/27.
 * 【白箱实现】发起人脚色类
 *      发起人角色利用一个新创建的备忘录对象将自己的内部状态存储起来。
 */
public class White_Originator {
    private String state;

    //工厂方法，返回一个新的备忘录对象
    public White_Memento createMemento(){
        return new White_Memento(state);
    }

    //将发起人恢复到备忘录对象所记载的状态
    public void restoreMemento(White_Memento memento){
        this.state = memento.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
