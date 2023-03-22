// Time  : O(1)
// Space : O(1)

class Solution
{
    // Function to check if Kth bit is set or not.
    static boolean checkKthBit(int n, int k)
    {
        // Your code here
        return (n&1<<k)==0? false : true;
    }
    
}
