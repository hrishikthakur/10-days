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
