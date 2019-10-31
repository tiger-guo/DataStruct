package LinkedList;

/*
 * @author: LiuGuohu
 * @company: XGLAB
 * @description: LeetCode 19 删除链表倒数第k个节点
 * @date: 2019/10/31
 */
public class DeleteNLinkedList_19 {

    public ListNode removeNthFromEnd1(ListNode head, int n) {
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode slow = newHead;
        ListNode fast = newHead;

        for(int i=1; i<=n+1; i++){
            fast = fast.next;
        }
        while(fast!=null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return newHead.next;
    }

    // 递归实现
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return head;
        }
        ListNode prehead = new ListNode(-1);
        prehead.next = head;
        dfs(prehead, n+1);

        return prehead.next;
    }

    int dfs(ListNode head, int n){
        if(head == null)
            return 0;
        int res = dfs(head.next, n)+1;
        if(n == res){
            if(head.next ==null || head.next.next == null)
                head.next = null;
            else{
                head.next = head.next.next;
            }
        }
        return res;
    }

}
