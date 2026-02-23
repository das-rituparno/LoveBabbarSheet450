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
    public Node intersectPoint(Node head1, Node head2) {
        // code here
        Node one = head1;
        Node two = head2;
        
        while(one != two) {
            one = one.next == null ? head2 : one.next;
            two = two.next == null ? head1 : two.next;
        }
        
        return one;
    }
}