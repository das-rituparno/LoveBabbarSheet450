/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static Node moveToFront(Node head) {
        // code here
        Node previous = head;
        Node current = head;
        
        while(current != null && current.next != null) {
            previous = current;
            current = current.next;
        }
        
        previous.next = null;
        current.next = head;
        return current;
    }
}
