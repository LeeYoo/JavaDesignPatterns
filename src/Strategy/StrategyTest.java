package Strategy;

/**
 * Created by LIYAO-SZ on 2016/7/19.
 * 13【策略模式】（行为型模式）【又称：算法簇模式】
 *      策略模式属于对象行为型模式，主要针对一组算法，将每一个算法封装到具有共同接口的独立的类中，从而使得它们可以相互替换。
 *      策略模式使得算法可以在不影响到客户端的情况下发生变化。通常，策略模式适用于当一个应用程序需要实现一种特定的服务或者功能，
 *      而且该程序有多种实现方式时使用。
 *
 * 策略模式涉及到三个角色：
 *      环境角色：持有一个Strategy的引用。
 *      抽象策略角色：这是一个抽象的角色，通常是由一个接口或是抽象类实现，此角色给出了所有的具体策略类所需要的接口。
 *      具体策略角色：包装了详细的算法或行为。
 *
 * 总结：
 *      策略模式的决定权在用户，系统本身提供不同算法的实现，新增或者删除算法，对各种算法做封装。因此，策略模式多用在算法决策系统中，
 *      外部用户只需要决定用哪个算法即可。
 *
 * 其他相关介绍： http://www.cnblogs.com/java-my-life/archive/2012/05/10/2491891.html
 */
public class StrategyTest {

    public static void main(String[] args) {

        Context context;

        //策略一
        context = new Context(new BackDoor());
        context.operate();

        //策略二
        context = new Context(new GivenGreenLight());
        context.operate();

        //策略三
        context = new Context(new BlackEnemy());
        context.operate();
    }
}
