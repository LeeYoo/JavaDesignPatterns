package Observer;

/**
 * Created by LIYAO-SZ on 2016/7/19.
 * 【具体观察者角色类】
 *      存储与主题的状态自恰的状态。具体观察者角色实现抽象观察者角色所要求的更新接口，以便使本身的状态与主题的状态相互协调。
 *      如果需要，具体观察者角色可以保持一个指向具体主题对象的引用。
 */
public class Observer1 implements Observer {

    //观察者的状态
    private String observerState;

    @Override
    public void update(String state) {
        //更新观察者的状态，使其与目标的状态保持一致
        observerState = state;
        System.out.println("状态为："+observerState);
    }


    //拉模型
    /*@Override
    public void update(Subject subject) {
        observerState = ((MySubject)subject).getState();
        System.out.println("观察者状态为："+observerState);
    }*/
}
