//{ Driver Code Starts
import java.util.*;

// queue
// q.add() 1 2 3
// q.peek(); 1 2 3
// q.remove 2 3

// stack
// st.push 1 2 3
// st.pop() 1 2

class Queues
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    //Function to push an element into stack using two queues.
    void push(int a)
    {
	    // Your code here	
	    q1.add(a);
    }
    
    //Function to pop an element from stack using two queues. 
    int pop()
    {
	    // Your code here
	    if(q1.isEmpty()) return -1; 
	    while(q1.size() != 1){
	        q2.add(q1.remove());
	    }
	    while(q2.size() != 0){
	        q1.add(q2.remove());
	    }
	    return q1.remove(); 
    }
	
}

