public class Selection_Sort {
    public void selection_sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min_val = arr[i];
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min_val){
                    min_val = arr[j];
                    min_index = j;
                }
            }
            arr[min_index] = arr[i]; arr[i] = min_val;
        }
    }
}
