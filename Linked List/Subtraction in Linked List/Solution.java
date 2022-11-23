//{ Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.subLinkedList(first, second);
            printList(res);
        }
    }
}

// } Driver Code Ends


/* Structure of Linked list node

class Node
{
	int data;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}

*/
/*
Java Accepted Solution 250/250 Testcases:

Approach:

Convert the two linked list into Strings num1 and num2
Remove Leading Zeroes the num1 and num2
Subtract both the Strings and store that string in answer
Subtract character by character while handling the carry.  Read  Resource
Remove Leading Zeroes from the answer.
Convert the answer string into the LinkedList.

*/
class Solution
{
    //Remove Leading Zeroes.
    static String removeLeadingZeroes(String s) {
        
        StringBuilder sb = new StringBuilder(s);
        
        //Loop till Leading Zeroes present in string.
        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        if(sb.length() == 0){ 
            sb.append("0");
        }
        return sb.toString();
    }
    
    // Returns true if str1 is smaller than str2.
    static boolean isSmaller(String str1, String str2)
    {
        // Calculate lengths of both string
        int n1 = str1.length(), n2 = str2.length();
        if (n1 < n2)
            return true;
        if (n2 < n1)
            return false;
 
        for (int i = 0; i < n1; i++)
            if (str1.charAt(i) < str2.charAt(i))
                return true;
            else if (str1.charAt(i) > str2.charAt(i))
                return false;
 
        return false;
    }
 
    // Function for find difference of larger numbers
    static String findDiff(String str1, String str2)
    {
        // Before proceeding further, make sure str1
        // is not smaller
        if (isSmaller(str1, str2)) {
            String t = str1;
            str1 = str2;
            str2 = t;
        }
 
        // Take an empty string for storing result
        String str = "";
 
        // Calculate length of both string
        int n1 = str1.length(), n2 = str2.length();
 
        // Reverse both of strings
        str1 = new StringBuilder(str1).reverse().toString();
        str2 = new StringBuilder(str2).reverse().toString();
 
        int carry = 0;
 
        // Run loop till small string length
        // and subtract digit of str1 to str2
        for (int i = 0; i < n2; i++) {
            // Subtract digit by digit
            int sub
                = ((int)(str1.charAt(i) - '0')
                   - (int)(str2.charAt(i) - '0') - carry);
 
            // If subtraction is less than zero
            // we add then we add 10 into sub and
            // take carry as 1 for calculating next step
            if (sub < 0) {
                sub = sub + 10;
                carry = 1;
            }
            else
                carry = 0;
 
            str += (char)(sub + '0');
        }
 
        // subtract remaining digits of larger number
        for (int i = n2; i < n1; i++) {
            int sub = ((int)(str1.charAt(i) - '0') - carry);
 
            // if the sub value is -ve, then make it
            // positive
            if (sub < 0) {
                sub = sub + 10;
                carry = 1;
            }
            else
                carry = 0;
 
            str += (char)(sub + '0');
        }
 
        // reverse resultant string
        return new StringBuilder(str).reverse().toString();
    }
    
    static Node subLinkedList(Node l1, Node l2)
    {
        // code here
        
        //If first LL is null.
        if(l1 == null && l2 == null){
            return l1;
        }
        
        //If first LL is null.
        else if(l1 == null){
            return l2;
        }
        
        //If second LL is null.
        else if(l2 == null){
            return l1;
        }
        
        //Store both linked list as a string
        
        String num1 = "";
        Node _num1 = l1;
        while(_num1!=null){
            num1 += _num1.data;
            _num1 = _num1.next;
        }
        num1 = removeLeadingZeroes(num1);
        
        String num2 = "";
        Node _num2 = l2;
        while(_num2!=null){
            num2 += _num2.data;
            _num2 = _num2.next;
        }
        num2 = removeLeadingZeroes(num2);
        
        if(num1.equals(num2)) return new Node(0);
        
        String ans = findDiff(num1, num2);
        //System.out.println(ans);
        int zeroes = 0;
        while(ans.charAt(zeroes) == '0'){
            zeroes++;
            if(zeroes == ans.length()){
                return new Node(0);
            }
        }
        
        Node answer = new Node(ans.charAt(zeroes) - '0');
        answer.next = null;
        Node ans_head = answer;
        for(int i=zeroes+1; i<ans.length(); i++){
            Node temp = new Node(ans.charAt(i) - '0');
            temp.next = null;
            answer.next  = temp;
            answer = answer.next;
        }
        
        //subtracting two numbers
        /*        
            10
        -    1
        ________
             9
         */
         return ans_head;
    }
    
}
