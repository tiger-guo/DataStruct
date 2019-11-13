package Stack;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;
import java.util.Stack;

/*
 * @author: LiuGuohu
 * @company: XGLAB
 * @description: 判断栈出栈顺序 是否符合
 * @date: 2019/11/10
 */
public class StackSequence {

    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if(pushA.length == 0 || popA.length == 0)
            return false;
        Stack<Integer> s = new Stack<Integer>();
        //用于标识弹出序列的位置
        int popIndex = 0;
        for(int i = 0; i< pushA.length;i++){
            s.push(pushA[i]);
            //如果栈不为空，且栈顶元素等于弹出序列
            while(!s.empty() &&s.peek() == popA[popIndex]){
                //出栈
                s.pop();
                //弹出序列向后一位
                popIndex++;
            }
        }
        return s.empty();
    }
}

