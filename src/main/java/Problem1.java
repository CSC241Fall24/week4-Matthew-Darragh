// Problem1.java
public class Problem1 {
    public static ListNode concatenate(ListNode l1, ListNode l2) {
        // TODO: Implement the concatenate method
        // This method should concatenate l2 to l1 and return l1
        // Remember to create new nodes instead of directly linking l1 to l2
        if(l1 == null){
            return l2;
        }
        else if(l2 == null){
            return l1;
        }
        listnode temp = null;
        temp = l1;
        while(l2 != null){
            temp.next = l2;
            l2 = l2.next;
            temp = temp.next;
        }
        return temp;
    }
}