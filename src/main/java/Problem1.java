// Problem1.java
public class Problem1 {
    public static ListNode concatenate(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return copyList(l2);
        }
        
        ListNode current = l1;
        
        // Traverse to the end of l1
        while (current.next != null) {
            current = current.next;
        }
        
        // Append copies of l2 nodes to l1
        while (l2 != null) {
            current.next = new ListNode(l2.val);
            current = current.next;
            l2 = l2.next;
        }
        
        return l1;
    }
    
    // Helper method to create a copy of a list
    private static ListNode copyList(ListNode head) {
        if (head == null) {
            return null;
        }
        
        ListNode newHead = new ListNode(head.val);
        ListNode current = newHead;
        head = head.next;
        
        while (head != null) {
            current.next = new ListNode(head.val);
            current = current.next;
            head = head.next;
        }
        
        return newHead;
    }
}