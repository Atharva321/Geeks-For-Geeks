#User function Template for python3
class Solution:
    def noOfWays (self, n):
        # code here 
        return n*n+2-n

#{ 
 # Driver Code Starts
#Initial Template for Python 3
if __name__ == '__main__': 
    t = int (input ())
    for _ in range (t):
        n = int(input())
        
        ob = Solution()
        print(ob.noOfWays(n))
# } Driver Code Ends
