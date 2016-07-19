package Observer;

import java.util.*;

/**
 * Created by LIYAO-SZ on 2016/7/19.
 * 使用Java支持观察者模式-案例
 * 【具体观察者角色类】
 */
public class Java_Watcher implements java.util.Observer{

    public Java_Watcher(Observable o){  //拉模型结构
        o.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("状态发生改变：" + ((Java_Watched)o).getData());
    }
}
