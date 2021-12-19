package academy.learnprogramming.linearprobing;

public class Main {

    public static void main(String[] args) {
        Employee Mathewwade = new Employee("Mathew","wade",123);
        Employee Stevensmith = new Employee("Steven","Smith",456);
        Employee Aronfinch = new Employee("Aron","Finch",678);
        Employee Davidwarner = new Employee("David","Warner",910);
        Employee MitchelStarc = new Employee("Mitchel","Starc",222);

        SimpleHashtable ht = new SimpleHashtable();
        ht.put("wade",Mathewwade);
        ht.put("smith",Stevensmith);
        ht.put("finch",Aronfinch);
        ht.put("warner",Davidwarner);

        ht.printhashtable();
        System.out.println(ht.get("warner"));
        ht.remove("smith");
        ht.printhashtable();
    }
}
