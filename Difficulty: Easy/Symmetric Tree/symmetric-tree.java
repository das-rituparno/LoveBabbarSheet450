/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

*/
class Solution {
    public boolean isSymmetric(Node root) {
        // Code here
        if(root == null) return true;
        return isMirror(root.left, root.right);
    }
    
    public boolean isMirror(Node one, Node two) {
        if(one == null && two == null) return true;
        if(one == null || two == null) return false;
        if(one.data != two.data) return false;
        
        boolean right = isMirror(one.left, two.right);
        boolean left = isMirror(one.right, two.left);
        
        return left && right;
    }
}