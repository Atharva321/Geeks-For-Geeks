//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[][] arr = new int[n][n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = Integer.parseInt(inputLine[i * n + j]);
                }
            }

            new Solution().rotateMatrix(arr, n);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    out.print(arr[i][j] + " ");
                }
            }
            out.println();
        }
        out.flush();
    }
}
// } Driver Code Ends


//User function Template for Java



class Solution {
    void rotateMatrix(int arr[][], int n) {
        // code here
        
        //transpose
        for(int gapRow=0; gapRow < arr.length; gapRow++){
            for(int row = 0, column = gapRow; column < arr[0].length; row++, column++){
                int temp = arr[row][column];
                arr[row][column]=arr[column][row];
                arr[column][row] = temp;
            }
        }
        
        //column swap
        int upperRow = 0, lowerRow = arr.length - 1;
        while(upperRow < lowerRow){
            int column = 0;
            while(column < arr[0].length){
            int temp = arr[upperRow][column];
                arr[upperRow][column]=arr[lowerRow][column];
                arr[lowerRow][column] = temp;
                column++;
            }
            upperRow++;
            lowerRow--;
        }
    }
}
