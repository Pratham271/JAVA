import java.util.Scanner;

public class Difference {

    public static void main(String[] args) {
        int large,small,i;
        int a[] = new int[10];
        int diff;
        Scanner s = new Scanner(System.in);
        System.out.print("\tEnter the elements of an array \t:");
        for (i=0;i<10;i++){
            a[i]=s.nextInt();
        }
        large=small=a[0];
        for(i=1;i<10;++i)
        {
            if(a[i]>large)
                large=a[i];

            if(a[i]<small)
                small=a[i];
        }
        diff = large-small;
        System.out.println(diff);
    }
}

