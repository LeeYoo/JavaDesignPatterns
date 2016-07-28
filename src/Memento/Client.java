package Memento;

/**
 * Created by LIYAO-SZ on 2016/7/21.
 * 19【备忘录模式】（行为型模式），又称为快照模式、Token模式。
 *      备忘录对象是一个用来存储另外一个对象内部状态的快照的对象。备忘录模式的用意是在不破坏封装的条件下，将一个对象的状态捕捉(Capture)住，
 *      并外部化，存储起来，从而可以在将来合适的时候把这个对象还原到存储起来的状态。备忘录模式常常与命令模式和迭代子模式一同使用。
 *
 * 备忘录模式所涉及有三个角色：
 *      备忘录角色：
 *          将发起人对象的内部状态存储起来。备忘录可以根据发起人对象的判断来决定存储多少发起人对象的内部状态。
 *          备忘录可以保护其内容不被发起人对象之外的任何对象所读取。
 *          【窄接口】：负责人对象（和其他除发起人对象之外的任何对象）看到的是备忘录的窄接口，这个窄接口只允许它把备忘录对象传给其他的对象。
 *          【宽接口】：与负责人对象看到的窄接口相反的是，发起人对象可以看到一个宽接口(wide interface)，这个宽接口允许它读取所有的数据，
 *                     以便根据这些数据恢复这个发起人对象的内部状态。
 *      发起人角色：
 *          1. 创建一个含有当前的内部状态的备忘录对象。2. 使用备忘录对象存储其内部状态。
 *      负责人角色：
 *          1. 负责保存备忘录对象。2. 不检查备忘录对象的内容。
 *
 *  【备忘录模式的实现】：白箱实现、黑箱实现、多重箭差点实现、自述历史模式实现（最流行）
 *      白箱备忘录模式实现：
 *          1. 备忘录角色对任何对象都提供一个接口，即宽接口，备忘录角色的内部所存储的状态就对所有对象公开。因此这个实现又叫做“白箱实现”。
 *          2. “白箱”实现将发起人角色的状态存储在一个大家都看得到的地方，因此是破坏封装性的。但是通过程序员自律，
 *             同样可以在一定程度上实现模式的大部分用意。因此白箱实现仍然是有意义的。
 *
 *      黑箱备忘录模式实现：
 *          1. 备忘录角色对发起人（Originator）角色对象提供一个宽接口，而为其他对象提供一个窄接口。这样的实现叫做“黑箱实现”。
 *          2. 在JAVA语言中，实现双重接口的办法就是【将备忘录角色类设计成发起人角色类的内部成员类】。
 *             将Memento设成Originator类的内部类，从而将Memento对象封装在Originator里面；
 *             在外部提供一个标识接口MementoIF给Caretaker以及其他对象。
 *             这样，Originator类看到的是Menmento的所有接口，而Caretaker以及其他对象看到的仅仅是标识接口MementoIF所暴露出来的接口。
 *
 *      多重箭差点实现：
 *          前面所给出的白箱和黑箱的示意性实现都是只存储一个状态的简单实现，也可以叫做只有一个检查点。
 *          常见的系统往往需要存储不止一个状态，而是需要存储多个状态，或者叫做有多个检查点。
 *          备忘录模式可以将发起人对象的状态存储到备忘录对象里面，备忘录模式可以将发起人对象恢复到备忘录对象所存储的某一个检查点上。
 *          下面给出一个示意性的、有多重检查点的备忘录模式的实现。
 *
 *      自述历史模式实现：（最流行）
 *          所谓“自述历史”模式，实际上就是备忘录模式的一个变种。在备忘录模式中，发起人角色、负责人角色和备忘录角色都是独立的角色。
 *          虽然在实现上备忘录类可以成为发起人类的内部成员类，但是备忘录类仍然保持作为一个角色的独立意义。
 *          在“自述历史”模式里面，（发起人角色自己兼任负责人角色）。
 *              备忘录角色：
 *                  1. 将发起人对象的内部状态存储起来。
 *                  2. 备忘录可以保护其内容不被发起人对象之外的任何对象所读取。
 *              发起人角色：
 *                  1. 创建一个含有它当前的内部状态的备忘录对象。
 *                  2. 使用备忘录对象存储其内部状态。
 *
 *
 */
public class Client {

    public static void main(String[] args){
        //------------【白箱实现】------------
        White_Originator originator = new White_Originator();
        White_Caretaker caretaker = new White_Caretaker();
        originator.setState("on");  //设置发起人对象的状态
        caretaker.saveMemento(originator.createMemento());  //创建备忘录对象，并通过负责人角色将发起人对象的状态储存到备忘录
        originator.setState("off"); //修改发起人的状态
        originator.restoreMemento(caretaker.retrieveMemento()); //恢复发起人对象的状态
        System.out.print(originator.getState());

        //------------【黑箱实现】------------
        Black_Originator o = new Black_Originator();
        Black_Caretaker c = new Black_Caretaker();
        o.setState("on");       //设置负责人对象的状态
        c.saveMemento(o.createMemento());       //创建备忘录对象，并通过负责人角色将发起人对象的状态储存到备忘录
        o.setState("Off");      //修改发起人对象的状态
        o.restoreMemento(c.retrieveMemento());      //恢复发起人对象的状态【注意c无法读出备忘录中的state，而o可以】
        System.out.print(o.getState());

        //------------【多重检查点实现】------------
        Many_Originator oo = new Many_Originator();
        Many_Caretaker cc = new Many_Caretaker(oo);
        oo.setState("state 0");      //设置负责人对象的状态
        cc.createMemento();          //建立一个检查点
        oo.setState("state 1");      //改变状态
        cc.createMemento();          //建立一个检查点
        oo.setState("state 2");      //改变状态
        cc.createMemento();          //建立一个检查点
        oo.setState("state 3");      //改变状态
        cc.createMemento();          //建立一个检查点
        oo.printStates();            //打印出所有检查点
        System.out.println("-----------------恢复检查点-----------------");
        //恢复到第二个检查点
        cc.restoreMemento(2);
        //打印出所有检查点
        oo.printStates();

        //------------【自述历史模式实现】------------
        History_Originator ho = new History_Originator();
        ho.changeState("state 0");    //设置负责人对象的状态
        History_MementoIF hf = ho.createMemento();      //创建备忘录
        ho.changeState("state 1");    //改变状态
        ho.restoreMemento(hf);        //按照备忘录恢复对象的状态
    }

}
