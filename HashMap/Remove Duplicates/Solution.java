// Time  : O(n)
// Space : O(1)

class Solution {
    String removeDups(String s) {
        // code here
        int [] charFreqMap = new int [26];
        Arrays.fill(charFreqMap, 0);
        String ans = "";
        
        for(int i=0; i<s.length(); i++){
            charFreqMap[s.charAt(i) - 'a']++;
            if(charFreqMap[s.charAt(i) - 'a'] == 1){
                ans += s.charAt(i);
            }
        }
        return ans;
    }
}
