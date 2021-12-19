import java.util.Scanner;
import java.util.Stack;
public class Reverse {
    static void reverse(String k)
    {

        Stack<String> s = new Stack<>();
        String[] token = k.split(" ");
        // Push words into the stack
        for(int i = 0; i < token.length; i++)
        {
            s.push(token[i]);
        }

        while (!s.empty())
        {

            // Get the words in reverse order
            System.out.print(s.peek() + " ");
            s.pop();
        }
    }

    public static void main(String[] args) {
        String k = " ";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string : ");
        k = scan.nextLine();
            reverse(k);
        }
    }

