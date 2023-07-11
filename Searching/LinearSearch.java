import java.util.*;

class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {};
        // int[] arr = new int[10];
        // System.out.print("Enter the Array : ");
        // for (int i = 0; i < arr.length; i++)
        // arr[i] = sc.nextInt();
        int start = 3;
        int end = 9;
        System.out.print("Enter the target value : ");
        int target = sc.nextInt();
        linearSearch1(arr, target);
        boolean ans = linearSearch2(arr, target);
        int answer = linearSearch3(arr, target);
        boolean answ = linearSearch4(arr, target, start, end);
        System.out.println(ans);
        System.out.println(answer);
        System.out.println(answ);
    }

    public static void linearSearch1(int[] arr, int target) {
        int flag = 0;
        if (arr.length > 0) {
            for (int i = 0; i < arr.length; i++)
                if (target == arr[i]) {
                    System.out.println(i);
                    flag = 1;
                }
            if (flag == 0)
                System.out.println("The Number not present in you Array");
        } else
            System.out.println("Array is Empty");

    }

    public static boolean linearSearch2(int[] arr, int target) {
        if (arr == null)
            return false;
        for (int num : arr)
            if (target == num)
                return true;
        return false;
    }

    public static int linearSearch3(int[] arr, int target) {
        if (arr.length == 0)
            return Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++)
            if (target == arr[i])
                return target;
        return Integer.MAX_VALUE;
    }

    public static boolean linearSearch4(int[] arr, int target, int start, int end) {
        if (arr.length == 0)
            return false;
        for (int i = start; i <= end; i++)
            if (target == arr[i])
                return true;
        return false;

    }

}
