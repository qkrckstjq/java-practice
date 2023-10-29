package sec03.chap1;

public class ArraySort {

    public static int[] quickSort (int[] arr, int start, int end) {
        if(end == 0) {end = arr.length-1;};
        if(start >= end) {
            return arr;
        };
        int left_idx = start;
        int right_idx = end;
        int pivot = arr[0];
        for(int i = start+1; i < end; i++) {
            if(arr[i] <= pivot) {
                arr[left_idx] = arr[i];
                left_idx++;
            } else {
                arr[right_idx] = arr[i];
                right_idx--;
            }
        }
        arr[left_idx] = pivot;
        quickSort(arr, start, left_idx-1);
        quickSort(arr, right_idx+1, end);
        return arr;
    }

}