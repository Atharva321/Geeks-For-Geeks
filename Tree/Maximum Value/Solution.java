// Time  : O(n)
// Space : O(n)

class Solution {
    ArrayList<Integer> maximumValue(Node root) {
       //code here
       ArrayList<Integer> ans = new ArrayList<>();
        
        if(root == null) return ans;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int max;
        while(!q.isEmpty()){
            int size = q.size();
            
            max = Integer.MIN_VALUE;
            
            for(int i=0; i<size; i++){
                Node curr = q.poll();
                if(max < curr.data) max = curr.data;
                
                if(curr.left!= null)   q.add(curr.left);
                if(curr.right!= null)  q.add(curr.right);
            }
      
            ans.add(max);
        }
        return ans;
    }
}
