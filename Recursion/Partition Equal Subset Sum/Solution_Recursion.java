/**
 * Time Complexity: O(2^n), where n is the number of elements in the 'numbers' array. 
 *  In the worst case, the function explores all possible subsets of the input array.
 *
 * Space Complexity: O(n), due to the recursive call stack.
**/


class Solution{
    
    public static boolean isPossibleToPartitionEqually(int targetSum, int[] numbers, int currentIndex) {
        if (targetSum <= 0 || currentIndex < 0) {
            return targetSum == 0;
        }
        return isPossibleToPartitionEqually(targetSum - numbers[currentIndex], numbers, currentIndex - 1)
            || isPossibleToPartitionEqually(targetSum, numbers, currentIndex - 1);
    }


    static int equalPartition(int N, int numbers[])
    {
        // code here
        int totalSum = 0;
        for (int number : numbers) {
            totalSum += number;
        }

        if (totalSum % 2 != 0) {
            return 0;
        }

        int targetSum = totalSum / 2;
        if(isPossibleToPartitionEqually(targetSum, numbers, numbers.length - 1)== true) return 1; 
        return 0;
    }
}
