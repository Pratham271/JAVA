package academy.learnprogramming.heaps;

public class Heap {
    private int[] heap;
    private int size;
    public Heap(int capacity){
        heap = new int[capacity];
    }
    public void insert(int value){
        if (isFull()){
            throw new IndexOutOfBoundsException("Heap is full");
        }
        heap[size] = value;
        fixHeapAbove(size);
        size++;
    }

    private void fixHeapAbove(int index) {
        int newvalue = heap[index];
        while(index>0 && newvalue>heap[getParent(index)]){
            heap[index] = heap[getParent(index)];
            index = getParent(index);
        }
        heap[index] = newvalue;
    }
    public void PrintHeap(){
        for (int i = 0;i<heap.length;i++){
            System.out.println(heap[i]);
        }
    }

    public boolean isFull(){
        return size == heap.length;
    }
    public int getParent(int index){
        return (index-1)/2;
    }
}
