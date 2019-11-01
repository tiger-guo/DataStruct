package Search;

/*
 * @author: LiuGuohu
 * @company: XGLAB
 * @description: 查找第一次出现的值的下标
 * @date: 2019/11/1
 */
public class SearchFirstVal {

    public int SearchVal(int[] nums, int val) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 2);
            if (nums[mid] >= val) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (low < nums.length && nums[low] == val)
            return low;
        else
            return -1;
    }

    public int SearchVal_Simple(int[] nums, int val) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 2);
            if (nums[mid] > val) {
                high = mid - 1;
            } else if(nums[mid] < val){
                low = mid + 1;
            }else {
                if(mid == 0 || nums[mid-1]!=val)
                    return mid;
                else
                    high = mid -1;
            }
        }

        return -1;
    }
}
