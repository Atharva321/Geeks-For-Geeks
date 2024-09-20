class Solution {
    // Returns count buildings that can see sunlight
    public int countBuildings(int[] height) {
        // code here
        int max = height[0];
        int cnt = 1;
        for(int i=1; i<height.length; i++){
            if(max < height[i]){
                max = height[i];
                cnt++;
            }
        }
        
        return cnt;
    }
}
