package State;

/**
 * Created by LIYAO-SZ on 2016/7/28.
 * 【具体状态类】---恶意投票
 */
public class VoteSpiteState implements VoteState{

    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        //恶意投票，取消用户的投票资格，并取消投票记录
        String str = voteManager.getMapVote().get(user);
        if(str != null){
            voteManager.getMapVote().remove(user);
        }
        System.out.println("你有恶意刷屏行为，取消投票资格");
    }
}
