// Time  : O(n)
// Space : O(26)

import java.util.*;
import java.lang.*;
import java.io.*;

// User function Template for Java

class Solution {
    public int maxInstance(String s) {
        // Code here
        int[] chars = new int [26];
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c== 'a' || c=='b' || c=='l' || c=='o' || c=='n'){
                chars[c - 'a']++;
            }
        }
        
        int min = Math.min(chars[0], chars[1]);
        min = Math.min(min, chars['l' - 'a']/2);
        min = Math.min(min, chars['o' - 'a']/2);
        min = Math.min(min, chars['n' - 'a']);
        return min;
        
    }
}
