package AbstractFactory;

/**
 * Created by LIYAO-SZ on 2016/5/24.
 */
public class SendMailFactory implements Provider{

    @Override
    public Sender produce() {
        return new MailSender();
    }
}
