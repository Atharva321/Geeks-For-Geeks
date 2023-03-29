// Time  : O(n)
// Space : O(1)

class Tree
{
    //Function to return a list containing the postorder traversal of the tree.
    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<Integer> postOrder(Node root)
    {
       
       // Your code goes here
       if(root == null) return list;
       
       //list.add(root.data);
       list = postOrder(root.left);
       //list.add(root.data);
       list = postOrder(root.right);
        list.add(root.data);
        return list;
    }
