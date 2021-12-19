import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int count = 0,i,count2=0;
        int [] a = new int[10];
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the elements of array : ");
        for(i = 0; i<10; i++){
            a[i]= s.nextInt();
        }
        for(i = 0; i<10; i++)
            if (a[i] == 6 ) {
                if (a[i]==a[i+1]){
                    count++ ;
                    if(a[i+2]==7){
                        count2++;
                    }
                }

            }
        System.out.println("2 six occured " +count+ " times ");
        System.out.println("2 six and one seven occured " +count2 + " times ");
    }
}
