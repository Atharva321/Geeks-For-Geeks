// Time  : O(n)
// Space : O(1)

class Solution{
    static long sumOfDivisors(int N){
        // code here
        long sum = 0;

        // All nums will came no. of times as a factors as we divide them.
        for(int i=1; i<=N; i++){
            int multiplier = N/i;
            sum = sum + i*multiplier;
        }
        return sum;
    }
}
