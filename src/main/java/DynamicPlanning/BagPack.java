package DynamicPlanning;

/*
 * @author: LiuGuohu
 * @company: XGLAB
 * @description: 0-1背包问题
 * @date: 2019/11/8
 */
public class BagPack {
    public int getMax(int[] wights, int w) {
        int n = wights.length;
        boolean[][] states = new boolean[n][w + 1];
        states[0][0] = true;
        if (wights[0] <= w) {
            states[0][wights[0]] = true;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= w; j++) {
                if (states[i - 1][j] == true)
                    states[i][j] = true;
            }
            for (int j = 0; j <= w - wights[i]; j++) {
                if (states[i - 1][j] == true)
                    states[i][j + wights[i]] = true;
            }
        }

        for(int i=w; w>=0; w++){
            if(states[n-1][i] == true)
                return i;
        }
        return 0;
    }
}
