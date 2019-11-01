package Search;

/*
 * @author: LiuGuohu
 * @company: XGLAB
 * @description: 查找最后一个等于val的值
 * @date: 2019/11/1
 */
public class SearchLastVal {

    public int searchVal(int[] nums, int val) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 2);
            if (nums[mid] <= val) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (high != -1 && nums[high] == val)
            return high;
        else
            return -1;
    }

    public int searchVal_Simple(int[] nums, int val) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 2);
            if (nums[mid] < val) {
                low = mid + 1;
            } else if (nums[mid] > val) {
                high = mid - 1;
            } else {
                if (mid == nums.length - 1 || nums[mid + 1] != val)
                    return mid;
                else
                    low = mid + 1;
            }
        }

        return -1;
    }
}
