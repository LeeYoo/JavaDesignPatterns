package Builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LIYAO-SZ on 2016/5/24.
 */
public class Builder {
    private List<Sender> list = new ArrayList<Sender>();

    public void produceMailSender(int count){
        for(int i=0; i<count; i++){
            list.add(new MailSender());
        }
        System.out.print(list.size());
    }

    public void produceSmsSender(int count){
        for(int i=0; i<count; i++){
            list.add(new SmsSender());
        }
        System.out.print(list.size());
    }
}
