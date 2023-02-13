class Solution{
    static int toyCount(int N, int K, int arr[])
    {
        // code here
        Arrays.sort(arr);
        
        if(arr[0] > K) return 0;
        
        int toys = 0, i = 0;
      
        while(K > 0 && i < N){
            if(K >= arr[i]) toys++;
            
            K -= arr[i++];
        }
        
        return toys;
    }
}
