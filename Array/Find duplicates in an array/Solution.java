class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int[] counter = new int[n];
        boolean flag = false;
        for(int i=0; i<n;i++){
            counter[arr[i]]++;
            if(counter[arr[i]]>1){
                flag = true;
            }
        }
        if(flag==false){ 
            list.add(-1);
            return list;
        }
        for(int i=0; i<n;i++){
            if(counter[i]>1){
                list.add(i);
            }
        }
        return list;
    }
}
