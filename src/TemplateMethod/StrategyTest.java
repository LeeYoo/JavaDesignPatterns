package TemplateMethod;

/**
 * Created by LIYAO-SZ on 2016/7/19.
 * 14【模板方法模式】（行为型模式）
 *      模板方法模式是类的行为模式。准备一个抽象类，将部分逻辑以具体方法以及具体构造函数的形式实现，
 *      然后声明一些抽象方法来迫使子类实现剩余的逻辑。不同的子类可以以不同的方式实现这些抽象方法，
 *      从而【对剩余的逻辑有不同的实现。这就是模板方法模式的用意】。
 *
 * 例如：一个抽象类中，有一个主方法，再定义1...n个方法，可以是抽象的，也可以是实际的方法，定义一个类，
 *      继承该抽象类，重写抽象方法，通过调用抽象类，实现对子类的调用。
 *
 * 模板方法模式涉及到两个角色，其责任如下：
 *      抽象模板角色：定义了一个或多个抽象操作，以便让子类实现。这些抽象操作叫做基本操作，它们是一个顶级逻辑的组成步骤。
 *                  定义并实现了一个模板方法。这个模板方法一般是一个具体方法，它给出了一个顶级逻辑的骨架，
 *                  而逻辑的组成步骤在相应的抽象操作中，推迟到子类实现。顶级逻辑也有可能调用一些具体方法。
 *      具体模板角色：实现父类所定义的一个或多个抽象方法，它们是一个顶级逻辑的组成步骤。
 *                  每一个抽象模板角色都可以有任意多个具体模板角色与之对应，而每一个具体模板角色都可以给出这些抽象方法
 *                  （也就是顶级逻辑的组成步骤）的不同实现，从而使得顶级逻辑的实现各不相同。
 *
 * 模板方法中的方法可以分为两大类：模板方法和基本方法：
 *      模板方法：一个模板方法是定义在抽象类中的，把基本操作方法组合在一起形成一个总算法或一个总行为的方法。
 *               一个抽象类可以有任意多个模板方法，而不限于一个。每一个模板方法都可以调用任意多个具体方法。
 *      基本方法：
 *              抽象方法：一个抽象方法由抽象类声明，由具体子类实现。在Java语言里抽象方法以abstract关键字标示。
 *              具体方法：一个具体方法由抽象类声明并实现，而子类并不实现或置换。
 *              钩子方法：一个钩子方法由抽象类声明并实现，而子类会加以扩展。通常抽象类给出的实现是一个空实现，作为方法的默认实现。
 *
 * 总结：
 *      模板方法模式是所有模式中最为常见的几个模式之一，是基于继承的代码复用的基本技术。
 *      【模板模式的关键】在于子类可以置换掉父类的可变部分，但是子类却不可以改变模板方法所代表的顶级逻辑。
 *
 * 其他相关介绍： http://www.cnblogs.com/java-my-life/archive/2012/05/14/2495235.html
 */
public class StrategyTest {

    public static void main(String[] args) {
        String exp = "8+8";
        AbstractCalculator cal = new Plus();
        int result = cal.calculate(exp, "\\+");
        System.out.println(result);
    }
}
