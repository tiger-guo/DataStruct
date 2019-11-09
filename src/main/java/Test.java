import Backtracking.EightQueens;
import Division.GetReverseOrder;
import DynamicPlanning.BagPack;
import Graph.Graph;
import Search.SearchFirstMoreVal;
import Search.SearchFirstVal;
import Search.SearchLastLessVal;
import Search.SearchLastVal;
import Sort.MergeSort;
import Sort.QuickSort;
import Stack.CircularQueue;
import Tree.BinarySearchTree;
import Tree.Trie;

import java.util.Arrays;
import java.util.HashMap;
import java.util.logging.XMLFormatter;

/*
 * @author: LiuGuohu
 * @company: XGLAB
 * @description:
 * @date: 2019/10/31
 */
public class Test {

    public static void main(String[] args) {
        BagPack test = new BagPack();
        int[] nums = {2,2,4,6,3};
        System.out.println(test.getMax(nums, 9));
    }

}
