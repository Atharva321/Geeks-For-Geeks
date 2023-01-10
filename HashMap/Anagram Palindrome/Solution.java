//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
{
    public static void main (String[] args)
    {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i=0;i<t;i++){
		    String s = in.next();
		    if (new Sol().isPossible (s) == 1)
		        System.out.println ("Yes");
		    else
		        System.out.println ("No");
		}
	}
}

// Contributed By: Pranay Bansal


// } Driver Code Ends

// Time  : O(n)
// Space : O(1)
class Sol
{
    int isPossible (String S)
    {
        // your code here
        int [] map = new int [128];
        for(int i=0; i<S.length(); i++){
            map[S.charAt(i)]++;
        }
        boolean flag = false;
        for(int i=0 ;i<128; i++){
            if(map[i] % 2 == 1){
                if(flag == false){
                    flag = true;
                }
                else{
                    return 0;
                }
            }
        }
        return 1;
    }
}
