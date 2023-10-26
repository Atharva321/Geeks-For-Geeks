// Time  : O(logn)
// Space : O(1)

class Solution
{
    public int minOperation(int n)
    {
        //code here.
        int num = n;
        int operations = 0;
        while(num!=0){
            if(num%2 == 0){
                num /= 2;
                operations++;
            }
            else{
                num--;
                operations++;
            }
        }
        return operations;
    }
}
