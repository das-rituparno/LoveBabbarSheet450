class Solution {
    public boolean isSumProperty(Node root) {
        //  base condition
        if(root == null) return true;
        if(root.left == null && root.right == null) return true;
        
        //induction
        int left_value = root.left == null ? 0 : root.left.data;
        int right_value = root.right == null ? 0 : root.right.data;
        
        if(root.data != left_value + right_value) return false;
        
        //hypothesis
        return isSumProperty(root.left) && isSumProperty(root.right);
    }
}