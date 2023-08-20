// Time  : O(n)
// Space : O(1)

class Solution {
    int count(int[] arr, int n, int x) {
        // code here
        int freq = 0;
        for(int i=0; i<n; i++){
            if(arr[i] == x) freq++;
        }
        
        return freq;
    }
}
