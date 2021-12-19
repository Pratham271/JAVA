package academy.learnprogramming.datastructures;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int [] arr = new int[7];
	    int i ;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the elements of array : ");
        for (i = 0;i<arr.length;i++){
            arr[i] = s.nextInt();
        }
        for (i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        int index = 50;
        for (i = 0;i<arr.length;i++){
            if(arr[i] == 7){
                index = i;
                break;
            }
        }
        System.out.println("index = " +index);
        int pos ;
        System.out.println("Enter the position u want to delete from array : ");
        pos = s.nextInt();
        for(i = pos ; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        int size;
        size = arr.length;
        size--;
        for (i = 0;i<size;i++){
            System.out.println(arr[i]);
        }

    }
}
