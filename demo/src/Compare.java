

import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
       int a,b,c,d;
      Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        a = s.nextInt();
        System.out.println("Enter the second number : ");
        b = s.nextInt();
       c=a%10;
       d=b%10;
       if(c==d)
       {
           System.out.println("Last digit of the number is same" );

       }
       else
       {
           System.out.println("Last digit of the number is not same");
       }
    }
}
