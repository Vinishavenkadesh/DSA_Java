import java.util.*;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[] arr = { -18, -6, -3, -1, 0, 1, 3, 5, 6, 9, 18, 36, 76 };
        int[] arr = { 76, 35, 24, 11, 9, 6, 5, 3, 1, 0, -3, -5, -13, -34 };
        int target = sc.nextInt();
        System.out.println(orderAgnosticBS(arr, target));
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target){
                System.out.print("The index of the element is : ");
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
        System.out.print("Element doesn't found : ");
        return -1;
    }
}
