class Solution{
    public int NumberofLIS(int N, int nums[]){
        // Code here
        if(nums.length == 1) return 1;
        
        int [] cnt = new int [nums.length];
        int [] dp = new int [nums.length];
        
        Arrays.fill(dp, 1);
        Arrays.fill(cnt, 1);
        int lis = 1;
        
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<i; j++){
                if(nums[j] < nums[i]){
                    if(dp[i] < dp[j] + 1){
                        dp[i] = dp[j] + 1;
                        cnt[i] = cnt[j];
                    }
                    else if(dp[i] == dp[j]+1){
                        cnt[i]+=cnt[j]  ;
                    }
                }
            }
            // System.out.print(dp[i] + " ");
        }
        
        for(int i=0; i<nums.length; i++){
            if(lis < dp[i]){
                lis = dp[i];
            }
        }
        int count = 0;
        
        for(int i=0; i<nums.length; i++){
            if(lis == dp[i]){
                count += cnt[i];
            }
        }
        
        // System.out.println();
        
        return count;
    }
}
