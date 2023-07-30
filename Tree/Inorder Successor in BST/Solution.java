// Time  : O(n)
// Space : O(n)

//User function Template for Java

/*
*
*  Complete the function below
*  Node is as follows:
*  class Node{
*  	int data;
*  	Node left,right;
*  	Node(int d){
*  		data=d;
*  		left=right=null;
*  	}
*  }
*
*/

class Solution
{
    // returns the inorder successor of the Node x in BST (rooted at 'root')
	public Node inorderSuccessor(Node root,Node x)
    {
        //add code here.
        ArrayList<Node> inorderList = new ArrayList<>();
        
        inorder(root, inorderList);
        
        for(int i=0; i<inorderList.size(); i++){
            if(x == inorderList.get(i) && i+1 < inorderList.size()){
                return inorderList.get(i+1);
            }
        }
        
        return null;
    }
    
    public void inorder(Node root, ArrayList<Node> inorderList){
        if(root == null) return;
        
        inorder(root.left, inorderList);
        inorderList.add(root);
        inorder(root.right, inorderList);
    }
}
