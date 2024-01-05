// Time  : O(n)
// Space : O(n)

class Solution
{
    int mod = 1000000007;
    
    public int TotalWays(int N)
    {
        // Code here
        long result = (countWays(N) * countWays(N)) % mod;

        return (int) result;
    }
    
    public long countWays(int n) {
            if (n == 1) {
                return 2;
            }
            if (n == 2) {
                return 3;
            }

            long[] dp = new long[n + 1];
            dp[1] = 2;
            dp[2] = 3;

            for (int i = 3; i <= n; i++) {
                dp[i] = (dp[i - 1] + dp[i - 2]) % mod;
            }

            return dp[n];
        }
}
