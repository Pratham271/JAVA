import java.util.Scanner;

public class Print {

    public static void main(String[] args) {
	   int []a = new int[10];
	   char b = 'y';
	   int i;
	   Scanner s = new Scanner(System.in);
	   while(b == 'y'){
           System.out.print("Enter the elements of an array :");

           for(i=0;i<10;i++){
               a[i]= s.nextInt();
           }
           System.out.print("Elements at even positions are :");
	       for(i=0;i<10;i=i+2)
               System.out.print("\t" +a[i]);

           System.out.print("\nOdd Elements present in this array are : ");
	       for(i=0;i<10;i++){
	           if((a[i] % 2) != 0){
                System.out.print("\t" +a[i]+ "\t");
               }
           }
           System.out.print("\nArray in reverse order ");
	       for(i=9;i>=0;i--){
               System.out.print("\t" +a[i]  );
           }
           System.out.println("\nElement at first position " +a[0]);
           System.out.println("Element at last position :" +a[9]);
           System.out.println("Press y if u want to continue");
           b = s.next().charAt(0);

       }


    }
}
