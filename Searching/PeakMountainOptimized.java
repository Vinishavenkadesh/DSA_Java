public class PeakMountainOptimized {
    public static void main(String[] args) {
        int[] arr = {24,69,100,99,79,78,67,36,26,19};
        // int[] arr = {2,1};
        System.out.println(peakMountain(arr));
    }

    public static int peakMountain(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            
            if (arr[mid] > arr[mid + 1])
                end = mid;
            else
                start = mid + 1;
            if(end == 0) //{1}
            return 0;
        }
        return start;
}
}