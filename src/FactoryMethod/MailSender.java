package FactoryMethod;

/**
 * Created by LIYAO-SZ on 2016/5/24.
 */
public class MailSender implements Sender {

    @Override
    public void send() {
        System.out.println("this is mailsender!");
    }
}
