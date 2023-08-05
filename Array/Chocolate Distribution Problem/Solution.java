// Time  : O(nlogn)
// Space : O(1)

class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        long diff = (long)Integer.MAX_VALUE;
        int i=0;
        while(i+m <= n){
            diff = Math.min(diff,(long) a.get(i+m-1) - a.get(i));
            // System.out.println(diff);
            i++;
        }
        return diff;
    }
}
