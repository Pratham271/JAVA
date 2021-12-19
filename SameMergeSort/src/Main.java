import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] input = new int[10000];
        Arrays.fill(input, 10);
        long startTime = System.currentTimeMillis();


        mergeSort(input, 0, input.length);
        long endTime = System.currentTimeMillis();


        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }
        System.out.println("Merge Sort took " + (endTime - startTime) + " milliseconds");
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
