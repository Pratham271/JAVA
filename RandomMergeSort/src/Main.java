import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int upperbound = 10000;
        int x = random.nextInt(10000);

        int[] input = new int[x];
        for(int i = 0;i<x;i++){
            input[i] = random.nextInt(upperbound);
        }

        long startTime = System.nanoTime();


        mergeSort(input, 0, input.length);
        long endTime = System.nanoTime();


        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i]);
            System.out.print(",");
        }
        System.out.println();
        System.out.println();
        System.out.println("Merge Sort took " + (endTime - startTime)/1000000 + " milliseconds");
    }

    public static void mergeSort(int []input,int start,int end){
        if(end-start<2){
            return;
        }
        int mid = (start+end)/2;
        mergeSort(input,start,mid);
        mergeSort(input,mid,end); 
        merge(input,start,mid,end);
    }
    public static void merge(int []input, int start, int mid, int end){
        if(input[mid-1]<=input[mid]){
            return;
        }
        int i = start;
        int j = mid;
        int tempindex =0;
        int [] temp = new int[end-start];
        while(i<mid && j<end){
            temp[tempindex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }
        System.arraycopy(input,i,input,start+tempindex,mid-i);
        System.arraycopy(temp,0,input,start,tempindex);

    }
}
