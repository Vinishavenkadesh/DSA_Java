import java.util.*;

public class RotatedSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        int[] arr = { 5, 1, 3 };
        int target = sc.nextInt();
        System.out.println(answer(arr, target));
    }

    static int answer(int[] arr, int target) {
        int peak = peak(arr);
        int firstTry = binarySearch(arr, target, 0, peak);
        if (firstTry != -1)
            return firstTry;
        else
            return binarySearch(arr, target, peak + 1, arr.length - 1);
    }

    static int peak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (start > mid)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return start;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target)
                end = mid - 1;
            else if (arr[mid] < target)
                start = mid + 1;
            else
                return mid;
        }
        return -1;
    }
}