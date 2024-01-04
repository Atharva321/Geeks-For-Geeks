// Time  : O(nlogn)
// Space : O(1)

class Solution {
    static int singleElement(int[] arr , int N) {
        // code here
        
        if(arr.length == 1) return arr[0];
        
        int freq = 1;
        
        int n = arr.length;
        
        Arrays.sort(arr);
        
        for(int i = 0; i < n-1; i++){
            if(arr[i] != arr[i+1]){
                if(freq == 1) return arr[i];
                freq = 1;
            }
            else {
                freq++;
            }
        }
        
        if(arr[n - 2] != arr[n - 1]) return arr[n - 1];
        
        return -1;
    }
}
