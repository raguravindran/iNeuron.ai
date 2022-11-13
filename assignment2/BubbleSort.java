class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,3,4,4,4,4,4,5,6,9,22,3,4,5,22,4};
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr.length; j++) {
                if (arr[j] > arr[i]) {
                   int temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
                }
            }
        }

        for (int x = 0; x < arr.length; x++) {
            System.out.print(arr[x]);
            if (x != arr.length-1) {
                System.out.print(",");    
            }
            
        }
    }
}
