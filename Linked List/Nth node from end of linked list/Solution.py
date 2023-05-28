# Time  :
# Space :

#User function Template for python3
'''
	Your task is to return the data stored in
	the nth node from end of linked list.
	
	Function Arguments: head (reference to head of the list), n (pos of node from end)
	Return Type: Integer or -1 if no such node exits.

	{
		# Node Class
		class Node:
		    def __init__(self, data):   # data -> value stored in node
		        self.data = data
		        self.next = None
	}
'''
#Function to find the data of nth node from the end of a linked list
def getNthFromLast(head,n):
    fast = 0
    slow = head

    while fast != n:
        head = head.next
        fast += 1
        if head is None and fast == n:
            return slow.data
        elif head is None:
            return -1

    while head is not None:
        head = head.next
        slow = slow.next

    return slow.data
