package academy.learnprogramming.temptrees;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int upperbound = 10000;
        int x = random.nextInt(10000);
        int []arr = new int[x];
        for(int i = 0;i<x;i++){
             arr[i] = random.nextInt(upperbound);
        }

        Scanner sc = new Scanner(System.in);

        long startTime = System.currentTimeMillis();

          Selectionsort(arr,x);
        //Bubblesort(arr,x);
        //Insertionsort(arr,x);

        long endTime = System.currentTimeMillis();



        for (int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
        System.out.println("Selection Sort took " + (endTime - startTime) + " milliseconds");
    }
    public static void Selectionsort(int [] arr,int size){
        for (int Unsortedelt = arr.length-1; Unsortedelt>0; Unsortedelt--){
            int largest = 0;
            for (int i = 1; i<=Unsortedelt;i++){
                if (arr[i]>arr[largest]){
                    largest=i;
                }
            }
            swap(arr,largest,Unsortedelt);
        }
    }
    public static void Bubblesort(int [] arr,int size){
        for(int unsortedelt = arr.length-1; unsortedelt>0; unsortedelt--){
            for (int i=0;i<unsortedelt;i++){
                if(arr[i]>arr[i+1]){
                    swap(arr,i,i+1);
                }
            }
        }

    }
    public static void Insertionsort(int [] arr,int size){
        for (int Unsortedelt=1;Unsortedelt<arr.length;Unsortedelt++){
            int newElement = arr[Unsortedelt];
            int i ;
            for (i = Unsortedelt;i>0 && arr[i-1]>newElement;i--){
                arr[i]=arr[i-1];
            }
            arr[i] = newElement;
        }
    }
    public static void swap(int array[],int i,int j){
        if(i==j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
