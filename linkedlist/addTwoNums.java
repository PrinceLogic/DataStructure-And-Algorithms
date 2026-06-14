package linkedlist;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class addTwoNums {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;
        
        // Loop until both lists are exhausted and there is no carry left
        while (l1 != null || l2 != null || carry != 0) {
            // Get the current values or 0 if the list has reached the end
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            
            // Calculate the sum of the digits and the carry
            int sum = x + y + carry;
            carry = sum / 10; // The new carry (either 0 or 1)
            
            // Create a new node with the digit part of the sum
            current.next = new ListNode(sum % 10);
            current = current.next;
            
            // Move to the next nodes in the lists
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        
        // The first node is a dummy, so return the next node
        return dummyHead.next;
    }
    public static void main(String[] args) {
        ListNode head1 = new ListNode(2,null);
        head1.next = new ListNode(4,null);
        head1.next.next = new ListNode(3,null);
        ListNode head2 = new ListNode(5,null);
        head2.next = new ListNode(6,null);
        head2.next.next = new ListNode(4,null);
        ListNode result = addTwoNumbers(head1, head2);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        System.out.println();
    }       
}