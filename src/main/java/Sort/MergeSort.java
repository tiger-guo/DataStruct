package Sort;

/*
 * @author: LiuGuohu
 * @company: XGLAB
 * @description: 归并排序
 * @date: 2019/11/1
 */
public class MergeSort {
    public void sort(int[] nums) {
        merge_sort_c(nums, 0, nums.length - 1);
    }

    private void merge_sort_c(int[] nums, int start, int end) {
        if (start >= end)
            return;
        int mid = start + (end - start) / 2;
        merge_sort_c(nums, start, mid);
        merge_sort_c(nums, mid + 1, end);
        merge(nums, start, mid, end);
    }

    private void merge(int[] nums, int start, int mid, int end) {
        int[] tmp = new int[nums.length];
        int p1 = start, p2 = mid + 1, k = start;

        while (p1 <= mid && p2 <= end) {
            if (nums[p1] <= nums[p2])
                tmp[k++] = nums[p1++];
            else
                tmp[k++] = nums[p2++];
        }
        while(p1<=mid)
            tmp[k++] = nums[p1++];
        while (p2<=end)
            tmp[k++] = nums[p2++];

        for(int i=start; i<=end; i++)
            nums[i] = tmp[i];
    }
}
