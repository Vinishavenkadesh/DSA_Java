public class EvenNumDigits {
    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };
        System.out.println(findNumber(nums));
    }

    static int findNumber(int[] nums) {
        int count = 0;
        for (int num : nums)
            if (even(num))
                count++;
        return count;
    }

    static boolean even(int num) {
        return (digit(num) % 2 == 0);
    }

    static int digit(int num) {
        if (num < 0)
            num *= -1;
        return (int) (Math.log10(num)) + 1;
    }

}



// another method 

class Solution {
    public int findNumbers(int[] nums) {
         int even = 0;
        for (int num : nums) {
            int count = (int) (Math.log10(num) + 1);
            if (count % 2 == 0)
                even += 1;
        }
        return even;
    }
}
