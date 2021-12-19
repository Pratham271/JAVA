import java.util.Scanner;

public class SwapList {
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
    public void Swapfandl(){
        Node current = head, temp = null, index = null;

        //If list is empty, then display the list as it is
        if(head == null) {
            return;
        }
        else {

            while(current.next != null) {
                index = current;
                current = current.next;
            }


            if(head == current) {
                return;
            }
            else if(head.next == current) {
                temp = head;
                head = current;
                head.next = temp;
                temp.next = null;
            }
            else {
                temp = head;
                head = current;
                head.next = temp.next;
                index.next = temp;
                temp.next = null;
            }
        }
    }
    void pairWiseSwap()
    {
        Node temp = head;

        /* Traverse only till there are atleast 2 nodes left */
        while (temp != null && temp.next != null) {

            /* Swap the data */
            int k = temp.data;
            temp.data = temp.next.data;
            temp.next.data = k;
            temp = temp.next.next;
        }
    }
    void remove_duplicates() {
        Node ptr1 = null, ptr2 = null, dup = null;
        ptr1 = head;


        while (ptr1 != null && ptr1.next != null) {
            ptr2 = ptr1;

            while (ptr2.next != null) {


                if (ptr1.data == ptr2.next.data) {


                    dup = ptr2.next;
                    ptr2.next = ptr2.next.next;
                    System.gc();
                } else  {
                    ptr2 = ptr2.next;
                }
            }
            ptr1 = ptr1.next;
        }
    }
    void deleteAlt()
    {
        if (head == null)
            return;

        Node prev = head;
        Node now = head.next;

        while (prev != null && now != null)
        {
            prev.next = now.next;
            now = null;
            prev = prev.next;
            if (prev != null)
                now = prev.next;
        }
    }
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "\t");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        SwapList ll = new SwapList();
        ll.Add(8);
        ll.Add(9);
        ll.Add(56);
        ll.Add(34);
        ll.Add(56);
        ll.print();
        System.out.println("\nSwapping first and last element");
        ll.Swapfandl();
        ll.print();
        System.out.println("\nSwapping elements pairwise");
        ll.pairWiseSwap();
        ll.print();
        System.out.println("\nDeleting duplicate elements");
        ll.remove_duplicates();
        ll.print();
        System.out.println("\nDeleting alternate elements ");
        ll.deleteAlt();
        ll.print();
    }
}
