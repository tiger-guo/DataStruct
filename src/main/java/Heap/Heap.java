package Heap;

/*
 * @author: LiuGuohu
 * @company: XGLAB
 * @description:堆
 * @date: 2019/11/5
 */
public class Heap {

    private int[] a; // 数组，从下标1开始
    private int n;  // 容量
    private int count;  // 元素个数

    public Heap(int capacity) {
        a = new int[capacity + 1];
        n = capacity;
        count = 0;
    }

    // 大顶堆插入数据
    public void insert(int data) {
        if (count >= n) {
            return;
        }
        count++;
        a[count] = data;
        int i = count;
        while (i / 2 > 0 && a[i] > a[i / 2]) {
            swap(a, i, i / 2);
            i = i / 2;
        }

    }

    private void swap(int[] a, int num1, int num2) {
        int data = a[num1];
        a[num1] = a[num2];
        a[num2] = data;
    }

    public void removeMax() {
        if (count == 0)
            return;
        a[1] = a[count];
        --count;
        heapify(a, count, 1);
    }


    private void heapify(int[] a, int n, int i) { // 自上往下堆化
        while (true) {
            int maxPos = i;
            if (i * 2 <= n && a[i] < a[i * 2])
                maxPos = i * 2;
            if (i * 2 + 1 <= n && a[maxPos] < a[i * 2 + 1])
                maxPos = i * 2 + 1;
            if (maxPos == i)
                break;
            swap(a, i, maxPos);
            i = maxPos;
        }
    }

    private void buidHeap(int[] a, int n) {
        for (int i = n / 2; i >= 1; --i) {
            heapify(a, n, i);
        }
    }

    public void sort(int[] a, int n) {
        buidHeap(a, n);
        int k = n;
        while (k > 0) {
            swap(a, k, 1);
            k--;
            heapify(a, k, 1);
        }
    }
}
