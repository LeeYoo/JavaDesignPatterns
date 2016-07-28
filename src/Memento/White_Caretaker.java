package Memento;

/**
 * Created by LIYAO-SZ on 2016/7/27.
 * 【白箱实现】负责人角色类
 *      负责人角色负责保存备忘录对象，但是从不修改（甚至不查看）备忘录对象的内容。
 */
public class White_Caretaker {

    private White_Memento memento;

    //备忘录的取值方法
    public White_Memento retrieveMemento(){
        return this.memento;
    }

    //备忘录的赋值方法
    public void saveMemento(White_Memento memento){
        this.memento = memento;
    }
}
