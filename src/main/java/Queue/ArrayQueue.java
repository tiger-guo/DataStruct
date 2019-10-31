package Queue;

/*
 * @author: LiuGuohu
 * @company: XGLAB
 * @description: 数组实现队列
 * @date: 2019/10/31
 */
public class ArrayQueue {
    private int[] data;
    private int MAX_SIZE;
    private int head;
    private int tail;

    public ArrayQueue(int initCapacity) {
        data = new int[initCapacity];
        this.MAX_SIZE = initCapacity;
        head = 0;
        tail = 0;
    }

    public boolean push(int item){
        if(tail == MAX_SIZE){
            return false;
        }
        data[tail++] = item;
        return true;
    }

    public Integer poll(){
        if(head == tail){
            return null;
        }
        return data[head++];
    }
}
