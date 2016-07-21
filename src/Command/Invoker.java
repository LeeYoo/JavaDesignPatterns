package Command;

/**
 * Created by LIYAO-SZ on 2016/7/20.
 * 【请求者角色类】
 */
public class Invoker {

    /**
     * 持有命令对象
     */
    private Command command = null;

    /**
     * 构造方法
     */
    public Invoker(Command command){
        this.command = command;
    }

    /**
     * 行动方法
     */
    public void action(){

        command.execute();
    }
}
