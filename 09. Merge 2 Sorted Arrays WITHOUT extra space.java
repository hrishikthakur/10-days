// Insertion Sort Algo -> Time:O(n + m), Space:O(1)
// Assuming swapping & sorting is of O(1)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0) return;
        if(m == 0) {
            int i = 0;
            for(int x : nums2){
                nums1[i] = x;
                i++;
            }
        }
        int i = 0;
        while(i < m){
            if(nums1[i] > nums2[0]){
                int temp = nums1[i];
                nums1[i] = nums2[0];
                nums2[0] = temp;
                // sirf ek element ko apni sahi jagah place karna hai
                // Insertion sort would work best here
                Arrays.sort(nums2);
            }
            i++;
        }
        
        for(int x : nums2){
            nums1[i] = x;
            i++;
        }
    }
}

// Gap method -> Time:O(n + m), Space:O(1)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int idx = m;
        for(int x : nums2){
            nums1[idx] = x;
            idx++;
        }
        
        int gap = (int)Math.ceil((m + n) / 2.0);
        while(gap > 0){
            int i = 0, j = i + gap;
            while(i < nums1.length && j < nums1.length){
                if(nums1[i] > nums1[j]){
                    int temp = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = temp;
                }
                i++;
                j++;
            }
            gap = (gap == 1) ? 0 : (int)Math.ceil(gap / 2.0);
        }
    }
}
