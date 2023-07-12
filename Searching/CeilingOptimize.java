import java.util.*;
public class CeilingOptimize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = { 1, 2, 5, 9, 14, 16, 18 };
        int target = sc.nextInt();
        System.out.println(ceilingOptimize(arr,target));
    }
    static int ceilingOptimize(int [] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        if(target > arr[arr.length -1])
        return -1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(target > arr[mid])
            start = mid + 1;
            else if(target < arr[mid])
            end = mid - 1;
            else
            return arr[mid];
        }
        return arr[start];
    }
}
