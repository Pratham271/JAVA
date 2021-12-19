package academy.learnprogramming.linkedlist;

public class Main {

    public static void main(String[] args) {
        Employee Mathewwade = new Employee("Mathew","wade",123);
        Employee Stevensmith = new Employee("Steven","Smith",456);
        Employee Aronfinch = new Employee("Aron","Finch",678);
        Employee Davidwarner = new Employee("David","Warner",910);

        EmployeeLinkedList list = new EmployeeLinkedList();
        System.out.println(list.isEmpty());
        list.AddtoFront(Mathewwade);
        list.AddtoFront(Stevensmith);
        list.AddtoLast(Davidwarner);
        list.AddtoFront(Aronfinch);
        System.out.println(list.getSize());
        list.printlist();
        list.removeFromFront();
        System.out.println("\n" +list.getSize());
        list.printlist();
        list.removeFromLast();
        System.out.println("\n" +list.getSize());
        list.printlist();


    }
}
