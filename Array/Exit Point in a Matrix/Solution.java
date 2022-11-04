//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] matrix = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().split(" ");
                for(int j = 0; j < m; j++){
                    matrix[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution ob = new Solution();
            int[] ans = ob.FindExitPoint(matrix);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int[] FindExitPoint(int[][] matrix)
    {
        // code here
        int direction = 0, row = 0, column = 0;
        //directions
        while(row >=0 && row < matrix.length && column >=0 && column < matrix[0].length){
            
            direction = (direction + matrix[row][column]) % 4;
            if(matrix[row][column] == 1){
                matrix[row][column] = 0;
            }
            //right
            if(direction == 0){
                column++;
            }
        
            //down
           if(direction == 1){
                row++;
            }
        
            //left
            if(direction == 2){
                column--;
            }
        
            //up
            if(direction == 3){
                row--;
            }
        }
        int[] ans = new int [2];
        ans[0] = row;
        ans[1] = column;
            
            if(direction == 0){
                ans[1]--;
                return ans;
            }
        
            //down
           if(direction == 1){
                ans[0]--;
                return ans;
            }
        
            //left
            if(direction == 2){
                ans[1]++;
                return ans;
            }
        
            //up
            ans[0]++;
            return ans;
    }
}
