/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
199 - 991
*/

class Solution {
        public Node addOne(Node head) {
            // code here.
            head = reverse(head);
            Node current = head;
            
            while(current != null) {
                if(current.data == 9) {
                    current.data = 0;
                    if(current.next == null) {
                        Node temp = new Node(1);
                        current.next = temp;
                        break;
                    }
                }
                else {
                    current.data += 1;
                    break;
                }
                current = current.next;
            }
            return reverse(head);
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