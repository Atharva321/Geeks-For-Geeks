//{ Driver Code Starts
import java.io.*;
import java.util.*;


class GFG {
	public static void main (String[] args) {
		
		//taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking total testcases
		int t = sc.nextInt();
		
		while(t-- > 0){
		    
		    //taking count of stairs
		    int m = sc.nextInt();
		    
		    //creating an object of class DynamicProgramming
		    Solution obj = new Solution();
		    
		    //calling method countWays() of class
		    //DynamicProgramming
		    System.out.println(obj.countWays(m));
		    
		}
		
	}
}
// } Driver Code Ends


class Solution
{
    //Function to count number of ways to reach the nth stair.
    int countWays(int n)
    {
        
        // your code here
        int firstStair = 0;
        int secondStair= 1;
        int totalWays  = 0;
        for(int stairOfNumber = 1; stairOfNumber <= n; stairOfNumber++){
            totalWays   = (firstStair + secondStair) % (1000000000 + 7);
            firstStair  = secondStair;
            secondStair = totalWays;
        }
        return totalWays;
    }
}

