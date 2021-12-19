package academy.learnprogramming.shellsort;

public class Main {

    public static void main(String[] args) {
	  int [] arr = {20,35,-15,7,55,1,-22};
	  for(int gap = arr.length/2;gap>0;gap/=2){
	      for (int i = gap;i<arr.length;i++){
	          int newelt = arr[i];
	          int j = i;
	          while(j>=gap && arr[j-gap]>newelt){
	              arr[j] = arr[j-gap];
	              j-=gap;
              }
	          arr[j] = newelt;

          }
      }
	  for (int i = 0; i<arr.length;i++){
          System.out.println(arr[i]);
      }
    }
}
