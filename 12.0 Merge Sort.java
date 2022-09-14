class Solution
{
    public static void merge(int arr[], int l, int mid, int r)
    {
         int lSize = mid - l + 1;
         int rSize = r - mid;
         
         int[] L = new int[lSize + 1];
         int[] R = new int[rSize + 1];
         
         for(int i = 0; i < lSize; i++)
            L[i] = arr[i + l];
         for(int i = 0; i < rSize; i++)
            R[i] = arr[i + mid + 1];
         
         L[lSize] = R[rSize] = Integer.MAX_VALUE;   
         
         // Merge
         int Lidx = 0;
         int Ridx = 0;
         for(int i = l; i <= r; i++){
             if(L[Lidx] <=  R[Ridx]){
                 arr[i] = L[Lidx];
                 Lidx++;
             }else{
                 arr[i] = R[Ridx];
                 Ridx++;
             }
         }
    }

    public static void mergeSort(int arr[], int l, int r)
    {
        if(l < r){
            int mid = (l + r) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
    }
}
