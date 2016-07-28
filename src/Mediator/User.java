package Mediator;

/**
 * Created by LIYAO-SZ on 2016/7/28.
 */
public abstract class User {

    private Mediator mediator;

    public User(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    //工作方法
    public abstract void work();
}
