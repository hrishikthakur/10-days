
// GFG
class Solution 
{ 
	static boolean search(int matrix[][], int n, int m, int x) 
	{  
	    int i = 0, j = m - 1;
	    while(i < n && j >= 0){
	        if(matrix[i][j] == x) return true;
	        else if(x < matrix[i][j]) j--;
	        else i++;
	    }
	    
	    return false;
	} 
} 

// LeetCode (can be done by any of the above methods)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0) return false;
        
        int n = matrix.length;
        int m = matrix[0].length;

        int left = 0;
        int right = (m * n) - 1;
        
        while(left <= right){
            int mid = (left + (right - left) / 2);
            int i = mid / m, j = mid % m;
            
            if(matrix[i][j] == target) return true;
            else if(target < matrix[i][j]) right = mid - 1;
            else left = mid + 1;
        }
        
        return false;
    }
}
