public class LinkedList_Palindrome {
    Node head;
    static class Node
    {
        String data;
        Node next;

        Node(String d)
        {
            data = d;
            next = null;
        }
    }

    boolean isPalidromeUtil(String str)
    {
        int length = str.length();

        for (int i=0; i<length/2; i++)
            if (str.charAt(i) != str.charAt(length-i-1))
                return false;

        return true;
    }
    boolean isPalindrome()
    {
        Node node = head;


        String str = "";
        while (node != null)
        {
            str = str.concat(node.data);
            node = node.next;
        }


        return isPalidromeUtil(str);
    }
    public static void main(String[] args) {
        LinkedList_Palindrome list = new LinkedList_Palindrome();
        list.head = new Node("r");
        list.head.next = new Node("a");
        list.head.next.next = new Node("d");
        list.head.next.next.next = new Node("a");
        list.head.next.next.next.next = new Node("r");

        System.out.println(list.isPalindrome());
    }
}
