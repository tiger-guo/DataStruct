package DynamicPlanning;

/*
 * @author: LiuGuohu
 * @company: XGLAB
 * @description: 1 3 5 最少硬币数量达到价格money
 * @date: 2019/11/8
 */
public class MinCoin {

    public int minCoin(int money){
        if(money == 1 || money == 3 || money == 5){
            return 1;
        }
        if(money <= 0)
            return Integer.MAX_VALUE;
        return 1 + Math.min(minCoin(money-1),Math.min(minCoin(money-3), minCoin(money-5)));
    }
    private static int count = 0;
    public static void main(String[] args) {
        MinCoin test = new MinCoin();
        test.getCount(9);
        System.out.println(count);
    }

    public void getCount(int money){
        if(money == 1 || money == 3 || money == 5){
            count++;
            return;
        }
        if(money <= 0)
            return;
        getCount(money-1);
        getCount(money-3);
        getCount(money-5);
    }
}
