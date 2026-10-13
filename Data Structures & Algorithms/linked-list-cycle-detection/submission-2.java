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
    public boolean hasCycle(ListNode head) {
        ListNode slow = new ListNode();
        slow = head;
        ListNode fast = new ListNode();
        fast = head;
        if(head == null || head.next == null) {
            return false;
        }
        while (fast.next != null && fast.next.next != null){
            if(fast.next.next == slow.next) {
                return true;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;

    }
}
