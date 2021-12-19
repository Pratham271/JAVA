package academy.learnprogramming.doublylinkedlist;

public class Main {

    public static void main(String[] args) {
        Employee Mathewwade = new Employee("Mathew","wade",123);
        Employee Stevensmith = new Employee("Steven","Smith",456);
        Employee MitchelStarc = new Employee("Mitchel","Starc",222);
        Employee Aronfinch = new Employee("Aron","Finch",678);
        Employee Davidwarner = new Employee("David","Warner",910);

        Doublylinkedlist list = new Doublylinkedlist();
        list.AddtoFront(Mathewwade);
        list.AddtoFront(Stevensmith);
        list.AddtoLast(MitchelStarc);
        list.AddtoFront(Aronfinch);
        list.AddtoFront(Davidwarner);
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
