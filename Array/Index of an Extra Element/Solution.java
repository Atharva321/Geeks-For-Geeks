// Time  : O(n)
// Space : O(1)

class Solution {
    public int findExtra(int n, int arr1[], int arr2[]) {
        // add code here.
        for(int i=0; i<n; i++){
            if(i == n-1) return i;
            if(arr1[i] != arr2[i]){
                return i;
            }
        }
        return -1;
    }
}
