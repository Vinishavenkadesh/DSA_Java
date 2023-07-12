import java.util.*;

public class PositionOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int target = sc.nextInt();
        System.out.println(Arrays.toString(searchRange(nums,target)));
    }

    public static int[] searchRange(int[] nums, int target) {
          int [] arr = {-1,-1};
          arr[0] = firstOccurence(nums,target);
          arr[1] = lastOccurence(nums,target);
          return arr;
    }

    static int firstOccurence(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid])
                end = mid - 1;
            else if (target > nums[mid])
                start = mid + 1;
            else
            end = mid-1;
        }
        return end;
    }
     static int lastOccurence(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid])
                end = mid - 1;
            else if (target > nums[mid])
                start = mid + 1;
            else
            start = mid+1;
        }
        return end;
    }
}
