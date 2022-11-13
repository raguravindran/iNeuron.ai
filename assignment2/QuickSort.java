class QuickSort {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low-1; // -1
        for (int j = low; j <= high-1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return i+1;
    }
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partition = partition(arr, low, high);
            quickSort(arr, low, partition-1);
            quickSort(arr, partition+1, high);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,4,4,4,4,5,6,9,22,3,4,5,22,4};
        quickSort(arr, 0, arr.length-1);

        for (int x = 0; x < arr.length; x++) {
            System.out.print(arr[x]);
            if (x != arr.length-1) {
                System.out.print(",");    
            }
            
        }
    }
}
