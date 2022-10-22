//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.fillingBucket(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int fillingBucket(int n) {
        // code here
        int mod = 100000000;
        int prev1 = 1, prev2 = 1;
        for(int i = 2; i <= n; i++){
            int curr = (prev1%mod + prev2%mod);
            prev1 = prev2%mod;
            prev2 = curr%mod;
        }
        return prev2;
    }
};
