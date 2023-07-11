import java.util.Arrays;
import java.util.*;

public class NeedSomeChange {
    public static void main(String[] args) {
        // int [] arr = {};

        int[] arr = { 1, 2, 3, 4, 5 };
        // {3,2,1,4,5}
        // {3,4,1,2,5}
        // {3,4,5,2,1}

        Scanner sc = new Scanner(System.in);
        // int[] arr = new int[10];
        // for (int i = 0; i < arr.length; i++){
        // arr[i] = sc.nextInt();
        // }
        needSomeChange(arr);
    }

    static void needSomeChange(int[] arr) {
        if (arr.length > 0) {
            for (int i = 0; i < arr.length - 2; i++) {
                int temp = arr[i];
                arr[i] = arr[i + 2];
                arr[i + 2] = temp;
            }
            System.out.println(Arrays.toString(arr));
        } else
            System.out.println("Array is Empty");
    }
}
