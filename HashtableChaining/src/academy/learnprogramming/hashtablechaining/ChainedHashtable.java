package academy.learnprogramming.hashtablechaining;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashtable {
   private LinkedList<StoredEmployee> [] hashtable;
   public ChainedHashtable(){
       hashtable = new LinkedList[10];
       for(int i= 0;i<hashtable.length;i++){
           hashtable[i] = new LinkedList<StoredEmployee>();
       }
   }
   public void put(String key,Employee employee){
       int hashedkey = hashkey(key);
       hashtable[hashedkey].add(new StoredEmployee(key,employee));

   }
   public Employee get(String key){
       int hashedkey = hashkey(key);
       ListIterator<StoredEmployee> iterator = hashtable[hashedkey].listIterator();
       StoredEmployee employee = null;
       while(iterator.hasNext()){
           employee= iterator.next();
           if(employee.key.equals(key)){
               return employee.employee;
           }
       }
       return null;
   }
   public Employee remove(String key){
       int hashedkey = hashkey(key);
       ListIterator<StoredEmployee> iterator = hashtable[hashedkey].listIterator();
       StoredEmployee employee = null;
       int index = -1;
       while(iterator.hasNext()){
           employee= iterator.next();
           index++;
           if(employee.key.equals(key)){
              break;
           }
       }
       if(employee==null){
           return null;
       }
       else {
           hashtable[hashedkey].remove(index);
           return employee.employee;
       }

   }
   private int hashkey(String key){
       return   key.length()%hashtable.length;
   }
   public void printhashtable(){
      for(int i = 0;i<hashtable.length;i++){
          if(hashtable[i].isEmpty()){
              System.out.println("Position" +i+ ": empty");
          }
          else {
              System.out.print("position" +i+ ":");
              ListIterator<StoredEmployee> iterator = hashtable[i].listIterator();
              while(iterator.hasNext()){
                  System.out.print(iterator.next().employee);
                  System.out.println("->");
              }
              System.out.println("null");
          }
      }

   }
}
