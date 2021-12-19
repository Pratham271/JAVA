package academy.learnprogramming.radixsort;

public class Main {

    public static void main(String[] args) {
	    int [] arr = {4725,4586,1330,8792,1594,5792};
	    radixsort(arr,10,4);
	    for (int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void radixsort(int [] input,int radix,int width){
        for (int i = 0; i<width;i++){
            radixsinglesort(input,i,radix);
        }
    }
    public static void radixsinglesort(int []input,int position,int radix){
        int numitems = input.length;
        int [] countarray = new int[radix];
        for(int value : input){
            countarray[getdigit(position,value,radix)]++;
        }
        for (int j = 1;j<radix;j++){
            countarray[j]+=countarray[j-1];
        }
        int [] temp = new int [numitems];
        for(int k = numitems-1;k>=0;k--){
            temp[--countarray[getdigit(position,input[k],radix)]]= input[k];
        }
        for (int k = 0;k<numitems;k++){
            input[k] = temp[k];
        }
    }
    public static int getdigit(int position,int value,int radix){
        return value/(int) Math.pow(radix,position)%radix;
    }
}
