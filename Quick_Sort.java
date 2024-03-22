public class Quick_Sort {
    public void quick_sort (int[] arr) {
        quick_sort(arr, 0, arr.length - 1);
    }
    private void quick_sort (int[] arr, int left, int right) {
        if (left >= right) return;
        int boundary = partition(arr, left, right);
        quick_sort(arr, left, boundary - 1);
        quick_sort(arr, boundary + 1, right);
    }
    private int partition(int[] arr, int left, int right) {
        int pivot = arr[left]; int lh = left + 1; int rh = right; /**Change pivot and traversal as you like**/
        while (true) {
            while (rh > lh && arr[rh] >= pivot) rh--;
            while (rh > lh && arr[lh] < pivot) lh++;
            if (rh == lh) break;
            int temp = arr[rh];
            arr[rh] = arr[lh]; arr[lh] = temp;
        }
        if (arr[lh] >= pivot) return left; /**Swap two values if you like**/
        arr[left] = arr[lh]; arr[lh] = pivot;
        return lh;
    }
}
