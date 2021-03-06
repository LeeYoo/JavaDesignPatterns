package Command;

/**
 * Created by LIYAO-SZ on 2016/7/20.
 * 【具体命令角色类】
 */
public class A_PlayCommand implements A_Command{

    private A_AudioPlayer myAudio;

    public A_PlayCommand(A_AudioPlayer audioPlayer){
        myAudio = audioPlayer;
    }
    /**
     * 执行方法
     */
    @Override
    public void execute() {
        myAudio.play();
    }
}
