//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.countFactors(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
/*
Time  Complexity: O(sqrt(N))
Space Complexity: O(1)
*/

class Solution{
    static int countFactors(int N) {
        //code here
        
        /*
        Example: 
        number : 100
        factors: 1 2 4 5 10 25 50 100;
        */
        
        int factors = 0;
        //All factors comes with pair(like : (2,50) (4,25), etc.) 
        //if we take from 1 to 10 and till square root of 100
        
        //So, we will iterate till square root of N;
        for(int factor=1; factor*factor<=N; factor++){
            
            //Check whether factor of N.
            if(N%factor == 0){
                    //i*i == N
                if(N/factor == factor){
                    factors++;
                }
            
                //So, we will increase factors by 2 each time
                else if(N%factor == 0) factors+=2;
            }
        }
        return factors;
    }
}
