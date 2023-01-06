//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int a[] = new int[n];
            
            int i = 0;
            for(i = 0; i < n; i++)
              a[i] = sc.nextInt();
              
            int[] s = new Solution().calculateSpan(a, n);
            
            for(i = 0; i < n; i++)
            {
                System.out.print(s[i] + " ");
            }
            
            System.out.println();
        }
    }
    
    
    
}
// } Driver Code Ends



class Solution
{
    static class Pair {
        int First;
        int Second;
    
        public Pair(int first, int second) {
        First = first;
        Second = second;
        }
    }
    
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n)
    {
        // Your code here
        int indx=0;
        int[] ans=new int[n];
        Stack<Pair>st=new Stack<>();
            
        for(int i=0;i<price.length;i++){
            if(st.size()==0){
                ans[indx++]=-1;
            }
            else if(st.size()>0 && st.peek().First>price[i]){
                ans[indx++]=st.peek().Second;
            }
            else if(st.size()>0 && st.peek().First<=price[i]){
                while(st.size()>0 && st.peek().First<=price[i]){
                    st.pop();
                }
                if(st.size()==0){
                    ans[indx++]=-1;
                }
                else {
                    ans[indx++]=st.peek().Second;
                }
            }
            st.push(new Pair(price[i],i));
         }
         
         for(int i=0;i<ans.length;i++){
             ans[i]=i-ans[i];
         }
         
         return ans;
    }
    
}
