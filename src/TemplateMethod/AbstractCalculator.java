package TemplateMethod;

/**
 * Created by LIYAO-SZ on 2016/7/19.
 * 抽象模板角色
 */
public abstract class AbstractCalculator {

    /*主方法（模板方法），实现对本类其它方法的调用*/
    public final int calculate(String exp,String opt){
        int array[] = split(exp,opt);
        return calculate(array[0],array[1]);
    }

    //基本方法的声明（由子类实现）被子类重写的方法，可以被不同的子类进行多种实现
    abstract public int calculate(int num1,int num2);

    //基本方法（已经实现）
    public int[] split(String exp,String opt){
        String array[] = exp.split(opt);
        int arrayInt[] = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);
        return arrayInt;
    }
}
