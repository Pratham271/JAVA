import java.util.Scanner;

public class Shift {
    public static void main(String[] args){
        int [] arr = new int[6];
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the Elements of array : ");
        for(int i = 0; i<6; i++)
        {
            arr[i] = s.nextInt();
        }
        swapPairs(arr);
        for (int i = 0; i<6; i++)
        {
            System.out.print("\t" +arr[i]);
        }
    }

    public static void swapPairs(int[] a)
    {
        int len=a.length;
        int temp;

        for (int i = 0; i < len; i = i + 2) {
            temp= a[i];
            a[i] = a[i+1];
            a[i+1] = temp;

        }

    }




}

