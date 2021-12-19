package academy.learnprogramming.hashtable;

public class SimpleHashtable {
    private Employee [] hashtable;
    public SimpleHashtable(){
        hashtable = new Employee[10];
    }
    public void put(String key, Employee employee){
        int hashedkey = hashkey(key);
        if(hashtable[hashedkey] != null){
            System.out.println("Sorry, there is already an employee at position :" +hashedkey);
        }
        else{
            hashtable[hashedkey] = employee;
        }
    }
    public Employee get(String key){
        int hashedkey = hashkey(key);
        return hashtable[hashedkey];
    }
    private int hashkey(String key){
        return key.length()%hashtable.length;
    }
    public void printhashtable(){
        for(int i = 0;i<hashtable.length;i++){
            System.out.println(hashtable[i]);
        }
    }
}
