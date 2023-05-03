// Time  : O(1)
// Space : O(1)

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class Solution {
    // function to return sum of  1, 2, ... n
    long seriesSum(int n) {
        // code here
        // Using direct formula of series summation.
        return (long)n * (n+1)/2;
    }
}
