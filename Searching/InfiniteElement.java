import java.util.*;

public class InfiniteElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 23, 34, 45, 56, 67, 78, 89, 90, 100 };
        int target = sc.nextInt();
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (target > arr[end]) {

            // start = end + 1;
            // end = (end + 1) * 2 + 1;

            int newStart = end + 1;
            end += (end - start + 1) * 2;
            start = newStart;
        }
        return searching(start, end, arr, target);
    }

    static int searching(int start, int end, int[] arr, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid])
                start = mid + 1;
            else if (target < arr[mid])
                end = mid - 1;
            else
                return mid;
        }
        return -1;
    }
}
