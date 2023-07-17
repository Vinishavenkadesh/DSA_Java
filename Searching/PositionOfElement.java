import java.util.*;

class PositionOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = { 5, 7, 7, 7, 7, 7, 8, 8, 10 };
        int target = sc.nextInt();
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = { -1, -1 };
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }

        return ans;
    }

    static int search(int[] nums, int target, boolean searching) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > nums[mid])
                start = mid + 1;
            else if (target < nums[mid])
                end = mid - 1;
            else {
                ans = mid;
                if (searching)
                    end = mid - 1;
                else
                    start = mid + 1;
            }

        }
        return ans;
    }
}