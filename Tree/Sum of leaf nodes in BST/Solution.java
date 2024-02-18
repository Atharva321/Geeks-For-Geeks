// Time  : O(n)
// Space : O(height of a tree) [ Recursion Stack ]

// Pattern : DFS

class Solution
{
    static int sum = 0;
    public static int sumOfLeafNodes(Node root)
    {
        // code here
        sum = 0;
        dfs(root);
        return sum;
    }
    
    public static void dfs(Node root){
        if(root == null) return;
         
        if(root.left == null && root.right == null){
            sum += root.data;
        }
        else{
            dfs(root.left);
            dfs(root.right);
        }
    }
}
