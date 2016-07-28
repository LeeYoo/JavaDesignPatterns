package Memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LIYAO-SZ on 2016/7/28.
 * 【多检查点实现】负责人角色
 */
public class Many_Caretaker {

    private Many_Originator o;
    private List<Many_Memento> mementos = new ArrayList<Many_Memento>();
    private int current;

    //构造函数
    public Many_Caretaker(Many_Originator o){
        this.o = o;
        current = 0;
    }

    //创建一个新的检查点
    public int createMemento(){
        Many_Memento memento = o.createMemento();
        mementos.add(memento);
        return current++;
    }

    //将发起人恢复到某个检查点
    public void restoreMemento(int index){
        Many_Memento memento = mementos.get(index);
        o.restoreMemento(memento);
    }

    //将某个检查点删除
    public void removeMemento(int index){
        mementos.remove(index);
    }
}
