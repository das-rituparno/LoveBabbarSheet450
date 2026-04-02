class Solution {
    public ArrayList<Integer> bottomView(Node root) {
        // code here
        Queue<Pair> q = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        if(root == null) return list;
        q.add(new Pair(root, 0));
        
        while(!q.isEmpty()) {
            Pair first = q.poll();
            
            Node node = first.node;
            int hd = first.level;
            
            map.put(hd, node.data);
            if(node.left != null) q.add(new Pair(node.left, hd-1));
            if(node.right != null) q.add(new Pair(node.right, hd+1));
        }
        for(Map.Entry<Integer, Integer> tm : map.entrySet()) {
            list.add(tm.getValue());
        }
        return list;
    }
}

class Pair {
    Node node;
    int level;
    public Pair(Node node, int level) {
        this.node = node;
        this.level = level;
    }
}