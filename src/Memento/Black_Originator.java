package Memento;

/**
 * Created by LIYAO-SZ on 2016/7/27.
 * 【黑箱实现】发起人角色类
 *      内部定义了一个内部的Memento类。由于此Memento类的全部接口都是私有的，因此只有它自己和发起人类可以调用。
 */
public class Black_Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //工厂方法，返回一个新的备忘录对象
    public Black_MementoIF createMemento(){
        return new Memento(state);
    }

    //将发起人恢复到备忘录对象所记载的状态
    public void restoreMemento(Black_MementoIF memento){
        this.setState(((Memento)memento).getState());
    }

    //内部类
    private class Memento implements Black_MementoIF{

        private String state;

        private Memento(String state){
            this.state = state;
        }

        private String getState() {
            return state;
        }
        private void setState(String state) {
            this.state = state;
        }
    }
}
