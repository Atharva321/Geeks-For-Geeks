// Time  : O(n*n!)
// Space : O(n)

class Solution
{
    public void permutationFinder(int index, int len, ArrayList<String> permutations, char [] string){
        if(index == len){
            permutations.add(new String(string));
            return;
        }
        
        for(int currIndex =index; currIndex < len; currIndex++){
            swap(currIndex, index, string);
            permutationFinder(index + 1, len, permutations, string);
            swap(currIndex, index, string);
        }
    }
    
    public ArrayList<String> permutation(String S)
    {
        //Your code here
        char [] string = S.toCharArray();
        
        int len = string.length;
        
        if(len == 0 || len == 1){
            ArrayList<String> permutations = new ArrayList<>();
            permutations.add(S);
            return permutations;
        }
        
        ArrayList<String> permutations = new ArrayList<>();
        
        permutationFinder(0, len, permutations, string);
        Collections.sort(permutations);
        
        return permutations;
    }
    
    public void swap(int first, int second, char [] string){
        char temp;
        temp  = string[first];
        string[first] = string[second];
        string[second] = temp;
    }
	   
}
