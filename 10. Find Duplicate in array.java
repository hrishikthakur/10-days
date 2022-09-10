// Hashing -> Time:O(N), Space:O(N)
class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int[] hash = new int[n + 1];
        for(int i = 0; i < n; i++){
            if(hash[nums[i]] == 0) hash[nums[i]]++;
            else return nums[i];
        }
        
        return 0;
    }
}

// LL Cycle Detection
class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow != fast);
        
        fast = nums[0];
        while(fast != slow){
            slow = nums[slow];
            fast = nums[fast];
        }
        
        return fast;
    }
}
