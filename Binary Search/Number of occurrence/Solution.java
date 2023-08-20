// Time  : O(nlogn)
// Space : O(1)

class Solution {
    int count(int[] arr, int n, int x) {
        // code here
        int freq = 0;
        
        int index = binarySearch(arr, x);
        if(index == -1) return 0;
        
        int forwardIndex = index+1;
        while(index >= 0 && arr[index] == x){
            freq++;
            index--;
        }
        while(forwardIndex <= n-1 && arr[forwardIndex] == x){
            freq++;
            forwardIndex++;
        }
        
        return freq;
    }
    
    int binarySearch(int[] arr, int num){
        int left = 0;
        int right = arr.length - 1;
        
        while(left <= right){
            int mid = left + (right - left)/2;
            if(arr[mid] == num){
                return mid;
            }
            else if(arr[mid] > num){
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        
        return -1;
        
    }
}
