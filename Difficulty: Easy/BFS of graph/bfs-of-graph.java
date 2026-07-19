class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int n = adj.size();
        
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[n];
        ArrayList<Integer> result = new ArrayList<>();
        
        q.add(0);
        visited[0] = true;
        
        while(!q.isEmpty()) {
            Integer node = q.poll();
            result.add(node);
            
            for(Integer item : adj.get(node)) {
                if(!visited[item]) {
                    visited[item] = true;
                    q.add(item);
                }
            }
        }
        
        return result;
    }
}