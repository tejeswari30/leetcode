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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null) {
            // store the address of next node
            ListNode next = curr.next;
            // current node address
            curr.next = prev;
            // moving prev forward
            prev = curr;
            // moving curr forward
            curr = next;
        }
        return prev;
    }
}