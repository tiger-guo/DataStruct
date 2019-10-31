package LinkedList;

/*
 * @author: LiuGuohu
 * @company: XGLAB
 * @description: 所有题的测试类
 * @date: 2019/10/31
 */
public class Test {
    public static void main(String[] args) {
        CycleLinkedList_142 test = new CycleLinkedList_142();
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(4);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode1;
        test.detectCycle(listNode);
    }
}
