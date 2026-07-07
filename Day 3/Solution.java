class Solution {
    public int maxSubArray(int[] nums) {
        // 1. Initialize variables
        int maxSum = Integer.MIN_VALUE; // Our "high score", starts at lowest possible value
        int currentSum = 0;             // Our running total

        // 2. Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Add the current number to our running total
            currentSum += nums[i];

            // 3. Update the high score if our current sum is bigger
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            // 4. The Kadane's Reset: If our running total drops below zero, 
            // it's useless for future subarrays. Reset it to 0.
            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }
}