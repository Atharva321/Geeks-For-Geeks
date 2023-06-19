// Time  : O(n)
// Space : O(1)

class Solution
{
 
    // arr: input array
    // n: size of array
    //Function to rearrange an array so that arr[i] becomes arr[arr[i]]
    //with O(1) extra space.
    static void arrange(long arr[], int n)
    {
        // your code here
        long nums = (long)n;
        
        for(int i=0;i<n;i++)
        {
            long rem = arr[(int)arr[i]]%n;
            arr[i] = rem*n +arr[i];
        }
        
        for(int i=0;i<n;i++)
        {
            arr[i] = arr[i]/n;
        }
    }
}
