import java.util.Scanner;

public class Array1 {

    public static void main(String[] args) {
	    int l,temp;
	    Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of array :");
        l = s.nextInt();
        int a[] = new int[l];
        System.out.println("Enter the elements in first array :");
        for(int i = 0; i<l; i++)
        {
            a[i]=s.nextInt();
        }

        temp=a[0];
        a[0]=a[l-1];
        a[l-1]=temp;
        for(int i=0; i< l; i++) {
            System.out.print(a[i] + ", ");
        }


    }
}
