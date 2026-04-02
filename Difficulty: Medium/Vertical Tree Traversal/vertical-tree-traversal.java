class Solution {
    public ArrayList<ArrayList<Integer>> verticalOrder(Node root) {
        // code here
        Queue<Tuple> q = new LinkedList<>();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        if(root == null) return list;
        q.add(new Tuple(root, 0, 0));
        
        while(!q.isEmpty()) {
            int size = q.size();
            Tuple curr = q.poll();
            Node node = curr.node;
            int col = curr.col;
            
            if(!map.containsKey(col)) {
                map.put(col, new ArrayList<>());
            }
            map.get(col).add(node.data);
            
            if(node.left != null) q.add(new Tuple(node.left, 0, col-1));
            if(node.right != null) q.add(new Tuple(node.right, 0, col+1));
        }
        for(ArrayList<Integer> colList : map.values()) {
            list.add(colList);
        }
        return list;
    }
}
class Tuple {
    Node node;
    int row;
    int col;
    public Tuple(Node node, int row, int col) {
        this.node = node;
        this.row = row;
        this.col = col;
    }
}