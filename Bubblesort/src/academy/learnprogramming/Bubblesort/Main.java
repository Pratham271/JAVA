package academy.learnprogramming.Bubblesort;



public class Main {

    public static void main(String[] args) {
	    int [] arr = {20,35,-15,7,55,1,-22};
	    for(int unsortedelt = arr.length-1; unsortedelt>0; unsortedelt--){
	        for (int i=0;i<unsortedelt;i++){
	            if(arr[i]>arr[i+1]){
	                swap(arr,i,i+1);
                }
            }
        }
	    for (int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
    public static void swap(int [] array, int i,int j){
        if(i == j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
