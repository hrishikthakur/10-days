import java.util.* ;
import java.io.*; 
public class Solution {
    
    public static long merge(long arr[], int l, int mid, int r)
    {
         int lSize = mid - l + 1;
         int rSize = r - mid;
         
         long[] L = new long[lSize + 1];
         long[] R = new long[rSize + 1];
         
         for(int i = 0; i < lSize; i++)
            L[i] = arr[i + l];
         for(int i = 0; i < rSize; i++)
            R[i] = arr[i + mid + 1];
         
         L[lSize] = R[rSize] = Long.MAX_VALUE;   
         
         // Merge
         long inversions = 0;
         int lIdx = 0;
         int rIdx = 0;
         for(int i = l; i <= r; i++){
             if(L[lIdx] <=  R[rIdx]){
                 arr[i] = L[lIdx];
                 lIdx++;
             }else{
                 inversions = inversions + ((lSize - 1) - lIdx + 1);
                 arr[i] = R[rIdx];
                 rIdx++;
             }
         }
        
        return inversions;
    }
    
    public static long mergeSort(long arr[], int l, int r){
        int inversions = 0;
        if(l < r){
            int mid = (l + r) / 2;
            inversions += mergeSort(arr, l, mid);
            inversions += mergeSort(arr, mid + 1, r);
            inversions += merge(arr, l, mid, r);
        }
        return inversions;
    }
    
    public static long getInversions(long arr[], int n) {
        long[] cpy = new long[n];
        for(int i = 0; i < n; i++)
            cpy[i] = arr[i];
        return mergeSort(cpy, 0, n - 1);
    }
}
