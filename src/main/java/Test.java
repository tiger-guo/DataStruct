import Stack.CircularQueue;

/*
 * @author: LiuGuohu
 * @company: XGLAB
 * @description:
 * @date: 2019/10/31
 */
public class Test {

    public static void main(String[] args) {

        CircularQueue stack = new CircularQueue(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.poll());
        System.out.println(stack.poll());
        System.out.println(stack.poll());
        System.out.println(stack.poll());

    }
}
