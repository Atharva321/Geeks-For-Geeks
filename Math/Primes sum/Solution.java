// Time  : O(n)
// Space : O(n*sqrt(n))

class Solution {
    static String isSumOfTwo(int N){
        // code here
        if(N==1) return "No";
        boolean[] isPrime = new boolean [N+1];
         isPrime[0] = isPrime[1] = false;
        for (int i = 2; i <= N; i++)
            isPrime[i] = true;
        for(int i=2; i*i<=N; i++)
        {
            if(isPrime[i] == true){
                for(int j=2*i; j<=N; j=j+i)
                {
                    isPrime[j]=false;
                }
            }
        }
        
        for(int i=2; i<=N/2; i++){
            if(isPrime[i]){
                if(isPrime[N-i]){
                    return "Yes";
                } 
            }
        }
        return "No";
    }
}
