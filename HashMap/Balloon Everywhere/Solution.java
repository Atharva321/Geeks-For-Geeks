//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.maxInstance(s);
            out.println(ans);
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int maxInstance(String s) {
        // Code here
        int[] chars = new int [26];
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c== 'a' || c=='b' || c=='l' || c=='o' || c=='n'){
                chars[c - 'a']++;
            }
        }
        
        int min = Math.min(chars[0], chars[1]);
        min = Math.min(min, chars['l' - 'a']/2);
        min = Math.min(min, chars['o' - 'a']/2);
        min = Math.min(min, chars['n' - 'a']);
        return min;
        
    }
}
