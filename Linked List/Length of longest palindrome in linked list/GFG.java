//{ Driver Code Starts
import java.util.*;
import java.lang.Math;
class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
		next=null;
	}
}
class PalindromeLL{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			Node head=null;
			head=insert(head,sc.nextInt());
			for(int i=1;i<n;i++)
				insert(head,sc.nextInt());
			GfG g=new GfG();
			System.out.println(g.maxPalindrome(head));
		}
	}
	public static Node insert(Node head,int val){
		if(head==null)
			return new Node(val);
		head.next=insert(head.next,val);
		return head;
	}
	/*public static void print(Node head){
		while(head!=null){
			System.out.println(head.data);
			head=head.next;
		}
	}*/
}
// } Driver Code Ends


/*Complete the function below
Node is as follows:
class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
		next=null;
	}
}*/
class GfG
{
         static int maxLength;
        private static void check(ArrayList<Integer> al, int l, int r){
              while (l >= 0 && r < al.size() && al.get(l) == al.get(r)) {
                l--;
                r++;
            }  
            
            if (r - l - 1 >= maxLength) {
                maxLength = r - l - 1;
            }
        }
        
        public static int maxPalindrome(Node head)
        {
          //add code here.
          if(head==null) return 0;
          ArrayList<Integer> al = new ArrayList<>();
          Node sen = head;
          while(sen!=null){
              al.add(sen.data);
              sen=sen.next;
          }
          maxLength = 0;
          for(int i = 0; i < al.size(); i++){
              check(al,i,i);
              check(al,i,i+1);
          }
          return maxLength;
        }
}
