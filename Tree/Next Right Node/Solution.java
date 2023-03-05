// Time  :
// Space :

class Solution{
	Node nextRight(Node root, int key)
    {
		//Write your code here
		if(root.data==key){
            return new Node(-1);
        }
        
        Queue<Node> q =new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                Node top=q.poll();
                if(top!=null){
                    if(top.data==key){
                        if(!q.isEmpty() && q.peek()!=null){
                            return q.peek();
                        }
                        else{
                            return new Node(-1);
                        }
                    }
                
                    if(top.left!=null){
                        q.add(top.left);
                    }
                
                    if(top.right!=null){
                        q.add(top.right);
                    }
                }
            }
            q.add(null);
        }
        return new Node(-1);
    }
}
