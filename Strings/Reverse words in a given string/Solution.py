# User function Template for python3
// Time  : O(n)
// Space : O(n)

class Solution:
    
    #Function to reverse words in a given string.
    def reverseWords(self,S):
        # code here 
        S = ".".join(S.split(".")[::-1])
        return S
#{ 
 # Driver Code Starts
# Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for i in range(t):
        s = str(input())
        obj = Solution()
        print(obj.reverseWords(s))

# } Driver Code Ends
