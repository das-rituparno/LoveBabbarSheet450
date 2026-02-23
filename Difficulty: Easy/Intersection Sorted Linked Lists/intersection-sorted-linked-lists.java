/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    public static Node findIntersection(Node head1, Node head2) {
        // code here.
        HashSet<Integer> set = new HashSet<>();
        
        Node temp1 = head1;
        while(temp1 != null) {
            set.add(temp1.data);
            temp1 = temp1.next;
        }
        
        Node dummy = new Node(0);
        Node tail = dummy;
        Node temp2 = head2;
        
        while(temp2 != null) {
            if(set.contains(temp2.data)) {
                tail.next = new Node(temp2.data);
                tail = tail.next;
            }
            temp2 = temp2.next;
        }
        
        return dummy.next;
    }
}