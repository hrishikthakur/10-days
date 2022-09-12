// Using HashMap
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }
        
        int element = 0;
        int count = 0;
        for(int key : hm.keySet()){
            if(hm.get(key) > count){
                count = hm.get(key);
                element = key;
            }
        }
        
        return element;
    }
}

// MOORE VOTING ALGORITHM
class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int element = 0;
        for(int i = 0; i < nums.length; i++){
            if(count == 0) element = nums[i];
            if(nums[i] == element) count++;
            else count--;
        }
        
        return element;
    }
}
