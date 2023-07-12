import java.util.*;

public class CeilingOwn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 2, 5, 9, 14, 16, 18 };
        int target = sc.nextInt();
        int answer = ceiling(arr, target);
        System.out.println(answer);

    }

    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = 0;
        if (target > arr[end])
            return -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
                ans = mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
                ans = mid;
            } else {
                System.out.print("The element is in the index of : ");
                ans = mid;
                return mid;
            }

        }
        if (arr[ans] > target)
            return arr[ans];
        else
            return arr[ans + 1];
    }
}
