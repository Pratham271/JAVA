package academy.learnprogramming.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Mathew","wade",123));
        employeeList.add(new Employee("Steven","Smith",456));
        employeeList.add(new Employee("Aron","Finch",678));
        employeeList.add(new Employee("David","Warner",910));
       // employeeList.forEach(employee ->  System.out.println(employee));
        //System.out.println(employeeList.get(1));
       // System.out.println(employeeList.isEmpty());
        employeeList.set(1,new Employee("Mithcel","Starc",994));
        //employeeList.forEach(employee ->  System.out.println(employee));
        //System.out.println(employeeList.size());
        employeeList.add(3,new Employee("Josh","Hazelwood",547));
        //employeeList.forEach(employee ->  System.out.println(employee));
        Employee [] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for (Employee employee: employeeArray) {
            System.out.println(employee);

        }
       // System.out.println(employeeList.contains(new Employee("Aron","Finch",678)));
        System.out.println(employeeList.indexOf(new Employee("Josh","Hazelwood",547)));
        employeeList.remove(2);
        employeeList.forEach(employee ->  System.out.println(employee));
    }

}
