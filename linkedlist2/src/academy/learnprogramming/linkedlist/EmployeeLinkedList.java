package academy.learnprogramming.linkedlist;

public class EmployeeLinkedList {
    private EmployeeNode head;
    private int size;

    public void AddtoFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;
    }
    public int getSize(){
        return size;
    }
    public void AddtoLast(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        EmployeeNode temp = head;
        while (temp.getNext()!=null){
            temp = temp.getNext();
        }
         temp.setNext(node);
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
        head= head.getNext();
        size--;
        temp.setNext(null);
        return temp;
    }
    public EmployeeNode removeFromLast(){
        if ((isEmpty())){
            return null;
        }
        EmployeeNode temp = head;
        while (temp.getNext().getNext()!=null){
            temp = temp.getNext();
        }
        size--;
        temp.setNext(null);
        return temp;
    }
    public void printlist(){
        EmployeeNode temp = head;
        System.out.print("HEAD -> ");
        while (temp!=null){
            System.out.print(temp);
            System.out.print(" -> ");
            temp = temp.getNext();
        }
        System.out.print("null");
    }

}
