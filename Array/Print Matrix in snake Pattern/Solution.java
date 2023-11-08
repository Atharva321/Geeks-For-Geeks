class Solution
{
    //Function to return list of integers visited in snake pattern in matrix.
    static ArrayList<Integer> snakePattern(int matrix[][])
    {
        // code here 
        ArrayList<Integer> snakePrinter = new ArrayList<>();
        int direction = 1;
        int col = 0;
        for(int row=0; row < matrix.length; row++){
            
            
            while(col < matrix[0].length && col >= 0){
                snakePrinter.add(matrix[row][col]);
                col += direction;
            }
            
            direction = direction * -1;
            col = col + direction;
        }
        
        return snakePrinter;
    }
}
