import java.util.*;

public class CeilingInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] letters = { 'x','x', 'y', 'y' };
        // char[] letters = { 'c','f', 'j' };
        // char[] letters = {'e','e','e','e','e','e','n','n','n','n'};
        char target = sc.next().charAt(0);
        System.out.println(nextGreatestLetter(letters, target));
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        if (target >= letters[letters.length - 1])
            return letters[0];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > letters[mid])
                start = mid + 1;
            else if (target < letters[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return letters[start];
    }

}