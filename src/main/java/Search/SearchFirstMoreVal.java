package Search;

/*
 * @author: LiuGuohu
 * @company: XGLAB
 * @description: 查找第一个大于等于val的下标
 * @date: 2019/11/1
 */
public class SearchFirstMoreVal {

    public int searchVal(int[] nums, int val){
        int low=0;
        int high=nums.length;

        while (low<=high){
            int mid = low + ((high - low )>>2);
            if(nums[mid] >=val){
                if(mid == 0 || nums[mid-1]<val)
                    return mid;
                else
                    high = mid -1;
            }else{
                low = mid + 1;
            }
        }
        return -1;
    }
}
