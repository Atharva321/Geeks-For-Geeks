// Time  : O(nlogn)
// Space : O(n)

class Solution {
    static long maxDiamonds(int[] A, int N, int K) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        long diamonds = 0;
        
        for(int i=0; i<A.length; i++){
            pq.add(A[i]);
        }
        
        while(!pq.isEmpty() && K>0){
            int mostDiamonds = pq.poll();
            diamonds = diamonds + mostDiamonds;
            mostDiamonds = mostDiamonds/2;
            pq.add(mostDiamonds);
            K--;
        }
        
        return diamonds;
    }
};
