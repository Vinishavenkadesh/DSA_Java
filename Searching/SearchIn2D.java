import java.util.*;

public class SearchIn2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.print("Enter the Elements : ");
        for (int row = 0; row < arr.length; row++)
            for (int col = 0; col < arr[row].length; col++)
                arr[row][col] = sc.nextInt();
        System.out.print("Enter the Target element : ");
        int target = sc.nextInt();
        System.out.print("Array Formation : ");
        for (int[] num : arr)
            System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(searchIn2D(arr, target)));
        System.out.print("Maximum element method 1 : ");
        System.out.println(searchMax1(arr));
        System.out.print("Maximum element method 2 : ");
        System.out.println(searchMax2(arr));

    }

    static int[] searchIn2D(int[][] arr, int target) {
        if (arr.length == 0)
            return new int[] { -1, -1 };
        for (int row = 0; row < arr.length; row++)
            for (int col = 0; col < arr[row].length; col++)
                if (arr[row][col] == target)
                    return new int[] { row, col };
        return new int[] { -1, -1 };
    }

    static int searchMax1(int[][] arr) {
        if (arr.length == 0)
            return Integer.MIN_VALUE;
        int max = arr[0][0];
        for (int row = 0; row < arr.length; row++)
            for (int col = 0; col < arr[row].length; col++)
                if (max < arr[row][col])
                    max = arr[row][col];
        return max;
    }

    static int searchMax2(int[][] arr) {
        if (arr.length == 0)
            return Integer.MIN_VALUE;
        int max = arr[0][0];
        for (int[] everySingleRow : arr)
            for (int element : everySingleRow)
                if (max < element)
                    max = element;
        return max;
    }
}
