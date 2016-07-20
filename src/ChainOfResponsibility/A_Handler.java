package ChainOfResponsibility;

/**
 * Created by LIYAO-SZ on 2016/7/20.
 * 【审批流程案例】
 * 抽象处理者角色类
 */
public abstract class A_Handler {

    /**
     * 持有下一个处理请求的对象
     */
    protected A_Handler successor = null;

    /**
     * 取值方法
     */
    public A_Handler getSuccessor() {
        return successor;
    }

    /**
     * 设置下一个处理请求的对象
     */
    public void setSuccessor(A_Handler successor) {
        this.successor = successor;
    }

    /**
     * 处理聚餐费用的申请
     * @param user    申请人
     * @param fee     申请的钱数
     * @return        成功或失败的具体通知
     */
    public abstract String handleFeeRequest(String user , double fee);
}