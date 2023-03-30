// Time  :
// Space :

class Solution 
{ 
    String firstRepChar(String s) 
    { 
        // code here
        int [] charFreqMap = new int [26];
        Arrays.fill(charFreqMap, 0);
        
        for(int i=0; i<s.length(); i++){
            if(charFreqMap[s.charAt(i) - 'a'] >= 1){
                return "" + s.charAt(i);
            }
            charFreqMap[s.charAt(i) - 'a']++;
        }
        return "-1";
    }
} 
