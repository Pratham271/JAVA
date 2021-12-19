package academy.learnprogramming.Selectionsort;

public class Main {

    public static void main(String[] args) {
        int [] arr = {20,35,-15,7,55,1,-22};
        for (int Unsortedelt = arr.length-1; Unsortedelt>0; Unsortedelt--){
            int largest = 0;
            for (int i = 1; i<=Unsortedelt;i++){
                if (arr[i]>arr[largest]){
                    largest=i;
                }
            }
            swap(arr,largest,Unsortedelt);
        }
        for (int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void swap(int array[],int i,int j){
        if(i==j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
