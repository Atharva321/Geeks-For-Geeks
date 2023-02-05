//{ Driver Code Starts

// Time  : O(n+m)
// Space : O(1)

/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
 Linked List class
class LinkedList
{
    Node head;  // head of list
}*/

class Intersect
{
    //Function to find intersection point in Y shaped Linked Lists.
	int intersectPoint(Node head1, Node head2)
	{
         // code here
         int size1 = 0;
         Node temp = head1;
         while(temp != null){
             temp = temp.next;
             size1++;
         }
         
         int size2 = 0;
         temp = head2;
         while(temp != null){
             temp = temp.next;
             size2++;
         }
         
         if(size1 < size2){
            int n = size2 - size1;
            int cnt = 0;
            while(cnt != n && head2 != null){
                head2 = head2.next;
                cnt++;
            }
         }
         else{
            int n = size1 - size2;
            int cnt = 0;
            while(cnt != n && head1 != null){
                head1 = head1.next;
                cnt++;
            }
         }
         while(head1 != head2 && head1 != null && head2 != null){
            head1 = head1.next;
            head2 = head2.next;
            if(head1 == head2) return head1.data;
         }
         return -1;
	}
}
