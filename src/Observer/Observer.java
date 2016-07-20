package Observer;

/**
 * Created by LIYAO-SZ on 2016/7/19.
 * 【抽象观察者角色类】
 *      为所有的具体观察者定义一个接口，在得到主题的通知时更新自己，这个接口叫做更新接口。
 */
public interface Observer {

    //更新接口（更新的状态）
    public void update(String state);

    //拉模型（传递的就是主题对象自身）
    //public void update(Subject subject);
}