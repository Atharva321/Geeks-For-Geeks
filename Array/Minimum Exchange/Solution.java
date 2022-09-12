//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s1 = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s1[0]);
            int m = Integer.parseInt(s1[1]);
            char[][] matrix = new char[n][m];
            for(int i = 0; i < n; i++){
                String S = br.readLine().trim();
                for(int j = 0; j < m; j++){
                    matrix[i][j] = S.charAt(j);
                }
            }
            Solution obj = new Solution();
            int ans = obj.MinimumExchange(matrix);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution
{
    public int MinimumExchange(char[][] matrix)
    {
        // Code here
        int m = matrix.length;
        int n = matrix[0].length;
        int cost1 = 0, cost2=0;
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                char req_ch = (i%2==j%2 ? 'A' : 'B');
                
                if(req_ch!=matrix[i][j]) cost1++;
                else cost2++;
            }
        }
        
        return Math.min(cost1, cost2);    }
}
