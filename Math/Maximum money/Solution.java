// Time  : O(1)
// Space : O(1)

class Solution {
    static int maximizeMoney(int N , int K) {
        // code here
        if(N%2 == 0) return K*(N/2);
        else return K*(N/2 + 1);
    }
};
