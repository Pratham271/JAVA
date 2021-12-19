import java.util.Scanner;

public class Main {


    static boolean isPalindrome(String str)
    {

        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;

            i++;
            j--;
        }

        return true;
    }


    public static void main(String[] args)
    {
        String str = " ";
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string : ");
        str = s.nextLine();

        if (isPalindrome(str))
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}
