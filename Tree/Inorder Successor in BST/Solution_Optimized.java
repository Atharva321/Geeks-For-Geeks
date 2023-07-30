// Time  : O(height of BST)
// Space : O(1)

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

public Node inorderSuccessor(Node root,Node x)
    {
        //add code here.
        
        Node inOrderSuccessor = null;
        
        while(root != null){
            if(root.data > x.data){
                inOrderSuccessor = root;
                root = root.left;
            }
            else{
                root =  root.right;
            }
        }
        
        return inOrderSuccessor;
    }
}
