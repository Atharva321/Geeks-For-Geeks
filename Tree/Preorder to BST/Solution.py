# Time  : O(n)
# Space : O(h)

#User function Template for python3

class Node:

    def __init__(self, data=0):
        self.data = data
        self.left = None
        self.right = None

#Function that constructs BST from its preorder traversal.
def post_order(pre, size) -> Node:
    #code here
    Root_Node=Node(pre[0])
    for i in range(size):
       insert(Root_Node,pre[i])
    return Root_Node
   
def insert(root,val):
    if root==None:
       return Node(val)
    elif root.data>val:
       root.left=insert(root.left,val)
    elif root.data<val:
       root.right=insert(root.right,val)
    return root
   
   
#{ 
 # Driver Code Starts
#Initial Template for Python 3

#contributed by RavinderSinghPB
class Node:
    def __init__(self, data=0):
        self.data = data
        self.left = None
        self.right = None

def postOrd(root):
    if not root:
        return
    postOrd(root.left)
    postOrd(root.right)
    print(root.data,end=' ')

if __name__ == '__main__':
    t=int(input())

    for _tcs in range(t):
        size=int(input())
        pre=[int(x)for x in input().split()]

        root=post_order(pre,size)

        postOrd(root)
        print()
# } Driver Code Ends
