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
    public static void reverse(List<Integer> list,int start, int end){
        while(start<end){
            int temp = list.get(start);
            list.set(start,list.get(end));
            list.set(end,temp);
            start++;
            end--;
        }
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        int len = 0;
        ListNode temp = head;

        List<Integer> list = new ArrayList<>();

        while(temp!=null){
            len++;
            list.add(temp.val);
            temp = temp.next;
        }

        k = k%len;

        reverse(list,0,len-1);
        reverse(list,0,k-1);
        reverse(list,k,len-1);

        temp = head;
        int index = 0;
        while(temp!=null){
            temp.val = list.get(index);
            temp = temp.next;
            index++;
        }

        return head;
    }
}