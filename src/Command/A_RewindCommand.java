package Command;

/**
 * Created by LIYAO-SZ on 2016/7/20.
 * 【具体命令角色类】
 */
public class A_RewindCommand implements A_Command {

    private A_AudioPlayer myAudio;

    public A_RewindCommand(A_AudioPlayer audioPlayer){
        myAudio = audioPlayer;
    }
    @Override
    public void execute() {
        myAudio.rewind();
    }
}
