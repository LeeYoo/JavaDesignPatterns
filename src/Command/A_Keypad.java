package Command;

/**
 * Created by LIYAO-SZ on 2016/7/20.
 * 【请求者角色】由键盘类扮演
 */
public class A_Keypad {

    private A_Command playCommand;
    private A_Command rewindCommand;
    private A_Command stopCommand;

    public void setPlayCommand(A_Command playCommand) {
        this.playCommand = playCommand;
    }
    public void setRewindCommand(A_Command rewindCommand) {
        this.rewindCommand = rewindCommand;
    }
    public void setStopCommand(A_Command stopCommand) {
        this.stopCommand = stopCommand;
    }
    /**
     * 执行播放方法
     */
    public void play(){
        playCommand.execute();
    }
    /**
     * 执行倒带方法
     */
    public void rewind(){
        rewindCommand.execute();
    }
    /**
     * 执行播放方法
     */
    public void stop(){
        stopCommand.execute();
    }
}
