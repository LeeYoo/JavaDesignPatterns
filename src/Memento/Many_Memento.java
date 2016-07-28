package Memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LIYAO-SZ on 2016/7/28.
 * 【多检查点实现】备忘录角色
 *      这个实现可以存储任意多的状态，外界可以使用检查点指数index来取出检查点上的状态。
 */
public class Many_Memento {

    private List<String> states;
    private int index;

    //构造函数
    public Many_Memento(List<String> states , int index){
        this.states = new ArrayList<String>(states);
        this.index = index;
    }
    public List<String> getStates() {
        return states;
    }
    public int getIndex() {
        return index;
    }
}
