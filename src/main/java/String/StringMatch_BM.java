package String;

import java.util.concurrent.ForkJoinPool;

/*
 * @author: LiuGuohu
 * @company: XGLAB
 * @description: 字符串匹配 BM算法
 * @date: 2019/11/6
 */
public class StringMatch_BM {

    // string 主串 str 模式串
    // ASCII总数
    public static final int SIZE = 256;

    private void generateBC(char[] str, int m, int[] ascii) {
        for (int i = 0; i < SIZE; i++) {
            ascii[i] = -1;
        }

        for (int i = 0; i < m; i++) {
            int c = (int) str[i];
            ascii[c] = i;
        }
    }

    private void generateGS(char[] str, int m, int[] suffix, boolean[] prefix) {
        for (int i = 0; i < m; i++) {
            suffix[i] = -1;
            prefix[i] = false;
        }
        for (int i = 0; i < m - 1; i++) {
            int j = i;
            int k = 0;
            while (j >= 0 && str[j] == str[m - 1 - k]) {
                --j;
                ++k;
                suffix[k] = j + 1;
            }
            if (j == -1)
                prefix[k] = true;
        }
    }

    public int bm(char[] string, int n, char[] str, int m) {
        // 坏字符规则构建
        int[] ascii = new int[SIZE];
        generateBC(str, str.length, ascii);
        // 好后缀规则构建
        int[] suffix = new int[m];
        boolean[] prefix = new boolean[m];
        generateGS(str, m, suffix, prefix);

        int i = 0;
        while (i <= n - m) {
            // 通过坏字符计算移动位置
            int j;
            for (j = m - 1; j >= 0; --j) {
                if (string[i + j] != str[j])
                    break;
            }
            if (j < 0)
                return i;
            int x = i + (j - ascii[(int) string[i + j]]);

            // 通过好后缀计算移动位置
            int y = 0;
            if (j < m - 1) {
                y = moveByGS(j, m, suffix, prefix);
            }
            i = i + Math.max(x, y);
        }
        return -1;
    }

    private int moveByGS(int j, int m, int[] suffix, boolean[] prefix) {
        int k = m-1-j;
        if(suffix[k] != -1)
            return j-suffix[k] + 1;
        for(int r = j+2; r<=m-1; ++r){
            if(prefix[m-r] == true){
                return r;
            }
        }
        return m;
    }
}
