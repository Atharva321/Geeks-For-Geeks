// Time  : O(n)
// Space : O(1)

import java.lang.*;
import java.io.*;
import java.util.*;

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
