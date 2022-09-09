// BRUTE -> Using 2 for loop
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            int currSum = 0;
            for(int j = i; j < nums.length; j++){
                currSum += nums[j];
                maxSum = Math.max(currSum, maxSum);
            }
           
        }
        
        return maxSum;
    }
}

// Using 1 for loop -> Kadane's algo
class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = nums[0];
        int maxSum = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(currSum > 0){
                currSum += nums[i];
            }else{
                currSum = nums[i];
            }
            maxSum = Math.max(currSum, maxSum);
        }
        
        return maxSum;
    }
}
