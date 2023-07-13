// Time  : O(n)
// Space : O(n)

class Solution {
    public static boolean isFrequencyUnique(int n, int[] arr) {
        // code here
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int num: arr){
            hmap.put(num, hmap.getOrDefault(num, 0)+1);
        }
        
        HashSet<Integer> hset = new HashSet<>();
        
        for(int value : hmap.values()){
            if(hset.contains(value)){
                return false;
            }
            else{
                hset.add(value);
            }
        }
        
        return true;
    }
}
