import NumbersProblem.NumIntegerPower;
import StringDemo.SpaceReplace;

import java.util.*;

/*
 * @author: LiuGuohu
 * @company: XGLAB
 * @description:
 * @date: 2019/10/31
 */
public class Test {

    public static void main(String[] args) {
        getPermutation_2(4,9);

    }

    public static String getPermutation_2(int n, int k) {
        StringBuilder sb = new StringBuilder();
        //每个阶层的值
        int factor[]={1,1,2,6,24,120,720,5040,40320};
        List<Integer> list = new LinkedList<>();
        list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);list.add(6);list.add(7);list.add(8);list.add(9);
        //从第一位开始算每一位的值
        for(int i = n; i > 0; i--) {
            //这是每一位的值所在的具体位置
            /**
             * 举个例子：4，9
             * 具体第一位的排列是
             * 1xxx、2xxx、3xxx、4xxx
             * 这四种情况每一种的所得到的情况数都是3!，数目都是一样的
             * 所以我们可以用k/(n-1)!由此得知首位的值的情况
             *对应代码也就是这三行
             * int sv = k / factor[i - 1];
             * k = k % factor[i - 1];
             * sv = k > 0 ? sv + 1 : sv;如果取余大于0就对应在前面一个，和分页原理一样
             *接着我们循环计算第二的情况，前一位的余数就是第二位对应的k值
             * 以此循环得到所有的位置的值
             * */
            int sv = k / factor[i - 1];
            k = k % factor[i - 1];
            sv = k > 0 ? sv + 1 : sv;
            if (k == 0) k = factor[i - 1];
            sb.append(list.remove(sv - 1));
        }
        return sb.toString();
    }

}
