// Time  : O(n)
// Space : O(1)

class Solution{
    static int findWinner(int n, int A[]){
        // code here
        
        int totalXor = 0;
        
        for(int i=0; i<n; i++){
            totalXor = totalXor ^ A[i];
        }
        
        if(totalXor == 0){
            return 1;
        }
        
        return (n % 2) + 1;
    }
}
