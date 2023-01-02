//{ Driver Code Starts
import java.util.*;


class Solution
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			Queue g = new Queue();
			
			int q = sc.nextInt();
			while(q>0)
			{
				int QueryType = sc.nextInt();
				if(QueryType == 1)
				{
					int a = sc.nextInt();
					g.enqueue(a);
				}
				else if(QueryType == 2)
				System.out.print(g.dequeue()+" ");
			q--;
			}	
			System.out.println();
				
			
			
		t--;
		}
	}
}


// } Driver Code Ends

// stack
// st.push 1 2 3
// st.pop() 1 2

// queue
// q.add() 1 2 3
// q.peek(); 1 2 3
// q.remove 2 3

// result : 2 3
// 1 2 3
// st1    st2
// 1 2 -> 3
// 1   -> 3 2
// -1  -> 3 2 1

// st2
// 3 2
// num =  1

// st2    st1
// 3   -> 2
// -1  -> 2 3

class Queue
{
    Stack<Integer> input = new Stack<Integer>(); 
    Stack<Integer> output = new Stack<Integer>(); 
    
    /*The method pop which return the element poped out of the stack*/
    int dequeue()
    {
	    // Your code here
	    if(input.isEmpty() == true) return -1;
	    while(input.size() != 1){
	        output.push(input.pop());
	    }
	    int num = input.pop();
	    while(output.size() != 0){
	        input.push(output.pop());
	    }
	    return num;
    }
	
    /* The method push to push element into the stack */
    void enqueue(int x)
    {
	    // Your code here	
	    input.push(x);
    }
}

