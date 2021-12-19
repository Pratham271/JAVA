package academy.learnprogramming.liststack;

public class Main {

    public static void main(String[] args) {
        Employee Mathewwade = new Employee("Mathew","wade",123);
        Employee Stevensmith = new Employee("Steven","Smith",456);
        Employee Aronfinch = new Employee("Aron","Finch",678);
        Employee Davidwarner = new Employee("David","Warner",910);

        LinkedStack stack = new LinkedStack();
        stack.push(Mathewwade);
        stack.push(Stevensmith);
        stack.push(Aronfinch);
        stack.push(Davidwarner);
         stack.printStack();
        System.out.println(stack.peek());
        stack.printStack();
    }
}
