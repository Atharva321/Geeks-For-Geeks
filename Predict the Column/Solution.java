class Solution
{
    int columnWithMaxZeros(int arr[][], int N)
    {
        // code here 
        int index = -1;
        int minSum = Integer.MAX_VALUE;
        
        for(int  col = 0; col < arr[0].length; col++){
            int row = 0;
            int sum = 0;
            while(row < arr.length){
                sum = sum + arr[row][col];
                row++;
            }
            if(minSum > sum){
                minSum = sum;
                if(sum < arr.length)
                index = col;
            }
        }
        
        return index;
    }
}
