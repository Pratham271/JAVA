package academy.learnprogramming.maxheaps;

public class Main {

    public static void main(String[] args) {
        Heap heap = new Heap(10000);
        for (int i = 0 ;i<10000;i++){
            heap.insert(i);
        }



        heap.printHeap();

        //System.out.println(heap.peek());

        heap.delete(0);
        heap.printHeap();

        //System.out.println(heap.peek());

        heap.sort();
        heap.printHeap();
    }
}
