class Solution
{ 
    // Function to find starting and end index 
    static int[] findIndex(int a[], int N, int key) 
    { 
        //code here.
         int index [] = new int[2];
       int first = -1;
       int last = -1;
       for(int i=0;i<N;i++){
           if(a[i] == key && first==-1){
               first=i;
           }
           if(a[i] == key){
               last = i;
           }
       }
       index[0] = first;
       index[1] = last;
       return index;
    }
}
