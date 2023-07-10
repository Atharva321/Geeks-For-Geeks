// Time  : O(n)
// Space : O(1)

class Solution{
    int findFrequency(int nums[], int x){
        int freq = 0;
        for(int num: nums){
            if(num == x) freq++;
        }
        
        return freq;
    }
}
