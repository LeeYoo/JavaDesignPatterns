package Singleton;

/**
 * Created by LIYAO-SZ on 2016/5/24.
 * 饿汉模式
 */
public class Singleton1 {

    //1. 将默认构造函数私有化，不允许外界直接通过其创建多个实例
    private Singleton1(){}

    //2. 自己创建实例（本类的唯一实例）,使用private static
    private static Singleton1 instance = new Singleton1();    //static类型的随着类的加载而加载

    //3. 提供给外部用于获取实例的方法，使用public static
    public static Singleton1 getInstance(){
        return instance;
    }
}
