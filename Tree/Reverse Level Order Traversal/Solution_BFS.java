// Time  :
// Space :

class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node root) 
    {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        if(root == null) return ans;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int max;
        while(!q.isEmpty()){
            int size = q.size();
            ArrayList<Integer> currNodes = new ArrayList<>();
            
            max = Integer.MIN_VALUE;
            
            for(int i=0; i<size; i++){
                Node curr = q.poll();
                currNodes.add(curr.data);
                
                if(curr.left!= null)   q.add(curr.left);
                if(curr.right!= null)  q.add(curr.right);
            }
      
            Collections.reverse(currNodes);
            ans.addAll(currNodes);
        }
        
        Collections.reverse(ans);
        return ans;
    }
}      
