package FactoryMethod;

/**
 * Created by LIYAO-SZ on 2016/5/24.
 * 01【工厂方法模式】分为3种：
 *      1.  【普通工厂模式】就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建。
 *      2.  【多个工厂方法模式】是对普通工厂方法模式的改进，在普通工厂方法模式中，如果传递的字符串出错，则不能正确创建对象，
 *          而多个工厂方法模式是提供多个工厂方法，分别创建对象。
 *      3.  【静态工厂方法模式】将上面的多个工厂方法模式里的方法置为静态的，不需要创建实例，直接调用即可。
 * 举例：发送邮件和短信
 *
 * 总结：
 *      工厂模式适合：凡是出现了大量的产品需要创建，并且具有共同的接口时，可以通过工厂方法模式进行创建。在以上的三种模式中，
 *      第一种如果传入的字符串有误，不能正确创建对象，第三种相对于第二种，不需要实例化工厂类，
 *      所以，大多数情况下，我们会选用第三种——静态工厂方法模式。
 *
 *  弊端：
 *      工厂方法模式有一个问题就是，类的创建依赖工厂类，也就是说，如果想要拓展程序，必须对工厂类进行修改，这违背了闭包原则，
 *      所以，从设计角度考虑，有一定的问题，如何解决？就用到抽象工厂模式，创建多个工厂类，这样一旦需要增加新的功能，
 *      直接增加新的工厂类就可以了，不需要修改之前的代码。因为抽象工厂不太好理解，我们先看看图，然后就和代码，就比较容易理解。
 *      参考 02【抽象工厂模式】
 */
public class FactoryTest {
    public static void main(String[] args) {

        //普通工厂模式
        /*SendFactory factory = new SendFactory();
        Sender sender = factory.produce("sms");
        sender.send();*/

        //多个工厂方法模式
        /*SendFactory factory = new SendFactory();
        Sender sender = factory.produceMail();
        sender.send();*/

        //静态工厂方法模式
        Sender sender = SendFactory.produceMail();
        sender.send();
    }
}
