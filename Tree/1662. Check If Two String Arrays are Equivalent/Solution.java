// Time  : O(n)
// Space : O(1)

class Solution
{
    
    public static boolean isDeadEnd(Node root)
    {
        //Add your code here.
        
        return inorder(1, Integer.MAX_VALUE, root);
    }
    
    public static boolean inorder(int left, int right, Node root){
        if(root == null) return false;
        
        if(left == right) return true;
        
        return inorder(left, root.data - 1, root.left) ||
        inorder(root.data + 1, right, root.right);
    }
}
