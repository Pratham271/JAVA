package academy.learnprogramming.listqueue;

public class Main {

    public static void main(String[] args) {
        Employee Mathewwade = new Employee("Mathew","wade",123);
        Employee Stevensmith = new Employee("Steven","Smith",456);
        Employee Aronfinch = new Employee("Aron","Finch",678);
        Employee Davidwarner = new Employee("David","Warner",910);
        Employee MitchelStarc = new Employee("Mitchel","Starc",222);
        ArrayQueue queue = new ArrayQueue(10);
        queue.add(Mathewwade);
        queue.add(Stevensmith);
        queue.remove();
        queue.add(Aronfinch);
        queue.remove();
        queue.add(Davidwarner);
        queue.remove();
        queue.add(MitchelStarc);
        queue.remove();
        queue.add(Mathewwade);

        queue.printQueue();
        //System.out.println();
        //queue.remove();
        //queue.printQueue();
        //queue.remove();

       // System.out.println();
        //System.out.println(queue.peek());
        //queue.remove();
        //queue.remove();
        //queue.add(new Employee("Mitchel","Starc",222));
        //queue.printQueue();

    }
}
