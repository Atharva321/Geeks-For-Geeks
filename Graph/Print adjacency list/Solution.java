// Time  : O(V+E)
// Space : O(1)

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    // Function to return the adjacency list for each vertex.
    public ArrayList<ArrayList<Integer>> printGraph(
        int V, ArrayList<ArrayList<Integer>> graph) {
        // Code here
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i=0; i<graph.size(); i++){
            adj.add(new ArrayList<Integer>());
        }
        
        for(int i=0; i<V; i++){
            adj.get(i).add(i);
            for(int nbr: graph.get(i)){
                adj.get(i).add(nbr);
            }
        }
        
        return adj;
    }
}
