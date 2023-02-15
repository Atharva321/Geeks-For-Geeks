class Solution {
    
    List<String> ans = new ArrayList<>();
    
    public List<String> generateParenthesis(int n) {
        parenthesesGenerator(0, 0, "", n);
        return ans;
    }
    
    public void parenthesesGenerator(int open, int close, String  curr, int n){
        if(curr.length() == n*2){
            ans.add(curr);
            return;
        }
        
        if(open < n){
            parenthesesGenerator(open+1, close, curr+'(', n);
        }
        
        if(open > close) { 
            parenthesesGenerator(open, close+1, curr+')', n);
        }
    }
}
