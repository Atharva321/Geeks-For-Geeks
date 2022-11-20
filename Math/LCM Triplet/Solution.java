//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long N = Long.parseLong(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.lcmTriplets(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    long lcmTriplets(long N) {
        // code here
        
        //if num is less than or equal to 2 then obviously its
        //the required number
        if(N<=2){
            return N;
        }
        
        //if num is odd
        else if(N%2!=0){
            return (N-1)*N*(N-2);
        }
        
        //if num is even
        else if(N%2==0 && N % 3!=0){
            return N*(N-1)*(N-3);
        }
          
        //if num is divisible by 6
        return (N-1)*(N-2)*(N-3);
        
    }
}
