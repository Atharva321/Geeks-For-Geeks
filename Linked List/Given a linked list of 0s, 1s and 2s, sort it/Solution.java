// Time  : O(n)
// Space : O(1)

class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        // add your code here
        int zero = 0;
        int one = 0;
        int two = 0;
        Node temp = head;
        while(temp != null){
            if(temp.data == 0) zero++;
            if(temp.data == 1)  one++;
            if(temp.data == 2)  two++;
            temp = temp.next;
        }
        
        temp = head;
        while(temp != null && zero != 0){
            temp.data = 0;
            temp = temp.next;
            zero--;
        }
        
        while(temp != null && one != 0){
            temp.data = 1;
            temp = temp.next;
            one--;
        }
        
        while(temp != null && two != 0){
            temp.data = 2;
            temp = temp.next;
            two--;
        }
        
        return head;
    }
}
