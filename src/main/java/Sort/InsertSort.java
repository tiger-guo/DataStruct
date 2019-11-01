package Sort;

/*
 * @author: LiuGuohu
 * @company: XGLAB
 * @description:
 * @date: 2019/11/1
 */
public class InsertSort {

    public void sort(int[] nums, int n) {
        if (n <= 1)
            return;

        for (int i = 1; i < n; i++) {
            int data = nums[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (nums[j] > data) {
                    nums[j + 1] = nums[j];
                } else {
                    break;
                }
            }
            nums[j + 1] = data;
        }
    }
}
