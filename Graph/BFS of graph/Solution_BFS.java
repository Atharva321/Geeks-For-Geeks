// Time  : O(V + E)
// Space : O(V + E)

class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> bfsTraversal = new ArrayList<>();
        boolean [] isVisited = new boolean[V];
        
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        while(!q.isEmpty()){
            int currVertice = q.poll();
            bfsTraversal.add(currVertice);
            for(int vertice: adj.get(currVertice)){
                if(isVisited[vertice] == false){   
                    isVisited[vertice] = true;
                    q.add(vertice);
                }
            }
        }
        
        return bfsTraversal;
    }
}
