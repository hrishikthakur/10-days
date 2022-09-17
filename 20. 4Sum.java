// Brute -> 3 pointer & Binary Search, Time:O(nlogn + n^3), Space:O(n)
class Solution {
    
    public static boolean binarySearch(int[] nums, int lo, int hi, long target){
        System.out.println(target);
        while(lo <= hi){
            int mid = (lo + hi) / 2;
            if(nums[mid] == target) return true;
            else if(target < nums[mid]) hi = mid - 1;
            else lo = mid + 1;   
        }
        return false;
    }
    
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        HashSet<List<Integer>> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                for(int k = j + 1; k < nums.length; k++){
                    long remTarget = (long)target - (long)nums[i] - (long)nums[j] - (long)nums[k];
                    if(binarySearch(nums, k + 1, nums.length - 1, remTarget) == true){
                        List<Integer> quad = new ArrayList<>();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[k]);
                        quad.add((int)remTarget);
                        Collections.sort(quad);
                        set.add(quad);
                    }
                }
            }
        }
        List<List<Integer>> res = new ArrayList<>();
        for(List<Integer> quad : set){
            res.add(quad);
        }
        return res;
    }
}
