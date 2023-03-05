//{ Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	 
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine()); 

        while(t-- > 0){
            int size = Integer.parseInt(br.readLine());
            String[] arrStr = ((String)br.readLine()).split("\\s+");
            int[] arr= new int[size];
            for(int i = 0;i<size;i++){
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            System.out.println(new Solution().minJumps(arr));
        }
	 }
	 
}

// } Driver Code Ends


class Solution{
    static int minJumps(int[] arr){
        // your code here
        int jumps = 0;
        int currSum = 0;
        int max = 0;
        for(int i = 0; i < arr.length-1; i++) {
            max = Math.max(arr[i]+i, max);
            if(i == currSum) {
                if(arr[i] == 0 && max <= arr[i]+i)
                    return -1;
                jumps++;
                currSum = max;
            }
        }
        return jumps;
    }
}
