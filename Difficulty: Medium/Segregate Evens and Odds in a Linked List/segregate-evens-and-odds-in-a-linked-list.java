class Solution {
    Node divide(Node head) {
        // code here
        if(head == null || head.next == null) return head;
        
        Node even_head = null;
        Node even_tail = null;
        Node odd_head = null;
        Node odd_tail = null;
        
        Node current = head;
        
        while(current != null) {
            if(current.data % 2 == 0) {
                if(even_head == null) {
                    even_head = even_tail = current;
                }
                else {
                    even_tail.next = current;
                    even_tail = even_tail.next;
                }
            }
            else {
                if(odd_head == null) {
                    odd_head = odd_tail = current;
                }
               else {
                    odd_tail.next = current;
                    odd_tail = odd_tail.next;
               }
            }
            
            current = current.next;
        }
        
        if(odd_head == null) return even_head;
        if(even_head == null) return odd_head;
        
        even_tail.next = odd_head;
        odd_tail.next = null;
        
        return even_head;
    }
}