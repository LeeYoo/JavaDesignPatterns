package Visitor;

/**
 * Created by LIYAO-SZ on 2016/7/28.
 */
public class MyVisitor implements Visitor {

    @Override
    public void visit(Subject sub) {
        System.out.println("visit the subject："+sub.getSubject());
    }
}
