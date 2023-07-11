public class RichestWealth {
    public static void main(String[] args) {
        int[][] accounts = { { 1, 2, 3 }, { 3, 2, 1 } };
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int[] row : accounts) {
            int sum = 0;
            for (int num : row)
                sum += num;
            if (max < sum)
                max = sum;
        }
        return max;
    }
}
