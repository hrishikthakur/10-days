import java.util.* ;
import java.io.*; 
public class Solution {
    
    public static long merge(long[] arr, int l, int mid, int r){
        int i = l;
        int j = mid + 1;
        int k = l;
        long[] temp = new long[arr.length];
        long inversions = 0;
        while(i <= mid && j <= r){
            if(arr[j] < arr[i]){
                inversions = inversions + (mid - i) + 1;
                temp[k++] = arr[j++];
            }else if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            }
        }
        
        while(i <= mid)
            temp[k++] = arr[i++];
        
        while(j <= r)
            temp[k++] = arr[j++];
        
        for(int z = l; z <= r; z++)
            arr[z] = temp[z];
            
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
