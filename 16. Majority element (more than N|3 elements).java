// MOORE VOTING ALGORITHM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int num1 = -1, num2 = -1, c1 = 0, c2 = 0;
        for(int element : nums){
            if(element == num1) c1++;
            else if(element == num2) c2++;
            else if(c1 == 0){
                num1 = element;
                c1++;
            }else if(c2 == 0){
                num2 = element;
                c2++;
            }else{
                c1--;
                c2--;
            }
        }
        
        c1 = 0; c2 = 0;
        for(int element : nums){
            if(element == num1) c1++;
            else if(element == num2) c2++;
        }
        
        List<Integer> res = new ArrayList<>();
        if(c1 > nums.length / 3) res.add(num1);
        if(c2 > nums.length / 3) res.add(num2);
        return res;
    }
}
