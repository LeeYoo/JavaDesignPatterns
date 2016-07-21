package Command;

/**
 * Created by LIYAO-SZ on 2016/7/20.
 * 【客户端角色】由茱丽小女孩扮演
 */
public class A_Julia {

    public static void main(String[]args){
        //创建接收者对象
        A_AudioPlayer audioPlayer = new A_AudioPlayer();
        //创建命令对象
        A_Command playCommand = new A_PlayCommand(audioPlayer);
        A_Command rewindCommand = new A_RewindCommand(audioPlayer);
        A_Command stopCommand = new A_StopCommand(audioPlayer);
        //创建请求者对象
        A_Keypad keypad = new A_Keypad();
        keypad.setPlayCommand(playCommand);
        keypad.setRewindCommand(rewindCommand);
        keypad.setStopCommand(stopCommand);
        //测试
        keypad.play();
        keypad.rewind();
        keypad.stop();
        keypad.play();
        keypad.stop();
    }
}
