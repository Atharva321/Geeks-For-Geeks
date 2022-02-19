class BinaryTree
{
    static int sum = 0;
    static int sumBT(Node head){
        //Code
        if(head == null) return 0;
        //sum+= left.data;
        int left = sumBT(head.left);
        //sum+= right.data;
        int right = sumBT(head.right);
        sum = left + right + head.data;
        return sum;
    }
}
