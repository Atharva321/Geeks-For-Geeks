# Time  : O(n)
# Space : O(n)

def reaching_height (n, arr) : 
    #Complete the function
   if(n==1):
       return arr
   arr.sort()
   i = 0 
   j = n-1
   result = [0 for i in range(n)]
   k = 0
   while(i<=j):
       if(k%2==0):
           result[k] = arr[j]
           j-=1
       else:
           result[k] = arr[i]
           i+=1
       k+=1
   if(result[0] == result[-1]):
       return [-1]
   return result
