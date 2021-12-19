package academy.learnprogramming.insertionsort;

public class Main {

    public static void main(String[] args) {
        int [] arr = {20,35,-15,7,55,1,-22};
        for (int Unsortedelt=1;Unsortedelt<arr.length;Unsortedelt++){
            int newElement = arr[Unsortedelt];
            int i ;
            for (i = Unsortedelt;i>0 && arr[i-1]>newElement;i--){
                arr[i]=arr[i-1];
            }
            arr[i] = newElement;
        }
        for (int i = 0;i<arr.length;i++){
            System.out.println(arr[i]); 
        }
    }
}
