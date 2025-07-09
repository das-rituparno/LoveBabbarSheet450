/*
class Node
{
    int data; //data of the node
    int hd; //horizontal distance of the node
    Node left, right; //left and right references

    // Constructor of tree node
    public Node(int key)
    {
        data = key;
        hd = Integer.MAX_VALUE;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> bottomView(Node root) {
        // Code here
        Map<Integer,Integer> map = new TreeMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null) return list;

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,0));

        while(!q.isEmpty()) {
            Pair first = q.poll();
            Node temp = first.node;
            int lev = first.level;

            map.put(lev, temp.data);
            if(temp.left != null) q.add(new Pair(temp.left, lev-1));
            if(temp.right != null) q.add(new Pair(temp.right, lev+1));
        }

        for (Map.Entry<Integer, Integer> tm : map.entrySet()) {
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