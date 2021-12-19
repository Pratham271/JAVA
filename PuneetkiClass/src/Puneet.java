public class Puneet {
    public static void main(String[] args) {
         int[] arr = new int[10];
         int b = 1;
         for (int l = 0; l<10; l++){
                 arr[l] = l*b;
                 b++;
         }
         for (int i = 0; i<10; i++){
                 System.out.println(arr[i]);

         }


    }
}


