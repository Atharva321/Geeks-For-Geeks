// Time  : O(n)
// Space : O(1)

//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int K = Integer.parseInt(read.readLine().trim());
            
            String S = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.kLevelSum(K,S));
        }
    }
}
// } Driver Code Ends


class Solution {
    static int kLevelSum(int K, String S) {
        // code here

        int sum=0 , level=-1;

        for(int i=0; i<S.length(); i++){
            if(S.charAt(i)=='(') level++;
            else if(S.charAt(i)==')') level--;
            else{
                if(K==level){
                    String st="";
                    st+=S.charAt(i);
                    while(S.charAt(i+1)!='('){
                        i++;
                        st+=S.charAt(i);
                    }
                    sum+=Integer.parseInt(st);
                }
            }
        }
        return sum;
    }
};
