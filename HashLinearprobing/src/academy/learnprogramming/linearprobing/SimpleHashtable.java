package academy.learnprogramming.linearprobing;

public class SimpleHashtable {
     private StoredEmployee[] hashtable;
    public SimpleHashtable(){
        hashtable = new StoredEmployee[10];
    }
    public void put(String key, Employee employee){
        int hashedkey = hashkey(key);
        if(occupied(hashedkey)){
            int StopIndex  = hashedkey;
            if(hashedkey == hashtable.length-1){
                hashedkey = 0;
            }
            else {
                hashedkey++;
            }
            while(occupied(hashedkey) && hashedkey != StopIndex){
                hashedkey = (hashedkey+1)%hashtable.length;
            }

        }
        if(occupied(hashedkey)){
            System.out.println("Sorry, there is already an employee at position :" +hashedkey);
        }
        else{
            hashtable[hashedkey] = new StoredEmployee(key,employee);
        }
    }
    public Employee get(String key){
        int hashedkey = findkey(key);
        if(hashedkey==-1){
            return null ;
        }
        return hashtable[hashedkey].employee;
    }
    public Employee remove(String key){
        int hashedkey = findkey(key);
        if(hashedkey==-1){
            return null;
        }
        else {
            Employee employee = hashtable[hashedkey].employee;
            hashtable[hashedkey] = null;
            return employee;

        }
    }
    private int hashkey(String key){
        return key.length()%hashtable.length;
    }
    private int findkey(String key){
        int hashedkey = hashkey(key);
        if(hashtable[hashedkey]!=null && hashtable[hashedkey].key.equals(key)){
            return hashedkey;
        }

            int StopIndex  = hashedkey;
            if(hashedkey == hashtable.length-1){
                hashedkey = 0;
            }
            else {
                hashedkey++;
            }
            while(hashedkey != StopIndex && hashtable[hashedkey]!=null && !hashtable[hashedkey].key.equals(key)){
                hashedkey = (hashedkey+1)%hashtable.length;
            }
            if(hashtable[hashedkey] != null && hashtable[hashedkey].key.equals(key)){
                return hashedkey;
            }
            else
                return -1;
    }
    private boolean occupied(int index){
        return hashtable[index] != null;
    }
    public void printhashtable(){
        for(int i = 0;i<hashtable.length;i++){
            if(hashtable[i]==null){
                System.out.println("empty");
            }
            else{
                System.out.println("Position :" +i+ ":" +hashtable[i].employee);
            }

        }
    }
}


