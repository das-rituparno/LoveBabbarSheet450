/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public boolean isPalindrome(Node head) {
        // code here
        if (head == null || head.next == null) return true;
        
        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next; 
            fast = fast.next.next;
        }
        
        Node second_half = reverse(slow);
        Node current = head;
        
        while(second_half != null) {
            if(current.data != second_half.data) return false;
            else {
                second_half = second_half.next;
                current = current.next;
            }
        }
        return true;
    }
    
    public Node reverse(Node head) {
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