package Visitor;

/**
 * Created by LIYAO-SZ on 2016/7/28.
 */
public interface Subject {

    //接受将要访问它的对象
    public void accept(Visitor visitor);

    //获取将要被访问的属性
    public String getSubject();
}
