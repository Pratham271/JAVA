public class LinkedList2 {
    Node head;

    class Node{
        int data;
        Node next;
        Node(int data){ this.data = data; next = null;}
    }

    public void Add(int d)
    {
        Node n = new Node(d);

        n.next = head;

        head = n;
    }
    public void Addatpos(int d,int index){
       Node n = new Node(d);
       Node temp = head;
       for(int i = 0;i<index-1;i++){
           temp = temp.next;
       }
        n.next=temp.next;
        temp.next = n;

    }
    public void Append(int d){
        Node n = new Node(d);
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = n;

    }
    public void Deletefrombeg(){

        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        head = temp.next;
        temp = null;

    }
    public void DeleteAtPos(int index){
        Node temp = head;
        for(int i = 0;i<index-1;i++){
            temp = temp.next;
        }
        Node next = temp.next.next;
        temp.next = next;
    }
    public void deletefromend(){

        if(head==null){
            System.out.println("Your list is empty");
            return ;
        }
        Node temp = head;
        while(temp.next.next!=null)
        {
            temp = temp.next;
        }
        temp.next = null;



    }
    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+ "\t");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
       LinkedList2 ll = new LinkedList2();
       ll.Add(9);
       ll.Add(10);
       ll.Add(12);
       ll.Add(15);
       ll.print();
        System.out.println("\n");
       ll.Addatpos(89,2);
       ll.print();
        System.out.println("\n");
       ll.Append(34);
        ll.print();
        System.out.println("\n");
       ll.deletefromend();
       ll.print();
        System.out.println("\n");
       ll.Deletefrombeg();
       ll.print();
        System.out.println("\n");
        ll.DeleteAtPos(1);
        ll.print();
        System.out.println("\n");
    }
}
