package Search;

/*
 * @author: LiuGuohu
 * @company: XGLAB
 * @description: 查找第一个小于等于给定值的下标
 * @date: 2019/11/1
 */
public class SearchLastLessVal {


    public int searchVal(int[] nums, int val) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + ((high - low) >> 2);
            if (nums[mid] <= val) {
                if (mid == nums.length - 1 || nums[mid + 1] > val) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
