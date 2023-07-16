class Solution 
{ 
    ArrayList<Integer> solve(int N, ArrayList<Integer> A, int Q, ArrayList<Integer> Query) 
    { 
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        if(Q == 1){
            A.add(Query.get(0), Query.get(1));
            return A;
        }
        else if(Q == 2){
            int lastFound = A.lastIndexOf(Query.get(0));
            ans.add(lastFound);
            return ans;
        }
        else{
            ans.add(-1);
            return ans;
        }
    }
}
