//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.nthFibonacci(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

//User function Template for Java
class Solution {
    static long nthFibonacci(long n){
        // code here
        if(n<=1) return n;
        long a=0;
        long b=1;
        long ans=0;
        for(long i=2;i<=n;i++){
            ans=(a+b);
            ans%=1000000007;
            a=b;
            b=ans;
        }
        return ans;
    }
}
