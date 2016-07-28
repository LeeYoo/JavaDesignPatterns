package Mediator;

/**
 * Created by LIYAO-SZ on 2016/7/28.
 */
public class User1 extends User {

    public User1(Mediator mediator){
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user1 exe!");
    }
}
