public class PeakMountain {
    public static void main(String[] args) {
        int[] arr = {24,69,100,99,79,78,67,36,26,19};
        // int[] arr = { 1, 2, 3, 4, 5, 6, 7, 4, 3, 2, 1 };
        // int[] arr = { 1, 2, 3, 4, 5, 4, 3, 2, 1, 0 };
        // int[] arr = { 1, 2, 3, 7, 8, 9, 6, 5, 4, 3, 2, 1 };
        System.out.println(peakMountain(arr));
    }

    public static int peakMountain(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1])
            return mid;
        else if (arr[mid] < arr[mid - 1]) {
            int max = arr[mid - 1];
            int maxIndex = mid - 1;
            int i = mid - 2;
            while (max < arr[i]) {
                if (arr[i] > max) {
                    max = arr[i];
                    maxIndex = i;
                    i--;
                }
            }
            return maxIndex;
        } else {
            int max = arr[mid + 1];
            int i = mid + 2;
            int maxIndex = mid + 1;
            while (max < arr[i]) {
                if (arr[i] > max) {
                    max = arr[i];
                    maxIndex = i;
                    i++;
                }
            }
            return maxIndex;
        }
    }
}