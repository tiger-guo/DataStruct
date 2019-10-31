package LinkedList;

/*
 * @author: LiuGuohu
 * @company: XGLAB
 * @description: 所有题的测试类
 * @date: 2019/10/31
 */
public class Test {
    public static void main(String[] args) {
        BackLinkedList_234 test = new BackLinkedList_234();
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        listNode.next = listNode1;
        test.isPalindrome(listNode);
    }
}
