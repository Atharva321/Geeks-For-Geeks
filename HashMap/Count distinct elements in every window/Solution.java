//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.util.HashMap;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) 
                a[i] = sc.nextInt();
            Solution g = new Solution();
            
            ArrayList<Integer> ans = g.countDistinct(a, n, k);

            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
            t--;
        }
    }
}
// } Driver Code Ends


class Solution
{
    ArrayList<Integer> countDistinct(int arr[], int n, int k)
    {
        // code here 
        // Time  : O(n)
        // Space : O(k)
        ArrayList<Integer> distinctElements = new ArrayList<>();

        if(k>n) return distinctElements;
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int window = 0;
        while(window<k){
            if(!hmap.containsKey(arr[window])){
                hmap.put(arr[window], 1);
            }
            else
            hmap.put(arr[window], hmap.get(arr[window])+1);

            window++;
        }

        for(int i=k; i<n; i++){
            distinctElements.add(hmap.size());
            
            hmap.put(arr[i-k], hmap.get(arr[i-k])-1);
            if(hmap.get(arr[i-k]) == 0) hmap.remove(arr[i-k]);
            hmap.put(arr[i], hmap.getOrDefault(arr[i], 0)+1);
        }
        distinctElements.add(hmap.size());

        return distinctElements;
    }
}

