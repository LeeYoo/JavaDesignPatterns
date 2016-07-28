package Mediator;

/**
 * Created by LIYAO-SZ on 2016/7/28.
 */
public class User2 extends User {

    public User2(Mediator mediator){
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user2 exe!");
    }
}
