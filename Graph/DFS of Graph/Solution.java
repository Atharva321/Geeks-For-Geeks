// Time  : O(V+E)
// Space : O(1) [Recursive Stack]

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean [] visited = new boolean [V];
        
        ArrayList<Integer> graph = new ArrayList<>();
        for(int i=0; i<V; i++){
            if(!visited[i]){
                dfs(V, visited, adj, i, graph);
            }
        }
        return graph;
    }
    
    public void dfs(int V, boolean [] visited, ArrayList<ArrayList<Integer>> adj, int src, ArrayList<Integer> graph){
        visited[src] = true;
        
        graph.add(src);
        
        for(int nbr: adj.get(src)){
            if(!visited[nbr]){
                dfs(V, visited, adj, nbr, graph);
            }
        }
        
    }
}
