//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws Exception
	 {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        while(testCase-- > 0)
        {
            String data = br.readLine();
            Solution obj = new Solution();
            System.out.println(obj.isIsogram(data)?"1":"0");
            
        }
	 }
}
// } Driver Code Ends


// Time  : O(n)
// Space : O(1)

class Solution
{
    //Function to check if a string is Isogram or not.
    static boolean isIsogram(String S){
        //Your code here
        int [] map = new int [128];
        
        for(int i=0; i<S.length(); i++){
            map[S.charAt(i)]++;
        }
        
        for(int i=0 ;i<128; i++){
            if(map[i] > 1){
                return false;
            }
        }
        return true;
    }
}
