// Time  : O(n)
// Space : O(1)

class Solution {
    public static int distributeTicket(int N,int K)
    {
      // code here
        int left=1, right=N;
        int lastPerson = left;
        while(left<=right){
            if(left+K < right){
                left = left + K;
            }
            else{
                lastPerson = right;
                break;
            }
            if(left < right-K){
                right = right-K;
            }
            else{
                lastPerson = left;
                break;
            }
        }
        return lastPerson;
    }
}
