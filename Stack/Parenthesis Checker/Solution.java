class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> st=new Stack<>();
         for(int i=0;i<x.length();i++){

                 if((st.empty()==false) && ((x.charAt(i)==')' && st.peek()=='(') || (x.charAt(i)=='}' 
                         && st.peek()=='{') || (x.charAt(i)==']') && st.peek()=='[')){
                     st.pop();
                 }
             else
                 st.push(x.charAt(i));
         }
         return (st.empty())?true:false;
    }
}
