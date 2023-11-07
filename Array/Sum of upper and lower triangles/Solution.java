// Time  : O(n*n)
// Space : O(1)

class Solution
{
    //Function to return sum of upper and lower triangles of a matrix.
    static ArrayList<Integer> sumTriangles(int matrix[][], int n)
    {
        // code here
        int upperSum = 0;
        int lowerSum = 0;
        ArrayList<Integer> sum = new ArrayList<Integer>();
        
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(i <= j){
                    upperSum = upperSum + matrix[i][j];
                }
                if(i >= j){
                    lowerSum = lowerSum + matrix[i][j];
                }
            }
        }
        
        sum.add(upperSum);
        sum.add(lowerSum);
        
        return sum;
    }
}
