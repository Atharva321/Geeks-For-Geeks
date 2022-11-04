//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            
            int matrix[][] = new int[n][n];
            
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.downwardDigonal(n, matrix);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static ArrayList<Integer> downwardDigonal(int N, int A[][])
    {
        // code here 
        int row = 0, column = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        //upper
        for(int gapColumn = 0; gapColumn < A[0].length; gapColumn++){
            for(row = 0, column = gapColumn; column >= 0; row++,column--){
                ans.add(A[row][column]);
            }
        }
        
        //lower
        for(int gapRow = 1; gapRow < A.length; gapRow++){
            for(row = gapRow, column = A[0].length-1; row <= A.length - 1; row++,column--){
                ans.add(A[row][column]);
            }
        }
        
        return ans;
    }
}
