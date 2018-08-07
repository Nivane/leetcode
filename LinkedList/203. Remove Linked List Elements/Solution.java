/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        
        if(isNull(head)){
            return null;
        }
        
        //边界情况
        if(head.next == null){
            if(head.val == val){
                return null;
            }else{
                return head;
            }
            
        }
        //头为val
        while(head.val == val){
            if(head.next != null){
                head = head.next;
            }else{
                return null;
            }
                
        }
        
        ListNode node1 = head;
        ListNode node2 = node1.next;
        while(node1 != null){
            if(node2 == null){
                break;
            }else{
                if(node2.val == val){
                    node1.next = node2.next;
                    node2 = node2.next;
                }else{
                    node1 = node1.next;
                    node2 = node2.next;
                }
            }
        }
        return head;
    }
    
    
    private boolean isNull(ListNode head){
        return head == null;
    }
    
}