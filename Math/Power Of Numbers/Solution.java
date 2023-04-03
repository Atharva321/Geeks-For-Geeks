// Time  : O(logn)
// Space : O(1)

class Solution
{
        
    long mod = 1000000007;
    
    long power(int N,int R)
    {
        //Your code here
        if(R==0) return 1;
        long p = power(N, R/2);
        if(R%2==1){
            return (N*p)%mod*p%mod;
        }
        return (p*p)%mod;
    }

}
