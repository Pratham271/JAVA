class LinkedList
{
    Node head;

    class Node
    {
        int data;
        Node next;
        Node(int d) { data = d; next = null; }
    }

    boolean areIdentical(LinkedList listb)
    {
        Node a = this.head, b = listb.head;
        while (a != null && b != null)
        {
            if (a.data != b.data)
                return false;

            a = a.next;
            b = b.next;
        }
        return (a == null && b == null);
    }
    void push(int new_data)
    {

        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }


    /* Driver program to test above functions */
    public static void main(String args[])
    {
        LinkedList llist1 = new LinkedList();
        LinkedList llist2 = new LinkedList();

        llist1.push(4);
        llist1.push(5);
        llist1.push(6);

        llist2.push(4);
        llist2.push(5);
        llist2.push(6);

        if (llist1.areIdentical(llist2) == true)
            System.out.println("Identical ");
        else
            System.out.println("Not identical ");

    }
}
