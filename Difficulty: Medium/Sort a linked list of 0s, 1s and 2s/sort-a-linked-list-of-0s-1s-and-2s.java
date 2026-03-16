/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        Node zero_head = new Node(-1);
        Node one_head = new Node(-1);
        Node two_head = new Node(-1);
        
        Node zero = zero_head;
        Node one = one_head;
        Node two = two_head;
        Node current = head;
        
        while(current != null) {
            if(current.data == 0) {
                zero.next = current;
                zero = zero.next;
            }
            else if(current.data == 1) {
                one.next = current;
                one = one.next;
            }
            else if(current.data == 2) {
                two.next = current;
                two = two.next; 
            }
            current = current.next;
        }
        
        zero.next = one_head.next != null ? one_head.next : two_head.next;
        one.next = two_head.next;
        two.next = null;
        
        return zero_head.next;
    }
}