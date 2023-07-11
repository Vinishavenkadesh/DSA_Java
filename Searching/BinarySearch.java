import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { -18, -6, -3, -1, 0, 1, 3, 5, 6, 9, 18, 36, 76 };
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        System.out.println(binarySearch(arr, target));

    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target)
                end = mid - 1;
            else if (arr[mid] < target)
                start = mid + 1;
            else {
                System.out.print("The element is in the index of : ");
                return mid + 1;
            }

        }
        System.out.print("We didn't found it : ");
        return -1;
    }
}
