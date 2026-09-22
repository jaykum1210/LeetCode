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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k == 0){
            return head;
        }

        int len = 1;
        ListNode endNode = head;

        while(endNode.next!=null){
            len++;
            endNode = endNode.next;
        }


        k = k%len;

        if(k==0){
            return head;
        }

        endNode.next = head;
        int steps = len-k;
        ListNode newEnd = head;

        for(int i = 1;i<steps;i++){
            newEnd = newEnd.next;
        }

        ListNode newHead = newEnd.next;

        newEnd.next = null;

        return newHead;
    }
}