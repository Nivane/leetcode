/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode node1 = head;
        ListNode node2;
        while(node1.next != null){
            node2 = node1.next;
            node1.next = node2.next;
            node2.next = head;
            head = node2;
        }
        return head;
        
    }
}