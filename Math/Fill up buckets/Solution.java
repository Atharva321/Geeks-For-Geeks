class Solution{
    public int totalWays(int n, int[] capacity) {
        // code here
        Arrays.sort(capacity);
        int mod=1000000007;
        long ans=1;
        for(int i=0;i<n;i++){
            ans=((ans%mod)*(capacity[i]-i))%mod;
        }
        return (int)ans;
    }
}
