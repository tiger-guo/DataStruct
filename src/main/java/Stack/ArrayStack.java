package Stack;

import java.util.ArrayList;

/*
 * @author: LiuGuohu
 * @company: XGLAB
 * @description: 数组栈 实现
 * @date: 2019/10/31
 */
public class ArrayStack {

    private int[] data;
    private int size;
    private int MAX_SIZE;

    public ArrayStack(int initCapacity) {
        data = new int[initCapacity];
        MAX_SIZE = initCapacity;
        size = 0;
    }

    public boolean push(int item){
        if(size == MAX_SIZE){
            return false;
        }
        data[size++] = item;
        return true;
    }

    public Integer pop(){
        if(size == 0)
            return null;
        int item = data[--size];
        return item;
    }
}
