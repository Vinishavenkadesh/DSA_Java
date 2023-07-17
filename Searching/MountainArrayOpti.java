import java.util.*;

public class MountainArrayOpti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[] array = { 1, 3, 4, 5, 3, 2, 1 };
        // int[] array = { 0, 1, 2, 4, 2, 1 };
        // int[] array = { 4, 5, 6, 7, 0, 1, 2 };
        int[] array = {1,3};
        int target = sc.nextInt();
        System.out.println(answer(array, target));
    }

    static int answer(int[] arr, int target) {
        int peak = peakElement(arr);
        int firstTry = searching(arr, target, 0, peak);
        if (firstTry != -1)
            return firstTry;
        else
            return searching(arr, target, peak + 1, arr.length - 1);
    }

    static int peakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1])
                end = mid;
            else
                start = mid + 1;
        }
        return start;
    }

    static int searching(int[] arr, int target, int start, int end) {
        if (arr.length == 1)
            if (arr[0] == target)
                return 0;
            else
                return -1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc == true) {
                if (arr[mid] > target)
                    end = mid - 1;
                else
                    start = mid + 1;
            } else {
                if (arr[mid] < target)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return -1;
    }
}
