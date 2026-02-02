/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reverseList(Node head) {
        // code here
        Node dummy = null;
        Node current = head;
        
        while(current != null) {
            Node next = current.next;
            current.next = dummy;
            dummy = current;
            current = next;
        }
        return dummy;
    }
}