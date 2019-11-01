package Sort;

/*
 * @author: LiuGuohu
 * @company: XGLAB
 * @description: 快排
 * @date: 2019/11/1
 */
public class QuickSort {
    public void sort(int[] nums) {
        quick_sort_c(nums, 0, nums.length-1);
    }

    private void quick_sort_c(int[] nums, int start, int end) {
        if (start >= end)
            return;
        int temp = nums[start];
        int i = start, j = end;
        while (i < j) {
            while (temp <= nums[j] && i < j) {
                j--;
            }
            while (temp >= nums[i] && i < j) {
                i++;
            }
            if (i < j) {
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
            }
        }
        nums[start] = nums[i];
        nums[i] = temp;
        quick_sort_c(nums, start, j - 1);
        quick_sort_c(nums, j + 1, end);
    }
}
