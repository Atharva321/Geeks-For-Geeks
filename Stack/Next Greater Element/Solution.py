#User function Template for python3


class Solution:
    def nextLargerElement(self,arr,n):
        #code here
       stack = [0]
       res = [-1]*n
       
       for i in range(1,n):
           while stack and arr[i] > arr[stack[-1]]:
               res[stack.pop()] = arr[i]
               
           stack.append(i)
           
       return res
