package Backtracking;

/*
 * @author: LiuGuohu
 * @company: XGLAB
 * @description: 回溯解决0-1背包
 * @date: 2019/11/8
 */
public class BackPack {
    private int maxW = Integer.MIN_VALUE;
    public void f(int n, int[] nums,int cw, int w){
        if(n == nums.length || cw==w){
            if(maxW<cw)
                maxW = cw;
        }
        f(n+1,nums,cw,w);
        if(cw + nums[n]<=w){
            f(n+1,nums,cw+nums[n],w);
        }
    }
}
