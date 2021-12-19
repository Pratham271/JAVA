package academy.learnprogramming.stacks;

public class Main {

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);
        stack.push(new Employee("Mathew","wade",123));
        stack.push(new Employee("Steven","Smith",456));
        stack.push(new Employee("Aron","Finch",678));
        stack.push(new Employee("David","Warner",910));
        stack.printStack();

        System.out.println("Popped : " +stack.pop());
        System.out.println(stack.peek());


    }
}
