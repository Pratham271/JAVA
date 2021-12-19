package academy.learnprogramming.hashtablechaining;

public class Main {

    public static void main(String[] args) {
        Employee Mathewwade = new Employee("Mathew","wade",123);
        Employee Stevensmith = new Employee("Steven","Smith",456);
        Employee Aronfinch = new Employee("Aron","Finch",678);
        Employee Davidwarner = new Employee("David","Warner",910);
        Employee MitchelStarc = new Employee("Mitchel","Starc",222);

        ChainedHashtable ht = new ChainedHashtable();
        ht.put("wade",Mathewwade);
        ht.put("smith",Stevensmith);
        ht.put("warner",Davidwarner);
        ht.put("finch",Aronfinch);

        ht.printhashtable();
        System.out.println(ht.get("warner"));
        ht.remove("smith");
        ht.remove("warner");
        ht.printhashtable();

        System.out.println("Retrieve Key finch : " +ht.get("finch"));
    }
}
