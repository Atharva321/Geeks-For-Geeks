// Time  : O(logn)
// Space :

class Spiral
{
    //Function to return a list containing the level order 
    //traversal in spiral form.	
    ArrayList<Integer> findSpiral(Node root) 
    {
        // Your code here
        int nodes;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        ArrayList<Integer> spiralTraversal = new ArrayList<>();
        int level = 0;
        while(!q.isEmpty()){
            nodes = q.size();
            ArrayList<Integer> levelNodes = new ArrayList<>();
            
            for(int i=0; i<nodes; i++){
                Node node = q.poll();
                levelNodes.add(node.data);
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
            
            if(level%2 != 0){
                spiralTraversal.addAll((levelNodes));
            }
            else{
                Collections.reverse(levelNodes);
                spiralTraversal.addAll(levelNodes);
            }
            
            level++;
        }
        
        return spiralTraversal;
    }
}
