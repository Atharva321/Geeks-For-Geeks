import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s[] = read.readLine().split(" ");
            int N = Integer.parseInt(s[0]);
            int M = Integer.parseInt(s[1]);
            int A[][] = new int[N][M];
            for (int i = 0; i < N; i++) {
                String S[] = read.readLine().split(" ");
                for (int j = 0; j < M; j++) {
                    A[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution ob = new Solution();
            int ans[][] = ob.rotateMatrix(N, M, A);
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) System.out.print(ans[i][j] + " ");
                System.out.println();
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int[][] rotateMatrix(int M, int N, int Mat[][]) {
        // code here
        int row = 0, col = 0;
      int prev, curr;
      // we have to just move all outter most number one step forward in cycle
     

      
      while (row < M && col < N)
      {
   
          if (row + 1 == M || col + 1 == N)
              break;
   
          
          prev = Mat[row + 1][col];
   
          // top wall
          for (int i = col; i < N; i++)
          {
              curr = Mat[row][i];
              Mat[row][i] = prev;
              prev = curr;
          }
          row++;
   
          // right wall
          for (int i = row; i < M; i++)
          {
              curr = Mat[i][N-1];
              Mat[i][N-1] = prev;
              prev = curr;
          }
          N--;
   
          
          if (row < M)
          {  //bottom wall
              for (int i = N-1; i >= col; i--)
              {
                  curr = Mat[M-1][i];
                  Mat[M-1][i] = prev;
                  prev = curr;
              }
          }
          M--;
   
          
          if (col < N)
          {  // left wall
              for (int i = M-1; i >= row; i--)
              {
                  curr = Mat[i][col];
                  Mat[i][col] = prev;
                  prev = curr;
              }
          }
          col++;
      }
      return Mat;
    }
}
