//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Driver
{
    public static void main(String args[]) 
	{ 
	    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int []a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            
            int  m= sc.nextInt();
            int []b = new int[m];
            for (int i = 0; i < m; i++) b[i] = sc.nextInt();
            
            double res = new GFG().medianOfArrays(n, m, a, b);
            
            if (res == (int)res) System.out.println ((int)res);
            else System.out.println (res);
        }
    		
	} 
}
// } Driver Code Ends


//User function Template for Java

class GFG 
{ 
    static double medianOfArrays(int n, int m, int A[], int B[]) 
    {
        // Your Code Here
        
        int mdFirst = -1;
        int mdSecond= -1;
        int numbers = n+m;
        boolean isEven = true;
        if(numbers%2==0){
            mdFirst = numbers/2;
            mdSecond = mdFirst+1;
        }
        else{
            isEven = false;
            mdFirst = (numbers+1)/2;
        }
        
        
        
        ArrayList<Integer> nums = new ArrayList<>();
        int a   = 0;
        int b   = 0;
        int num = 0;
        int count = 0;
        while(a < n && b <m){
            if(A[a] < B[b]){
                nums.add(A[a]);
                a++;
                count++;
                if(isEven && nums.size() == mdSecond){
                    double sum = nums.get(mdFirst-1)+nums.get(mdFirst);
                    return sum/2;
                }
                else if(!isEven && nums.size() == mdFirst){
                    return nums.get(mdFirst-1);
                }
            }
            else{
                nums.add(B[b]);
                b++;
                count++;
                if(isEven && nums.size() == mdSecond){
                    double sum = nums.get(mdFirst-1)+nums.get(mdFirst);
                    return sum/2;
                }
                else if(!isEven && nums.size() == mdFirst){
                    return nums.get(mdFirst-1);
                }
            }
        }
        
        while(a < n){
            nums.add(A[a]);
            a++;
            count++;
                if(isEven && nums.size() == mdSecond){
                    double sum = nums.get(mdFirst-1)+nums.get(mdFirst);
                    return sum/2;
                }
                else if(!isEven && nums.size() == mdFirst){
                    return nums.get(mdFirst-1);
                }
        }
        
        while(b < m){
            nums.add(B[b]);
            b++;
            count++;
                if(isEven && nums.size() == mdSecond){
                    double sum = nums.get(mdFirst-1)+nums.get(mdFirst);
                    return sum/2;
                }
                else if(!isEven && nums.size() == mdFirst){
                    return nums.get(mdFirst-1);
                }
        }
        return -1;
    }
}
