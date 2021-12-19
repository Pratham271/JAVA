import java.util.Scanner;

public class Count {

    public static void main(String[] args) {
	int []a = new int[6];
	int count=0,i,elt=0;
	Scanner s = new Scanner(System.in);
        System.out.println("Enter the elements of an array :");
        for(i=0;i<6;i++){
            a[i]=s.nextInt();
        }
        System.out.println("Enter the element to check its frequency :");
        elt= s.nextInt();
        for (i=0;i<6;i++){
            if(elt==a[i])
                count++;
        }
        System.out.println("The given element occured " +count+ " times");

    }
}
