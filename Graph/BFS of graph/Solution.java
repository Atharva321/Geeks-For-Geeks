class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean[] visited = new boolean[V+1];
        ArrayList<Integer> a = new ArrayList<>();
        Queue<Integer> q = new LinkedList<Integer>();
        int s = 0;
        q.add(s);
        visited[s] = true;
        while(!q.isEmpty()){
            int cur = q.poll();
            a.add(cur);
            for(int i:adj.get(cur)){
                if(visited[i]==false){
                    q.add(i);
                    visited[i]=true;
                }
            }
        }
        return a;
    }
}
