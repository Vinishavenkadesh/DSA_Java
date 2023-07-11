import java.util.*;

public class SearchInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String name = sc.nextLine();
        // String name = " ";
        System.out.print("Enter the Character to be searched : ");
        char ch = sc.next().charAt(0);
        System.out.println(searchInString1(name, ch));
        System.out.println(searchInString2(name, ch));
    }

    static boolean searchInString1(String str, char target) {
        if (str.length() == 0)
            return false;
        for (char i = 0; i < str.length(); i++)
            if (target == str.charAt(i))
                return true;
        return false;
    }

    static boolean searchInString2(String str, char target) {
        if (str.length() == 0)
            return false;
        for (char ch : str.toCharArray())
            if (target == ch)
                return true;
        return false;
    }
}
