//{ Driver Code Starts

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
            System.out.println(ob.waysToBreakNumber(N));
        }
    }
}
// } Driver Code Ends


// Time : O(1)
// Space: O(1)

class Solution{
    int waysToBreakNumber(int N){
        // code here
        int mod= 1000000007;
        long num = N;
        return (int)((3*num+((num-1)*(num-2))/2)%mod);
    }
}
