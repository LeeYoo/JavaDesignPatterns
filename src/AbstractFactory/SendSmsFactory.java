package AbstractFactory;

/**
 * Created by LIYAO-SZ on 2016/5/24.
 */
public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
