// Time  : O(Max(str, patt)) ~ O(n)
// Space : O(1)

class Solution
{
    //Function to find the minimum indexed character.
    public static int minIndexChar(String str, String patt)
    {
        // Your code here
        int [] chars = new int [26];
        for(int i=0; i<patt.length(); i++){
            chars[patt.charAt(i) - 'a']++;
        }
        for(int i=0; i<str.length(); i++){
            if(chars[str.charAt(i) - 'a']!=0) return i;
        }
        
        return -1;
    }
}
