// Using hash array -> Time:O(N), Space:O(N)
public class Solution {
    public int[] repeatedNumber(final int[] A) {
        int n = A.length + 1;
        int[] hash = new int[n];
        for(int i = 0; i < A.length; i++)
            hash[A[i]]++;
        
        int[] res = new int[2];
        for(int i = 1; i <= A.length; i++){
            if(hash[i] == 2) res[0] = i;
            if(hash[i] == 0) res[1] = i;
        }
        
        return res;
    }
}


// MATHS -> Time:O(N), Space:O(1)
1

// BITS -> Time:O(N), Space:O(1)
