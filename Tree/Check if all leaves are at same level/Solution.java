// Time  : O(n)
// Space : O(h)

class Solution
{
    boolean check(Node root)
    {
	    // Your code here
	    HashSet<Integer> hset = new HashSet<>();
	    
	    dfs(root, 0, hset);
	    
	    return hset.size() == 1;
    }
    
    void dfs(Node root, int level, HashSet<Integer> hset){
        if(root == null) return;
        if(root.left == null && root.right == null) hset.add(level);
        
        dfs(root.left, level + 1, hset);
        dfs(root.right, level + 1, hset);
    }
    
}
