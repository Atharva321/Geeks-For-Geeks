//User function template for JAVA

/*Complete the Given Function

Node is as follows:
class Node{
    int data;
    Node left,right;
    Node(int d){
    	data=d;
    	left=null;
    	right=null;
    }
}*/

// Time  : O(n)
// Space : O(1)

import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Solution{
    public int toSumTree(Node root){
        //add code here.
        if(root == null) return 0;
        int value = root.data;
        root.data = toSumTree(root.left) + toSumTree(root.right);
        return value + root.data;
    }
}
