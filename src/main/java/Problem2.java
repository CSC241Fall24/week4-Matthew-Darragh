public class Problem2 {
    public static ListNode insert(ListNode head, int val, int position) {
        ListNode newNode = new ListNode(val);
        
        // If the list is empty or inserting at the beginning
        if (head == null || position == 0) {
            newNode.next = head;
            return newNode;
        }
        
        ListNode current = head;
        int currentPosition = 0;
        
        // Traverse the list to find the insertion point
        while (current.next != null && currentPosition < position - 1) {
            current = current.next;
            currentPosition++;
        }
        
        // Insert the new node
        newNode.next = current.next;
        current.next = newNode;
        
        return head;
    }
}
