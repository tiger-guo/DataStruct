import Sort.MergeSort;
import Sort.QuickSort;
import Stack.CircularQueue;

/*
 * @author: LiuGuohu
 * @company: XGLAB
 * @description:
 * @date: 2019/10/31
 */
public class Test {

    public static void main(String[] args) {

        int[] nums = {6,4,1,7,8};
        QuickSort mergeSort = new QuickSort();
        mergeSort.sort(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
