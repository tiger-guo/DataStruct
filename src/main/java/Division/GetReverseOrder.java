package Division;

/*
 * @author: LiuGuohu
 * @company: XGLAB
 * @description: 求逆序度
 * @date: 2019/11/7
 */
public class GetReverseOrder {

    private int num = 0;

    public int count(int[] nums) {
        num = 0;
        mergeSortCount(nums, 0, nums.length - 1);
        return num;
    }

    private void mergeSortCount(int[] nums, int start, int end) {
        if (start >= end)
            return;
        int mid = start + (end - start) / 2;
        mergeSortCount(nums, start, mid);
        mergeSortCount(nums, mid + 1, end);
        merge(nums, start, mid, end);
    }

    private void merge(int[] nums, int start, int mid, int end) {
        int p1 = start, p2 = mid + 1;

        while (p1 <= mid && p2 <= end) {
            if (nums[p1] <= nums[p2]) {
                p1++;
            } else {
                num += (mid - p1 + 1);
                p2++;
            }
        }
    }
}
