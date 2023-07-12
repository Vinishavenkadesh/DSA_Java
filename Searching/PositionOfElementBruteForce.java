import java.util.*;

public class PositionOfElementBruteForce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int target = sc.nextInt();
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] arr = { -1, -1 };
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == target) {
                arr[0] = i;
                break;
            }
        for (int i = nums.length - 1; i >= 0; i--)
            if (nums[i] == target) {
                arr[1] = i;
                break;
            }
        return arr;
    }

}
