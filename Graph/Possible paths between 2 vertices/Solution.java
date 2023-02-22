// Time  : O(n!)
// Space : O(1)

class Solution {
    // Function to count paths between two vertices in a directed graph.
    public int countPaths(int V, ArrayList<ArrayList<Integer>> adj, int source,
                   int destination) {
        // Code here
        String path = "";
        boolean [] visited = new boolean [V];
        int possiblePaths = 
        printAllPaths(V, adj, source, destination, path, 0);
        return possiblePaths;
    }
    
    public int printAllPaths(int V, ArrayList<ArrayList<Integer>> adj, int src, int destn, String path, int paths){
        if(src == destn){
            // System.out.println(path);
            return 1;
        }
        
        // visited[src] = true;
        
        for(int nbr: adj.get(src)){
            // if(visited[nbr] == false){
                paths += printAllPaths(V, adj, nbr, destn, src + "->" + nbr, 0);
            // }
        }
        
        return paths;
    }
}
