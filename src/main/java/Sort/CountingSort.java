package Sort;

/*
 * @author: LiuGuohu
 * @company: XGLAB
 * @description: 计数排序
 * @date: 2019/11/1
 */
public class CountingSort {

    // 计数排序，a是数组，n是数组大小。假设数组中存储的都是非负整数。
    public void sort(int[] nums) {
        if (nums.length <= 1) return;

        // 查找数组中数据的范围
        int max = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }

        int[] c = new int[max + 1]; // 申请一个计数数组c，下标大小[0,max]
        for (int i = 0; i <= max; ++i) {
            c[i] = 0;
        }

        // 计算每个元素的个数，放入c中
        for (int i = 0; i < nums.length; ++i) {
            c[nums[i]]++;
        }

        // 依次累加
        for (int i = 1; i <= max; ++i) {
            c[i] = c[i-1] + c[i];
        }

        // 临时数组r，存储排序之后的结果
        int[] r = new int[nums.length];

        // 计算排序的关键步骤，有点难理解
        for (int i = nums.length - 1; i >= 0; --i) {
            int index = c[nums[i]]-1;
            r[index] = nums[i];
            c[nums[i]]--;
        }

        // 将结果拷贝给a数组
        for (int i = 0; i < nums.length; ++i) {
            nums[i] = r[i];
        }
    }
}
