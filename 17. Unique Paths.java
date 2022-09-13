// DP
class Solution {
    
    public int up(int srcRow, int srcCol, int destRow, int destCol, int[][] dp){
        if(srcRow == destRow && srcCol == destCol) return 1;
        if(srcRow > destRow || srcCol > destCol) return 0;
        
        if(dp[srcRow][srcCol] != -1) return dp[srcRow][srcCol];
        
        int right = up(srcRow, srcCol + 1, destRow, destCol, dp);
        int down = up(srcRow + 1, srcCol, destRow, destCol, dp);
        
        dp[srcRow][srcCol] = right + down;
        return dp[srcRow][srcCol];
    }
    
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i = 0; i < m; i++)
            Arrays.fill(dp[i], -1);
        return up(0, 0, m - 1, n -1, dp);
    }
}

// Using Combination 
class Solution {
    public int uniquePaths(int m, int n) {
        int N = m + n - 2;
        int r = m - 1;
        double res = 1;
        for(int i = 1; i <= r; i++)
            res = res * (N - r + i) / i;
        
        return (int)res;
    }
}
