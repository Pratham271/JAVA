package academy.learnprogramming.quicksort;

public class Main {

    public static void main(String[] args) {
	    int [] arr = {20,35,-15,7,55,1,-22};
        Quicksort(arr,0,arr.length);
	    for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void Quicksort(int [] input,int start, int end){
        if(end-start<2){
            return;
        }
        int pivotIndex = partition(input,start,end);
        Quicksort(input,start,pivotIndex);
        Quicksort(input,pivotIndex+1,end);
    }
    public static int partition(int [] input,int start,int end){
        int pivot = input[start];
        int i = start;
        int j = end;
        while (i<j){
            while(i<j && input[--j]>=pivot);
            if(i<j){
                input[i] = input[j];

            }
            while (i<j && input[++i]<=pivot);
                if (i<j){
                    input[j] = input[i];
                }
        }
        input[j] = pivot;
        return j;

    }
}
