// Time  : O(n)
// Space : O(n)

/*
// A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Spiral
{
    //Function to return a list containing the level order 
    //traversal in spiral form.	
    ArrayList<Integer> findSpiral(Node root) 
    {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        if(root == null) return ans;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int lvl = 0;
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for(int i=0; i<size; i++){
                Node curr = q.poll();
                level.add(curr.data);
                if(curr.left!= null)   q.add(curr.left);
                if(curr.right!= null)  q.add(curr.right);
            }
            if(lvl % 2 == 0){
                Collections.reverse(level);
            }
            for(int i=0; i<level.size(); i++)
            ans.add(level.get(i));
            lvl++;
        }
        return ans;
    }
}
