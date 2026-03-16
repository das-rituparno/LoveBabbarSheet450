/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public Node addTwoLists(Node head1, Node head2) {
        // code here
        head1 = reverse(head1);
        head2 = reverse(head2);
        Node dummy = new Node(0);
        Node current = dummy;
        int carry = 0;
        
        while(head1 != null || head2 != null || carry != 0) {
            int value1 = (head1 != null) ? head1.data : 0;
            int value2 = (head2 != null) ? head2.data : 0;
            
            int sum = value1 + value2 + carry;
            int digit = sum%10;
            carry = sum/10;
            
            current.next = new Node(digit);
            current = current.next;
            
            if(head1 != null) head1 = head1.next;
            if(head2 != null) head2 = head2.next;
        }
        
        Node result = reverse(dummy.next);
        while(result.next != null && result.data == 0) {
            result = result.next;
        }
        return result;
    }
    public Node reverse(Node head) {
        Node current = head;
        Node previous = null;

        while(current != null) {
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
}