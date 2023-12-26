/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null)
        {
            head = null;
            return head;
        }
        int size = 0;
        ListNode temp = head;
        while(temp!= null)
        {
            size++;
            temp = temp.next;
        }
        if(n==size)
        {
            return head.next;
        }
        n = size-n+1;
        int i=2;
        ListNode t = head;
        while(i<n)
        {
            t= t.next;
            i++;
        }
        t.next = t.next.next;
        return head;
    }
}