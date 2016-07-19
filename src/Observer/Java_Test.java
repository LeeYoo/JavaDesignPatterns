package Observer;

/**
 * Created by LIYAO-SZ on 2016/7/19.
 * 【使用Java支持观察者模式-案例】
 */
public class Java_Test {
    public static void main(String[] args) {

        //创建被观察者对象（具体主题角色）
        Java_Watched watched = new Java_Watched();
        //创建观察者对象（具体观察者角色），并将被观察者对象登记注册
        java.util.Observer watcher = new Java_Watcher(watched);
        //给被观察者状态赋值
        watched.setData("start");
        watched.setData("run");
        watched.setData("stop");

    }
}
