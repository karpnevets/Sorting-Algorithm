public class Bubble_Sort {
    /**Bubble Sort has terrible time complexity.
     * I wrote it while studying algorithms,
     * but I do not recommend using this for sorting.**/
    public void bubble_sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr.length - i == 1) return;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1]; arr[j-1] = temp;
                }
            }
        }
    }
}
