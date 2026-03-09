public class quickSort {

    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low - 1;
        
        for(int j=low; j<high; j++){
            if(arr[j] <= pivot){
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }

    public static void QuickSort(int arr[], int low, int high){
        if(low >= high){
            return;
        }
        int pidx = partition(arr, low, high);
        
        QuickSort(arr, low, pidx-1);
        QuickSort(arr, pidx+1, high);

    }
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        int size = arr.length;

        QuickSort(arr, 0, size-1);

         for(int i=0; i<size; i++){
        System.out.println(arr[i]+" ");
       }
      System.out.println();

    }
}
