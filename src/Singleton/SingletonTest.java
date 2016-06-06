package Singleton;

/**
 * Created by LIYAO-SZ on 2016/5/24.
 * 03【单例模式】（创建型模式）：在Java应用中，单例对象能保证在一个JVM中，该对象只有一个实例存在。
 * 分为两种类型：
 *      1. 饿汉模式：加载类的速度比较慢，但运行时获取对象的速度比较快，线程安全。
 *      2. 懒汉模式：加载类的速度比较快，但运行时获取对象的速度比较慢，线程不安全
 */
public class SingletonTest {
    public static void main(String[] args) {

        //饿汉模式
        Singleton1 s1 = Singleton1.getInstance();
        Singleton1 s2 = Singleton1.getInstance();
        if (s1 == s2){
            //输出
            System.out.println("S1和S2是同一个实例");
        }else {
            System.out.println("S1和S2不是同一个实例");
        }

        //懒汉模式
        Singleton1 s3 = Singleton1.getInstance();
        Singleton1 s4 = Singleton1.getInstance();
        if (s3 == s4){
            //输出
            System.out.println("S3和S4是同一个实例");
        }else {
            System.out.println("S3和S4不是同一个实例");
        }
    }
}
