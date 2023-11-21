// Time  : O(n)
// Space : O(h)

class Solution
{
    //Function to check if two trees are identical.
	boolean isIdentical(Node root1, Node root2)
	{
	    // Code Here
	    if(root1 == null && root2 == null) return true;
	    else if((root1 == null && root2 != null) || (root1 != null && root2 == null)) return false;
	    
	    return ((root1 == root2) || (root1.data == root2.data)) && isIdentical(root1.left, root2.left) == true && isIdentical(root1.right, root2.right) == true;
	}
	
}
