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
        Node zeroHead = new Node(-1);
        Node oneHead  = new Node(-1);
        Node twoHead  = new Node(-1);

        Node zero = zeroHead;
        Node one  = oneHead;
        Node two  = twoHead;

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
            else {
                two.next = current;
                two = two.next;
            }
            current = current.next;
        }
        
        zero.next = (oneHead.next != null) ? oneHead.next : twoHead.next;
        one.next = twoHead.next;
        two.next = null;
        
        return zeroHead.next;
    }
}