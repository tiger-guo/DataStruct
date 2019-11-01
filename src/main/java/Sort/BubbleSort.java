package Sort;

/*
 * @author: LiuGuohu
 * @company: XGLAB
 * @description: 冒泡排序
 * @date: 2019/10/31
 */
public class BubbleSort {

    public void sort(int[] a, int n) {
        if (n <= 1)
            return;
        for (int i = 0; i < n; ++i) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; ++j) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag)
                break;
        }
    }
}
