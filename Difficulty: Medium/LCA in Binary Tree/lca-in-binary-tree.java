class Solution {
    Node lca(Node root, int n1, int n2) {
        // code here
        // bose condition
        if(root == null) return null;
        if(n1 == root.data || n2 == root.data) return root;
        
        //hypothesis
        Node left = lca(root.left, n1, n2);
        Node right = lca(root.right, n1, n2);
        
        //induction
        if(left != null && right != null) return root;
        return left != null ? left : right;
    }
}