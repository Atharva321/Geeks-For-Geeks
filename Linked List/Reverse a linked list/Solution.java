class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        // code here
        Node list = head;
        if(head.next == null) return head;
        else if(head.next.next==null) {
            list =  head.next;
            
             head.next.next = head;
             head.next = null; 
            return list;
        }
        Node first = head, second = head.next, third = head.next.next;
        first.next = null;
    
        //Using two pointers method.
        while(third!=null){
            second.next = first;
            first  = second;
            second = third;
            third = third.next;
        }
        second.next = first;
        first = second;
        return first;
    }
}
