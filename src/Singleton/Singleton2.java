package Singleton;

/**
 * Created by LIYAO-SZ on 2016/5/24.
 * 懒汉模式
 */
public class Singleton2 {

    //1. 将默认构造函数私有化，不允许外界直接通过其创建多个实例
    private Singleton2(){}

    //2. 持有类的唯一实例（私有静态），此处赋值为null，目的是实现延迟加载
    private static Singleton2 instance = null;

    //3. 静态工程方法，创建实例：提供给外部用于获取实例的方法
    public static Singleton2 getInstance(){
        if(instance == null){
            instance = new Singleton2();    //随着用户获取而加载（单线程可用，多线程会出问题）
        }
        return instance;
    }
}
