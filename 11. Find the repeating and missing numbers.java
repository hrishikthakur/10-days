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
public class Solution {
    
    public int[] repeatedNumber(final int[] A) {
        int n = A.length;
        
        long sumOfNum = (((long) n) * ((long) n + 1)) / 2;
        long sumOfSq = (((long) n) * ((long) n + 1) * ((long) 2*n + 1)) / 6;
    
        for (int i=0; i < n; i++) {
            sumOfNum -= (long) A[i];
        }
 
        for (int i=0; i < n; i++) {
            sumOfSq -= (long) A[i] * (long) A[i];
        }
        
        long sumNum = sumOfSq/sumOfNum;
        
        int missing = (int) (sumNum + sumOfNum)/2;
        int repeated = (int) (sumNum - missing);
        
        int[] res = new int[2];
        res[0] = repeated;
        res[1] = missing;
        
        return res;
    }
}

// BITS -> Time:O(N), Space:O(1)
