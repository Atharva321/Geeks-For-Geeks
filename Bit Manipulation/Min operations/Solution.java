//{ Driver Code Starts
import java.io.*;
import java.util.*;

/*
5  : 0101
12 : 1100
*/

// Time  : O(1)
// Space : O(1)

class Solution {
    public static int solve(int a, int b) {
        // code here
        if(a == b) return 0;
        
        if(a==0 || b==0) return 1;
        
        int x = a&b;
        
        // When one number can be converted to other number. 
        // Example: a=11101,b=101 here since last 3 bits are same 
        // we just have to remove first 2 bits from a to make it 
        // equal to b.(can be done by taking and with b)   -> 1 move. 
        if(a==x || b==x) return 1;
        
        //Convert both nos to 0:  a&0, b&0 -> 2 moves
        return 2;
    }
}
        
