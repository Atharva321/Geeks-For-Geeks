// Time  : O(n)
// Space : O(n)

class Solution
{ 
    static void reverse(Stack<Integer> st)
    {
        // add your code here
        Queue<Integer> q = new LinkedList<>();
        
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        
        while(!q.isEmpty()){
            st.push(q.poll());
        }
    }
}
