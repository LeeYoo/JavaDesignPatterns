package Visitor;

/**
 * Created by LIYAO-SZ on 2016/7/28.
 */
public class MySubject implements Subject {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getSubject() {
        return "love";
    }
}
