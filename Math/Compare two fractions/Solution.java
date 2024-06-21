// Time  : O(n)
// Space : O(1)

class Solution {

    String compareFrac(String str) {
        // Code here
        String [] num = str.split(", ");
        String [] num1 = num[0].split("/");
        String [] num2 = num[1].split("/");
        
        // System.out.println(num1[0] + " " + num1[1]);
        // System.out.println(num2[0] + " " + num2[1]);
        
        double ans1 = ((double)Integer.parseInt(num1[0]))/Integer.parseInt(num1[1]);
        double ans2 = ((double)Integer.parseInt(num2[0]))/Integer.parseInt(num2[1]);
        
        // System.out.println(ans1 + " " + ans2);
        
        if(ans1 == ans2) return "equal";
        else if(ans1 < ans2) return num[1];
        
        return num[0];
    }
}
