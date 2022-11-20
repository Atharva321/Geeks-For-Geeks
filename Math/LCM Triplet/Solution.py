#User function Template for python3

class Solution:
    def lcmTriplets(self,N):
        #code here
        
        #Divisible by 2
        if N<=2:
            return N
        elif N%2!=0:
            return (N-1)*N*(N-2)
        elif N%2==0 and N % 3!=0:
            return N*(N-1)*(N-3)
        elif(N%2==0 and N%3==0): 
            return (N-1)*(N-2)*(N-3);

#{ 
 # Driver Code Starts
#Initial Template for Python 3

import math
        
if __name__=='__main__':
    t=int(input())
    for _ in range(t):
        N = int(input())
        ob=Solution()
        print(ob.lcmTriplets(N))
# } Driver Code Ends
