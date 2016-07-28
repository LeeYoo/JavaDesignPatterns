package Memento;

/**
 * Created by LIYAO-SZ on 2016/7/27.
 * 【黑箱实现】负责人角色类
 *      能够得到的备忘录对象是以MementoIF为接口的，由于这个接口仅仅是一个标识接口，因此负责人角色不可能改变这个备忘录对象的内容。
 */
public class Black_Caretaker {

    private Black_MementoIF memento;

    //备忘录取值方法
    public Black_MementoIF retrieveMemento(){
        return memento;
    }

    //备忘录复制方法
    public void saveMemento(Black_MementoIF memento){
        this.memento = memento;
    }
}
