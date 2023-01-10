//{ Driver Code Starts
//

import java.io.*;
import java.util.*;

class Node 
{
    int data;
    Node next;
    
    Node(int a)
        {
            data = a;
            next = null;
        }
}

class GfG
{
    static Scanner sc = new Scanner(System.in);
    
    public static Node inputList(int size)
    {
        Node head, tail;
        int val;
        
        val = sc.nextInt();
        head = tail = new Node(val);
        
        size--;
        while(size-->0)
        {
            val = sc.nextInt();
            tail.next = new Node(val);
            tail = tail.next;
        }
        
        return head;
    }
    
    public static void printList(Node n)
    {
        while(n!=null)
        {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    
    public static void main(String args[])
    {
        int t = sc.nextInt();
        while(t-->0)
        {
            int n , m;
            
            n = sc.nextInt();
            Node head1 = inputList(n);
            
            m = sc.nextInt();
            Node head2 = inputList(m);
            
            Solution obj = new Solution();
            
            Node result = obj.findIntersection(head1, head2);
            
            printList(result);
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

/* structure of list Node:

class Node 
{
    int data;
    Node next;
    
    Node(int a)
        {
            data = a;
            next = null;
        }
}

*/

// Time  : O(Max(m,n))
// Space : O(n)
class Solution
{
    public static Node findIntersection(Node head1, Node head2)
    {
        // add your code here
        // return the head of intersection list
        HashSet<Integer> hset = new HashSet<>();
        Node pointer = head2;
        
        while(pointer != null){
            hset.add(pointer.data);
            pointer = pointer.next;
        }
        
        pointer = head1;
        
        while(!hset.contains(pointer.data)){
            pointer = pointer.next;
        }
        
        Node commonListHead = pointer;
        Node commonList = commonListHead;
        
        pointer = pointer.next;
        
        while(pointer != null){
            boolean flag = false;
            if(hset.contains(pointer.data)){
                commonList.next = pointer;
                commonList = commonList.next;
                flag = true;
            }
            pointer = pointer.next;
        }
        
        commonList.next = null;
        
        return commonListHead;
    }
}
