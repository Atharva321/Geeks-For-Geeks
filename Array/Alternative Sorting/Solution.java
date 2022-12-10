//{ Driver Code Starts
//Initial Template for Java



//Initial Template for Java



import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java



class Solution
{
    ArrayList<Long> alternateSort(long arr[] ,int N)
    {
        
        ArrayList<Long> ans = new ArrayList<>();
        // Your code goes here
        Arrays.sort(arr);
       
        //count: keep track of elements
        int count = 0;
        int left = 0;
        int right= N-1;
        
        while(count < N){
            // 0 1 2 3 4 5 6
            // Conditions
            // Odd 
            // Ex: 7 -> 4 3
            // 7/2+1 = 4 , 7/2 = 3
            ans.add(arr[right--]);
            count++;
            // Even
            ans.add(arr[left++]);
            count++;
        }
        
        return ans;
    }
    // 7 1 2 3 4 5 6
    // 1 2 3 4 5 6 7
    // 7 1 6 2 5 3 4
    // 7 6 5 4
    // 1 2 3
}


//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
            int n = Integer.parseInt(br.readLine());
//            String line = br.readLine();
//            String[] a2 = line.trim().split("\\s+");
//            int n =Integer.parseInt(a2[0]);
//            int k =Integer.parseInt(a2[1]);
            //int y =Integer.parseInt(a2[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(a1[i]);
            }
            Solution ob = new Solution();
            //ArrayList<Long> ans=ob.smallestDifferenceTriplet(a,b,c,n);
            ArrayList<Long> ans = ob.alternateSort(a, n);
            for (int i = 0; i < n; i++) {
                System.out.print(ans.get(i) + " ");
            }
            System.out.println();
        }
    }
}




// } Driver Code Ends
