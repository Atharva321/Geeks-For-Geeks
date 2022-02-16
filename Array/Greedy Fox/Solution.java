// { Driver Code Starts
//Initial Template for Java


//Initial Template for Java


import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function Template for Java


class GFG 
{ 
    // Returns sum of longest 
    // increasing subarray. 
    static int largestSum(int arr[], int N) 
    {
        int sum = 0, max = arr[0];
        
        for(int i=0; i<N-1; i++){
            
            if(arr[i] < arr[i+1]){
                if(sum == 0) sum = arr[i];
                sum += arr[i+1];
            }
            //System.out.println(sum);
            if(arr[i] >= arr[i+1]){
                sum = 0;
            }
            if(max < sum) max = sum;
            //System.out.println(max);
        }
        return max;
    }
}


// { Driver Code Starts.

// Driver class
class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		// looping through all testcases
		while(testcases-- > 0){
		    int N=Integer.parseInt(br.readLine());
		    String line1 = br.readLine();
		    String[] a1 = line1.trim().split("\\s+");
		    int arr[]=new int[N];
		    for(int i=0;i<N;i++)
		    {
		        arr[i]=Integer.parseInt(a1[i]);
		    }
		    GFG ob=new GFG();
		    int ans=ob.largestSum(arr,N);
		    System.out.println(ans);
		    
		}
	}
}
  // } Driver Code Ends
