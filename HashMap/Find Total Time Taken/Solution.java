// Time  : O(n)
// Space : O(n)

class Solution
{
    public static long totalTime(int n,int arr[],int time[])
    {
        HashSet<Integer> hset =  new HashSet<>();
        int totalTime = 0;
        hset.add(arr[0]);
        
        for(int i=1; i<arr.length; i++){
            if(hset.contains(arr[i])){
                totalTime += time[arr[i]-1];
            }
            else{
                totalTime++;
                hset.add(arr[i]);
            }
        }
        return totalTime;
    }
}
