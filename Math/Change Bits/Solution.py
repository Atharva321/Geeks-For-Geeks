#User function Template for python3
import math
class Solution:
    def changeBits(self, N):
        # code here 
        a = int(math.log(N,2) + 1)
        a = pow(2,a) - 1
        return a-N,a

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__': 
    t = int (input ())
    for _ in range (t):
        N=int(input())
        
        ob = Solution()
        ans = ob.changeBits(N)
        
        print(ans[0],ans[1])
# } Driver Code Ends
