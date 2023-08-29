class Solution {
    public Node reverse(Node head) {
        Node current = head;
        Node previous = null;
        
        while (current != null) {
            Node temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        
        return previous;
    }
    
    public Node filterGreaterNodes(Node head) {
        Node current = head;
        Node filteredHead = null;
        Node filteredTail = null;
        
        while (current != null) {
            if (filteredHead == null || current.data >= filteredTail.data) {
                if (filteredHead == null) {
                    filteredHead = current;
                } else {
                    filteredTail.next = current;
                }
                filteredTail = current;
            }
            current = current.next;
        }
        
        if (filteredTail != null) {
            filteredTail.next = null;
        }
        
        return filteredHead;
    }
    
    public Node compute(Node head) {
        Node reversedHead = reverse(head);
        Node filteredHead = filterGreaterNodes(reversedHead);
        return reverse(filteredHead);
    }
}
