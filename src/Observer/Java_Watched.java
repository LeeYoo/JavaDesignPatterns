package Observer;

import java.util.Observable;

/**
 * Created by LIYAO-SZ on 2016/7/19.
 * 使用Java支持观察者模式-案例
 * 【具体主题角色类】
 */
public class Java_Watched extends Observable {

    private String data = "";

    public String getData(){
        return data;
    }

    public void setData(String data) {

        if(!this.data.equals(data)){
            this.data = data;
            setChanged();   //setChanged()被调用之后会设置一个内部标记变量，代表被观察者对象的状态发生了变化
        }
        notifyObservers();  //notifyObservers()被调用时，会调用所有登记过的观察者对象的update()方法，使这些观察者对象可以更新自己。
    }
}
