// Problem1.java
public class Problem1 {
    public static ListNode concatenate(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        
        
        // Traverse to the end of l1
        while (l1.next != null) {
            l1 = l1.next;
        }
        
        // Append copies of l2 nodes to l1
        while (l2 != null) {
            l1.next = new ListNode(l2.val);
            l1 = l1.next;
            l2 = l2.next;
        }
        
        return l1;
    }
}
