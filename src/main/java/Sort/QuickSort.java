package Sort;

/*
 * @author: LiuGuohu
 * @company: XGLAB
 * @description: 快排
 * @date: 2019/11/1
 */
public class QuickSort {
    // 排序算法入口
    public void sort(int[] nums) {
        quick_sort_c(nums, 0, nums.length - 1);
    }

    // 排序算法
    private void quick_sort_c(int[] nums, int start, int end) {
        if (start >= end)
            return;
        int temp = nums[start];
        int i = start, j = end;

        i = partiton(nums, temp, i, j);
        nums[start] = nums[i];
        nums[i] = temp;
        quick_sort_c(nums, start, i - 1);
        quick_sort_c(nums, i + 1, end);
    }

    // 排序核心代码
    private int partiton(int[] nums, int temp, int i, int j) {
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
        return i;
    }

    // 找第k大的元素入口
    public int findK(int[] nums, int K) {
        return quick_find_c(nums, 0, nums.length - 1, nums.length - K + 1);
    }

    // 找第k大的元素
    private Integer quick_find_c(int[] nums, int start, int end, int K) {
        int temp = nums[start];
        int i = start;
        int j = end;

        i = partiton(nums, temp, i, j);
        nums[start] = nums[i];
        nums[i] = temp;
        if (i + 1 == K)
            return nums[i];
        else if (i + 1 < K) {
            return quick_find_c(nums, j + 1, end, K);
        } else {
            return quick_find_c(nums, start, j - 1, K);
        }
    }
}
