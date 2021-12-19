import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      System.out.println();
        //Ascending();
       //System.out.println();
       Same();
        //System.out.println();
        //Random();
      //System.out.println();
        //Descending();


    }
    static int counter;
    public static void Ascending(){
        int[] arr = new int[10000];
         for(int i = 0;i<arr.length;i++){
          arr[i] = i+1;
        }
         counter=0;
        long startTime = System.currentTimeMillis();
        Quicksort(arr,0,arr.length);
        long endTime = System.currentTimeMillis();
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("Quick Sort took " + (endTime - startTime) + " milliseconds");
        System.out.println("Count : "+counter);
    }
    public static void Descending(){
        int[] arr = new int[10000];
        for(int i = 0;i<arr.length;i++){
            arr[i] = i+1;
        }
        counter=0;
        long startTime = System.currentTimeMillis();
        Quicksort1(arr,0,arr.length);
        long endTime = System.currentTimeMillis();
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("Quick Sort took " + (endTime - startTime) + " milliseconds");
        System.out.println("Count : "+counter);
    }
    public static void Same(){
        int[] arr = new int[10000];
        Arrays.fill(arr, 10);
        counter=0;
        long startTime = System.currentTimeMillis();
        Quicksort(arr,0,arr.length);
        long endTime = System.currentTimeMillis();
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("Quick Sort took " + (endTime - startTime) + " milliseconds");
        System.out.println("Count : "+counter);

    }
    public static void Random(){
        Random random = new Random();
        int upperbound = 10000;
        int x = random.nextInt(10000);

        int[] arr = new int[x];
        for(int i = 0;i<x;i++){
            arr[i] = random.nextInt(upperbound);
        }
        counter = 0;
        long startTime = System.currentTimeMillis();
        Quicksort(arr,0,arr.length);
        long endTime = System.currentTimeMillis();
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("Quick Sort took " + (endTime - startTime) + " milliseconds");
        System.out.println("Count : "+counter);



    }

    public static void Quicksort(int [] input,int start, int end){
        counter++;
        if(end-start<2){
            return;
        }

        int pivotIndex = partition(input,start,end);
        Quicksort(input,start,pivotIndex);
        Quicksort(input,pivotIndex+1,end);
    }

    public static void Quicksort1(int [] input,int start, int end){
        counter++;
        if(end-start<2){
            return;
        }

        int pivotIndex = partition1(input,start,end);
        Quicksort1(input,start,pivotIndex);
        Quicksort1(input,pivotIndex+1,end);
    }
    public static int partition(int [] input,int start,int end){
        int pivot = input[start];
        int i = start;
        int j = end;
        while (i<j){
            while(i<j && input[--j]>=pivot);
            if(i<j){
                input[i] = input[j];

            }
            while (i<j && input[++i]<=pivot);
            if (i<j){
                input[j] = input[i];
            }
        }
        input[j] = pivot;
        return j;

    }
    public static int partition1(int [] input,int start,int end){
        int pivot = input[start];
        int i = start;
        int j = end;
        while (i<j){
            while(i<j && input[--j]<=pivot);
            if(i<j){
                input[i] = input[j];

            }
            while (i<j && input[++i]>=pivot);
            if (i<j){
                input[j] = input[i];
            }
        }
        input[j] = pivot;
        return j;

    }

}
