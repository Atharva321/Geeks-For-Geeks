// Time  : O(n^2)
// Space : O(1)

class Solution
{ 
    boolean isPresent(String currStr, String str, int k){
        if(str.length() < k) return false;
        if(currStr.length() < k) return false;
        for(int i=0; i<k; i++){
            if(currStr.charAt(i) != str.charAt(i)){
                return false;
            }
        }
        return true;
    }
    
    public int klengthpref(String[] arr, int n, int k, String str)
    {
        // code here
        int strings = 0;
        for(int i=0; i<arr.length; i++){
            
            if(isPresent(arr[i], str, k)) strings++;
        }
        return strings;
    }
}
