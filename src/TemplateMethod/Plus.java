package TemplateMethod;

/**
 * Created by LIYAO-SZ on 2016/7/19.
 * 具体模板角色：继承抽象类，实现其抽象方法
 */
public class Plus extends AbstractCalculator {

    @Override
    public int calculate(int num1, int num2) {
        return num1 + num2;
    }
}
