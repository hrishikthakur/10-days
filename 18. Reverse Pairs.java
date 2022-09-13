// O(n^2)
class Solution {
    public int reversePairs(int[] nums) {
        int pairs = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] > nums[j] * 2) pairs++;
            }
        }
        
        return pairs;
    }
}
