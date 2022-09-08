// Assuming all to elements to be +ve
class Solution {
    
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                
                if(matrix[i][j] == 0) {
                    int idx = i - 1;
                    while(idx >= 0){
                        matrix[idx][j] = (matrix[idx][j] == 0) ? 0 : -1;
                        idx--;
                    }
                    idx = i + 1;
                    while(idx < n){
                        matrix[idx][j] = (matrix[idx][j] == 0) ? 0 : -1;
                        idx++;
                    }
                    idx = j - 1;
                    while(idx >= 0){
                        matrix[i][idx] = (matrix[i][idx] == 0) ? 0 : -1;
                        idx--;
                    }
                    idx = j + 1;
                    while(idx < m){
                        matrix[i][idx] = (matrix[i][idx] == 0) ? 0 : -1;
                        idx++;
                    }
                }
                
            }
        }
        
        for(int i = 0; i < matrix.length; i++)
            for(int j = 0; j < matrix[0].length; j++)
                if(matrix[i][j] == -1) matrix[i][j] = 0;
        
    }
}
