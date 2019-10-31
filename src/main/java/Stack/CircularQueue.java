package Stack;

/*
 * @author: LiuGuohu
 * @company: XGLAB
 * @description: 循环链表
 * @date: 2019/10/31
 */
public class CircularQueue {
    private int[] data;
    private int len;
    private int head;
    private int tail;

    public CircularQueue(int initCapacity) {
        data = new int[initCapacity];
        this.len = initCapacity;
        head = 0;
        tail = 0;
    }

    public boolean push(int item) {
        if ((tail + 1) % len == head) {
            return false;
        }
        data[tail] = item;
        tail = (tail + 1) % len;
        return true;
    }

    public Integer poll() {
        if (head == tail) {
            return null;
        }
        int item = data[head];
        head = (head + 1) % len;
        return item;
    }
}
