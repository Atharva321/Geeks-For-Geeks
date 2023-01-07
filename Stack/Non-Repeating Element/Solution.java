//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class GFG {
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		while(testcases-- > 0){
		    
		    int n = Integer.parseInt(br.readLine());
		    int arr[] = new int[n];
		    
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split(" ");
		    
		    for(int index = 0;index < n; index++){
		        arr[index] = Integer.parseInt(elements[index]);
		    }
		    
		    Check obj = new Check();
		    
		    System.out.println(obj.firstNonRepeating(arr,n));
		        
		}
		
	}
}


// } Driver Code Ends


//User function Template for Java

class Check{
    // Time  : O(n)
    // Space : O(2n) ~ O(n)
    public int firstNonRepeating(int arr[], int n) 
    { 
        // Complete the function
        int firstUnique = -1;
        HashSet<Integer> hset = new HashSet<>();
        Stack<Integer> st = new Stack<>();
        for(int i=n-1; i>=0; i--){
            if(!hset.contains(arr[i])){
                hset.add(arr[i]);
                firstUnique = arr[i];
                st.push(arr[i]);
            }
            else{
                
                if(st.size() > 1 && arr[i] == st.peek()){
                    st.pop();
                    firstUnique = st.peek();
                }
            }
        }
        return firstUnique;
    }  
    
}

