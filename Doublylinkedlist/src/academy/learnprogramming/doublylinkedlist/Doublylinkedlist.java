package academy.learnprogramming.doublylinkedlist;

public class Doublylinkedlist {
    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void AddtoFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        if(head == null){
            tail = node;
        }
        else{
            head.setPrevious(node);
        }
        head = node;
        size++;
    }
    public int getSize(){
        return size;
    }
    public void AddtoLast(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        if (tail==null){
            head=node;
        }
        else{
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail = node;
        size++;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public EmployeeNode removeFromFront(){
        if (isEmpty()){
            return null;
        }
        EmployeeNode temp = head;
        if(head.getNext()==null){
            tail=null;
        }
        else{
            head.getNext().setPrevious(null);
        }
        head= head.getNext();
        size--;
        temp.setNext(null);
        return temp;
    }
    public EmployeeNode removeFromLast(){
        if ((isEmpty())){
            return null;
        }
        EmployeeNode temp = tail;
        if (tail.getPrevious()==null){
              head = null;
        }
        else{
            tail.getPrevious().setNext(null);
        }
        tail = tail.getPrevious();
        size--;
        temp.setPrevious(null);
        return temp;
    }
    public void printlist(){
        EmployeeNode temp = head;
        System.out.print("HEAD -> ");
        while (temp!=null){
            System.out.print(temp);
            System.out.print(" <=> ");
            temp = temp.getNext();
        }
        System.out.print("null");
    }
}

