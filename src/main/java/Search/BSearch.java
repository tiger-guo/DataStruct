package Search;

/*
 * @author: LiuGuohu
 * @company: XGLAB
 * @description: 二分查找
 * @date: 2019/11/1
 */
public class BSearch {

    // 非递归实现
    public int bsearch_while(int[] a, int n, int value) {
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == value) {
                return mid;
            } else if (a[mid] < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public int bsearch_Recursive(int[] nums, int n, int val) {
        return bserchInternally(nums, 0, n - 1, val);
    }

    private int bserchInternally(int[] nums, int low, int high, int value) {
        if (low > high)
            return -1;

        int mid = low + ((high - low) >> 1);
        if (nums[mid] == value) {
            return mid;
        } else if (nums[mid] < value) {
            return bserchInternally(nums, mid + 1, high, value);
        } else {
            return bserchInternally(nums, low, mid - 1, value);
        }
    }

}
