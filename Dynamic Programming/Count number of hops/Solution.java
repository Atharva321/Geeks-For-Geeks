class Solution
{
    //Function to count the number of ways in which frog can reach the top.
    static long countWays(int n)
    {
        // add your code here
        int first = 1;
        int second = 2;
        int third = 4;
        int mod = 1000000007;
        
        if(n==1) return first;
        if(n==2) return second;
        if(n==3) return third;
        
        for(int i=4; i<=n; i++){
            int curr = ((first + second)%mod + third)%mod;
            first = second;
            second = third;
            third = curr;
        }
        return third;
    }
    
}
