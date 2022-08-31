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
            int n = Integer.parseInt(br.readLine().trim());
            String[] s = br.readLine().trim().split(" ");
            int[] nums = new int[n];
            for(int i = 0; i < n; i++)
                nums[i] = Integer.parseInt(s[i]);
            Solution obj = new Solution();
            int[] ans = obj.DistinctSum(nums);
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
    public int[] DistinctSum(int[] nums)
    {
        // Code here
        int sum=0;
       for(int i=0;i<nums.length;i++){
           sum+=nums[i];
       }
       int ans[] = new int[sum+1];
       ans[0]=1;
       int[][] dp = new int[nums.length+1][sum+1];
       for(int i=0;i<=nums.length;i++){
           dp[i][0]=1;
       }
       for(int i=1;i<=nums.length;i++){
           for(int j=1;j<=sum;j++){
               if(nums[i-1]<=j){
                   if(dp[i-1][j]==1) dp[i][j]=1;
                   else dp[i][j]=dp[i-1][j-nums[i-1]];
               }else{
                   if(dp[i-1][j]==1) dp[i][j]=1;
                   else dp[i][j]=0;
               }
               
               if(dp[i][j]==1){
                   if(ans[j]==0) ans[j]=1;
               }
           }
       }
       int c=0;
       for(int i=0;i<=sum;i++){
           if(ans[i]==1) c++;
       }
       int arr[] = new int[c];
       int j=0;
       for(int i=0;i<=sum;i++){
           if(ans[i]==1){
               arr[j]=i;
               j++;
           }
       }
       return arr;
    }
}
