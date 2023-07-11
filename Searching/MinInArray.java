import java.util.*;

public class MinInArray {
    public static void main(String[] args) {

        int[] arr = {};
        // int [] arr = new int [10];
        // int [] arr = {34,67,78,97,43,76,93,11,23,3};
        // Scanner sc = new Scanner(System.in);
        // for (int i = 0; i < 10; i++)
        // arr[i] = sc.nextInt();
        System.out.println(minInArray1(arr));
        System.out.println(minInArray2(arr));
        System.out.println(minInArray3(arr,3,7));
    }

    static int minInArray1(int[] arr) {
        if (arr.length == 0)
            return Integer.MAX_VALUE;
        int min = arr[0];
        for (int i = 0; i < arr.length; i++)
            if (min > arr[i])
                min = arr[i];
        return min;
    }

    static int minInArray2(int[] arr) {
        if (arr.length == 0)
            return Integer.MAX_VALUE;
        int min = arr[0];
        for (int i : arr)
            if (min > i)
                min = i;
        return min;
    }

     static int minInArray3(int[] arr,int start,int end) {
        if (arr.length == 0)
            return Integer.MAX_VALUE;
        int min = arr[start];
        for (int i = start+1; i <=end; i++)
            if (min > arr[i])
                min = arr[i];
        return min;
    }
}
