// Time  : O(n)
// Space : O(1)

class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        int [] isPresent = new int [1000001];
        for(int i=0; i < size; i++){
            if(arr[i] > 0){
                isPresent[arr[i]]++;
            }
        }
        
        for(int i=1; i<isPresent.length; i++){
            if(isPresent[i] == 0){
                return i;
            }
        }
        return -1;
    }
}
