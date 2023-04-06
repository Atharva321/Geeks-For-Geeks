//User function Template for Java
class Solution {
    static int findMaxLen(String S) {
        // code here
        
        int maxLen = 0;
        
        int openBrackets = 0, closedBrackets = 0;
        
        for(int i=0; i<S.length(); i++){
            
            if(S.charAt(i) =='(')
                openBrackets++;
            else
                closedBrackets++;
            
            if(openBrackets == closedBrackets){
                maxLen = Math.max(maxLen, openBrackets + closedBrackets);
            }
            else if(closedBrackets > openBrackets){
                openBrackets = closedBrackets = 0;
            }
        }
      
      
        // reversecheck for testcase: ())(  
        openBrackets = closedBrackets = 0;
        
        for(int i=S.length() - 1; i>0; i--){
            
            if(S.charAt(i) =='(')
                openBrackets++;
            else
                closedBrackets++;
            
            if(openBrackets == closedBrackets){
                maxLen = Math.max(maxLen, openBrackets + closedBrackets);
            }
            else if(openBrackets > closedBrackets){
                openBrackets = closedBrackets = 0;
            }
        }
        
        return maxLen;
    }
};
