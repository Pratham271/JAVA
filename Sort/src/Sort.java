import java.util.Scanner;

public class Sort {

    public static void main(String[] args) {
	   int temp,i;
        int [] a = new int[6];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the elements of array : ");
        for(i = 0; i<6; i++){
            a[i]= s.nextInt();
        }
        for (i=0; i<6; i=i+2){
            if(a[i]>a[i+1])
            {
                temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }
        }
        for(i = 0; i<6; i++){
            System.out.print(a[i]+ "\t");
        }

    }
}
