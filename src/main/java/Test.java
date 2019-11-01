import Search.SearchFirstMoreVal;
import Search.SearchFirstVal;
import Search.SearchLastLessVal;
import Search.SearchLastVal;
import Sort.MergeSort;
import Sort.QuickSort;
import Stack.CircularQueue;

import java.util.Arrays;

/*
 * @author: LiuGuohu
 * @company: XGLAB
 * @description:
 * @date: 2019/10/31
 */
public class Test {

    public static void main(String[] args) {

        int[] nums = {1,4,3,4,5,6,7,6,8};
        SearchLastLessVal firstVal = new SearchLastLessVal();
        System.out.println(firstVal.searchVal(nums, 1));
    }
}
