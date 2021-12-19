package academy.learnprogramming.heaps;

public class Main {

    public static void main(String[] args) {
	   Heap h = new Heap(8);
	    h.insert(22);
	    h.insert(19);
        h.insert(18);
        h.insert(15);
        h.insert(3);
        h.insert(14);
        h.insert(4);
        h.insert(12);
        h.PrintHeap();

    }
}
