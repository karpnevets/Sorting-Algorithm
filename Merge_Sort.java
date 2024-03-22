public class Merge_Sort {
    public void merge_sort(int[] arr) {
        if (arr.length <= 1) return;
        int n = arr.length;
        int mid = n/2; int[] a = new int[mid]; int[] b = new int[n - mid];
        for (int i = 0; i < mid; i++) a[i] = arr[i];
        for (int i = 0; i < n - mid; i++) b[i] = arr[i + mid];
        merge_sort(a); merge_sort(b);
        merge(arr, a, b, mid, n-mid);
    }

    private void merge(int[] arr, int[] a, int[] b, int left, int right) {
        int i = 0; int j = 0; int k = 0;
        while (i < left && j < right) arr[k++] = a[i] <= b[j] ? a[i++] : b[j++];
        while (i < left) arr[k++] = a[i++];
        while (j < right) arr[k++] = b[j++];
    }
}
