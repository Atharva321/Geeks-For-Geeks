// Time  : O(1)
// Space : O(1)

class Solution{
    int middle(int A, int B, int C){
        //code here
        int max = Math.max(A,Math.max(B,C));
        int min = Math.min(A,Math.min(B,C));
        
        int ans = A + B + C - (max + min);
        return ans;
    }
}
