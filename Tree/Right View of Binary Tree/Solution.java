// Time  : O(n)
// Space : O(n)

class Solution{
    //Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node node) {
        
        //add code here.
        ArraysList<Integer> rightView = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        rightView.add(node.data);
        while(!q.isEmpty()){
            int nodes = q.size();  // No. of nodes in each level.
            
            for(int i=0; i<n; i++){
                Node currNode = q.poll();
                
                if(currNode.left != null){
                    q.push(currNode.left);
                }
                
                if(currNode.right != null){
                    q.push(currNode.right);
                }
            }
        }
    }
}
