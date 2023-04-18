# User function Template for python3
# Time  : O(1)
# Space : O(1)

class Solution:
    
    #Function to reverse words in a given string.
    def reverseWords(self,S):
        # code here 
        S = ".".join(S.split(".")[::-1])
        return S
    
if __name__ == '__main__':
    t = int(input())
    for i in range(t):
        s = str(input())
        obj = Solution()
        print(obj.reverseWords(s))

# } Driver Code Ends
