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
    static double medianOfArrays(int n, int m, int a[], int b[]) 
    {
        // Your Code Here
        // int min = Math.min(a[0], b[0]);
        // int max = Math.max(a[n-1], b[m-1]);
        // return (min + max)/2;
        
        int numbers = n+m;
        int mdFirst = -1;
        int mdSecond= -1;
        if(n==0){
            if(m%2==0){
                mdFirst = numbers/2;
                mdSecond= mdFirst+1;
                double sum = b[mdFirst-1]+b[mdFirst];
                return sum/2;
            }
            else{
                mdFirst = (numbers+1)/2;
                return b[mdFirst-1];
            }
        }
        else if(m==0){
            if(n%2==0){
                mdFirst = numbers/2;
                mdSecond= mdFirst+1;
                double sum = a[mdFirst-1]+a[mdFirst];
                return sum/2;
            }
            else{
                mdFirst = (numbers+1)/2;
                return a[mdFirst-1];
            }
        }
        
        // if(n==1){
        //     ArrayList<Integer> nums = new ArrayList<>();
            
        //     //even
        //     if(numbers%2==0){
        //         mdFirst = numbers/2;
        //         mdSecond= mdFirst+1;
        //         int arr1 = 0, arr2 = 0;
        //         while(arr1<n){
        //             if(a[arr1]<b[arr2]){
        //                 nums.add(a[arr1]);
        //                 arr1++;
        //                 if(nums.size() <= mdSecond){
        //                     double sum = nums.get(mdFirst-1)+nums.get(mdFirst);
        //                     return sum/2;
        //                 }
        //             }
        //             else{
        //                 nums.add(b[arr2]);
        //                 if(nums.size() <= mdSecond){
        //                     double sum = nums.get(mdFirst-1)+nums.get(mdFirst);
        //                     return sum/2;
        //                 }
        //                 arr2++;
        //             }
        //         }
        //         for(int i = arr2; i<m && nums.size()<=mdSecond; i++){
        //             nums.add(b[i]);
        //         }
        //         double sum = nums.get(mdFirst-1)+nums.get(mdFirst);
        //         return sum/2;
        //     }
            
        //     //odd
        //     else{
        //         mdFirst = (numbers+1)/2;
        //         int arr1 = 0, arr2 = 0;
        //         while(arr1<n){
        //             if(a[arr1]<b[arr2]){
        //                 nums.add(a[arr1]);
        //                 arr1++;
        //                 if(nums.size() <= mdFirst){
        //                     return nums.get(mdFirst-1);
        //                 }
        //             }
        //             else{
        //                 nums.add(b[arr2]);
        //                 if(nums.size() <= mdFirst){
        //                     return nums.get(mdFirst-1);
        //                 }
        //                 arr2++;
        //             }
        //         }
        //         for(int i = arr2; i<m && nums.size()<=mdFirst; i++){
        //             nums.add(b[i]);
        //         }
        //         return nums.get(mdFirst-1);
        //     }
        // }
        // else if(m==1){
        //     ArrayList<Integer> nums = new ArrayList<>();
            
        //     //even
        //     if(numbers%2==0){
        //         mdFirst = numbers/2;
        //         mdSecond= mdFirst+1;
        //         int arr1 = 0, arr2 = 0;
        //         while(arr2<m){
        //             if(b[arr2]<a[arr1]){
        //                 nums.add(b[arr2]);
        //                 arr2++;
        //                 if(nums.size() <= mdSecond){
        //                     double sum = nums.get(mdFirst-1)+nums.get(mdFirst);
        //                     return sum/2;
        //                 }
        //                 break;
        //             }
        //             else{
        //                 nums.add(a[arr1]);
        //                 if(nums.size() <= mdSecond){
        //                     double sum = nums.get(mdFirst-1)+nums.get(mdFirst);
        //                     return sum/2;
        //                 }
        //                 arr1++;
        //             }
        //         }
        //         for(int i = arr1; i<n && nums.size()<=mdSecond; i++){
        //             nums.add(a[i]);
        //         }
        //         double sum = nums.get(mdFirst-1)+nums.get(mdFirst);
        //         return sum/2;
        //     }
            
        //     //odd
        //     else{
        //         mdFirst = (numbers+1)/2;
        //         int arr1 = 0, arr2 = 0;
        //         while(arr2<m){
        //             if(b[arr2]<a[arr1]){
        //                 nums.add(b[arr2]);
        //                 arr2++;
        //                 if(nums.size() <= mdFirst){
        //                     return nums.get(mdFirst-1);
        //                 }
        //                 break;
        //             }
        //             else{
        //                 nums.add(a[arr1]);
        //                 if(nums.size() <= mdFirst){
        //                     return nums.get(mdFirst-1);
        //                 }
        //                 arr1++;
        //             }
        //         }
        //         for(int i = arr1; i<n && nums.size()<=mdFirst; i++){
        //             nums.add(a[i]);
        //         }
        //         return nums.get(mdFirst-1);
        //     }
        // }
        
        //even
        if(numbers % 2==0){
            mdFirst = numbers/2;
            mdSecond= mdFirst+1;
            int i = 0;
            int j = 0;
            int k = 0;
            ArrayList<Integer> nums = new ArrayList<>();
            int arr1 = 0, arr2 = 0;
            while (i < n && j < m) {
                if (a[i] <= b[j]) {
                    nums.add(a[i]);
                    i++;
                } 
                else {
                    nums.add(b[j]);
                    j++;
                }
                k++;
                if(nums.size() == mdSecond){
                    double sum = nums.get(mdFirst-1)+nums.get(mdFirst);
                    return sum/2;
                }
            }
            
            if (i < m) {
                for (int p = i; p < m; p++) {
                    nums.add(a[p]);
                    k++;
                    if(nums.size() == mdSecond){
                        double sum = nums.get(mdFirst-1)+nums.get(mdFirst);
                        return sum/2;
                    }
                }
            } 
            else {
                for (int p = j; p < n; p++) {
                    nums.add(b[p]);
                    k++;
                    if(nums.size() == mdSecond){
                        double sum = nums.get(mdFirst-1)+nums.get(mdFirst);
                        return sum/2;
                    }
                }
            }
            double sum = nums.get(mdFirst-1)+nums.get(mdFirst);
            return sum/2;
        }
        
        //odd
        else{
            int i = 0;
            int j = 0;
            int k = 0;
            mdFirst = (numbers+1)/2;
            ArrayList<Integer> nums = new ArrayList<>();
            int arr1 = 0, arr2 = 0;
            while (i < n && j < m) {
                if (a[i] <= b[j]) {
                    nums.add(a[i]);
                    i++;
                } 
                else {
                    nums.add(b[j]);
                    j++;
                }
                k++;
                if(nums.size() == mdFirst){
                        return nums.get(mdFirst-1);
                }
            }
            
            if (i < m) {
                for (int p = i; p < m; p++) {
                    nums.add(a[p]);
                    k++;
                    if(nums.size() == mdFirst){
                        return nums.get(mdFirst-1);
                    }
                }
            } 
            else {
                for (int p = j; p < n; p++) {
                    nums.add(b[p]);
                    k++;
                    if(nums.size() == mdFirst){
                        return nums.get(mdFirst-1);
                    }
                }
            }
            return nums.get(mdFirst-1);
        }
    }
}
