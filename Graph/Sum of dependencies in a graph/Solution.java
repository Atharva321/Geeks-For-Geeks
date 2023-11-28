class Solution {
    int sumOfDependencies(ArrayList<ArrayList<Integer>> adj, int V) {
        // code here
        int dependencies = 0;
        
        for(int i=0;i<V;i++){
            dependencies = dependencies + adj.get(i).size();
        }
        return dependencies;
    }
};
