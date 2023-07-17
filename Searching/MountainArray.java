import java.util.*;

public class MountainArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] array = { 1, 3, 4, 5, 3, 2, 1 };
    int target = sc.nextInt();
    System.out.println(binarySearch(array, target));
  }

  static int binarySearch(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (arr[mid] < target)
        start = mid + 1;
      else if (arr[mid] > target)
        end = mid - 1;
      else
        return mid;
    }
    return peakMountain(arr, target);
  }

  static int peakMountain(int[] arr, int target) {
    // int[] array = { 4,5,6,7,0,1,2 };
    int start = 0;
    int end = arr.length - 1;
    while (start < end) {
      int mid = start + (end - start) / 2;
      if (arr[mid] > target)
        start = mid + 1;
      else if (arr[mid] < target)
        end = mid - 1;
      else
        return mid;
    }
    return -1;
  }
}
