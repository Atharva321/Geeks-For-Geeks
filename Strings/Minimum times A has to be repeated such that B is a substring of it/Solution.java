//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String A = read.readLine();
            String B = read.readLine();

            Solution ob = new Solution();
            out.println(ob.minRepeats(A,B));
        }
        out.close();
    }
}
// } Driver Code Ends

//User function Template for Java

// Time  : O(|a|*|b|)
// Space : O(|b|)

class Solution {
    static int minRepeats(String A, String B) {
        // code here
        int repeatitions = 1;
        if(A.equals(B)) return repeatitions;
        
        String repeatedString = A;
        while(repeatedString.length() < B.length()){
            repeatedString += A;
            repeatitions++;
        }
        
        if(repeatedString.contains(B)) return repeatitions;
        else{
            repeatedString += A;
            repeatitions++;
            if(repeatedString.contains(B)) return repeatitions;
        }
        
        return -1;
    }
};
