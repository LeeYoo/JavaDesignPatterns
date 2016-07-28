package Memento;

/**
 * Created by LIYAO-SZ on 2016/7/28.
 * 【自述历史模式实现】【发起人角色 + 负责人角色】发起人角色同时还兼任负责人角色，也就是说它自己负责保持自己的备忘录对象。
 */
public class History_Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void changeState(String state){
        this.state = state;
    }

    //返回一个新的备忘录对象
    public History_MementoIF createMemento(){
        return new Memento(this);
    }

    //将发起人恢复到备忘录对象所记录的状态上
    public void restoreMemento(History_MementoIF memento){
        Memento memento1 = (Memento)memento;
        changeState(memento1.state);
    }

    //内部类
    private class Memento implements History_MementoIF{
        private String state;

        //构造方法
        private Memento(History_Originator o){
            this.state = o.state;
        }
        private String getState() {
            return state;
        }

    }
}
