Time  :
Space :

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

class Solution
{
    //Function to return k largest elements from an array.
    public static ArrayList<Integer> kLargest(int arr[], int n, int k)
    {
        // code here 
        Arrays.sort(arr);
        
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=n-1; i>=n-k; i--){
            ans.add(arr[i]);
        }
        return ans;
    }
}
