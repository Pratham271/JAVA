import java.util.Scanner;

public class Stack {
    int MAX = 10;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack
    Stack()
    {
        top = -1;
    }

    boolean push(int x)
    {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        }
        else {
            a[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }

    int pop()
    {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = a[top];
            top--;
            System.out.println(x + " Popped from stack ");
            return x;
        }
    }

    int peek()
    {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = a[top];
            System.out.println( +x+ " element is at the top ");
            return x;
        }
    }


    public static void main(String[] args) {
        int choice=0;
        int y=0;
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();
        while(choice != 4)
        {
            System.out.println("\nChose one from the below options...\n");
            System.out.println("\n1.Push\n2.Pop\n3.Peek\n4.Exit");
            System.out.println("\n Enter your choice \n");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                {
                    System.out.println("Enter the element u want to add : ");
                    y = sc.nextInt();
                    s.push(y);
                    break;
                }
                case 2:
                {
                    s.pop();
                    break;
                }
                case 3:
                {
                    s.peek();
                    break;
                }
                case 4:
                {
                    System.out.println("Exiting....");
                    System.exit(0);
                    break;
                }
                default:
                {
                    System.out.println("Please Enter valid choice ");
                }
            };
        }
    }
}


