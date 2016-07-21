package Command;

/**
 * Created by LIYAO-SZ on 2016/7/20.
 * 18【命令模式】（行为型模式）
 *      命令模式属于对象的行为模式。命令模式又称为【行动模式】或【交易模式】。
 *      命令模式是对命令的封装。命令模式把发出命令的责任和执行命令的责任分割解耦，委派给不同的对象。
 *      命令模式把一个请求或者操作封装到一个对象中。命令模式允许系统使用不同的请求把客户端参数化，
 *      对请求排队或者记录请求日志，可以提供命令的撤销和恢复功能。
 *
 *  命令模式涉及到五个角色：
 *      客户端角色：创建一个具体命令对象并确定其接收者。
 *      命令角色：声明了一个给所有具体命令类的抽象接口。
 *      具体命令角色：定义一个接收者和行为之间的弱耦合；实现execute()方法，负责调用接收者的相应操作。execute()方法通常叫做执行方法。
 *      请求者角色：负责调用命令对象执行请求，相关的方法叫做行动方法。
 *      接受者角色：负责具体实施和执行一个请求。任何一个类都可以成为接收者，实施和执行请求的方法叫做行动方法。
 *
 *  宏命令：简单点说就是包含多个命令的命令，是一个命令的组合。可以将多个命令连在一起依次执行。
 *
 *  其余参考资料：http://www.cnblogs.com/java-my-life/archive/2012/06/01/2526972.html
 */
public class Client {
    public static void main(String[] args) {

        //创建接收者
        Receiver receiver = new Receiver();

        //创建命令对象，设定它的接收者
        Command command = new ConcreteCommand(receiver);

        //创建请求者，把命令对象设置进去
        Invoker invoker = new Invoker(command);

        //执行方法
        invoker.action();
    }
}
