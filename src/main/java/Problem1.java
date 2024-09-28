// Problem1.java
public class Problem1 {
    public static ListNode concatenate(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
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
}
