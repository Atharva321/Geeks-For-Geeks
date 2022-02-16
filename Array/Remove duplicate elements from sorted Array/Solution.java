class Solution {
    int remove_duplicate(int arr[],int N){
        // code here
        //first is index of current unique number.
        int first =0;
        
        for(int second=1;second<N;second++){
            //for adding new unique element
            if(arr[first]!=arr[second]){ 
                //as first is an index of previous unique element so increasing it.
                arr[++first]  = arr[second];
            }
        }
        return first+1; //because its index.
    }
}
