class Solution
{
    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root,int K)
    {
        //Your code here
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        inorder(root, pq);
        
        int num = 0;
        
        while(K > 0){
            num = pq.poll();
            K--;
        }
        
        return num;
    }
    
    public void inorder(Node root, PriorityQueue<Integer> pq){
        if(root == null) return;
        pq.add(root.data);
        
        inorder(root.left, pq);
        inorder(root.right, pq);
    }
    
}
