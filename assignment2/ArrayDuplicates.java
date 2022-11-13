class ArrayDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,3,4,4,4,4,4,5,6,9,22,3,4,5,22,4};
        for (int i=0; i<arr.length; i++) {
            for (int j=i+1; j<arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(j);
                    break;
                }
            }
        }
    }
}
