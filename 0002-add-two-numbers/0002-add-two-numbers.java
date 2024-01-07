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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         ListNode ans = new ListNode(0);
   ListNode ansHead = ans;
    ListNode a = l1;
    ListNode b = l2;
    int carry =0;
    int sum=0;
    
    while(a!=null || b!=null){
        
        int g =0;
        if(a!=null){
         g = a.val;
        }
    
        int h =0;
        if(b!=null){
        h = b.val;
       }
        
        
        sum = carry + g + h;
        ListNode t = new ListNode(sum%10);
        ans.next = t;
        ans = ans.next;
        
        if(sum >=10){
            carry =1;
            
        }
        else{
            carry =0;
        }
        
        if(a!=null){
        a=a.next;
        }
        if(b!=null){
        b= b.next;
        }
    }
    
     
    if(carry==1){

        ListNode t1 = new ListNode(carry);
        ans.next = t1;
    } 
    
    
    ansHead=ansHead.next;
    
    return ansHead;
    }
}