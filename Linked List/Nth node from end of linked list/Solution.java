class GfG
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	// Your code here
    	
    	int fast = 0;
    	Node slow = head;
    	while(fast!=n){
    	   head = head.next;
    	   fast++;
    	   if(head == null && fast == n) return slow.data;
    	   else if(head == null) return -1;
    	}
    	while(head!=null){
    	    head = head.next;
    	    slow = slow.next;
    	}
    	return slow.data;
    	   
    	
    }
    
}
