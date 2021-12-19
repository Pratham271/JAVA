import java.util.Scanner;

public class Display {

    public static void main(String[] args) {
	   int []a = new int[5];
	   int sum =0,i,first,second;
	   int sum1=0;
	   Scanner s = new Scanner(System.in);
        System.out.println("Enter the elements of an array :");
        for (i=0;i<a.length;i++){
            a[i]=s.nextInt();
        }
        for(i=0;i<a.length;i++){
            sum = sum+a[i];
        }
        System.out.println("Sum of every element of this array is :" +sum);
        for(i=0;i<a.length;i=i+2){
            sum1=sum1+a[i];
        }
        System.out.println("Sum of alternate elements of this array is :" +sum1);
        first=second=a[0];
        for(i=0;i<a.length;i++){
            if(a[i]>first){
                second=first;
                first=a[i];
            }
        }
        System.out.println("Second highest element in the array is :" +second);

    }
}
