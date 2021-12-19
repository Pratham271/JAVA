public class Main {

    public static void main(String[] args) {
        int [] arr = {231,187,512,45,76};
        long startTime = System.nanoTime();
        sort(arr,10,3);
        long endTime = System.nanoTime();


        for (int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("This Sorting took " + (endTime - startTime)/1000000 + " milliseconds");

    }
    public static void sort(int [] input,int r,int width){
        for (int i = 0; i<width;i++){
            singlesort(input,i,r);
        }
    }
    public static void singlesort(int []input,int position,int r){
        int numitems = input.length;
        int [] countarray = new int[r];
        for(int value : input){
            countarray[getdigit(position,value,r)]++;
        }
        for (int j = 1;j<r;j++){
            countarray[j]+=countarray[j-1];
        }
        int [] temp = new int [numitems];
        for(int k = numitems-1;k>=0;k--){
            temp[--countarray[getdigit(position,input[k],r)]]= input[k];
        }
        for (int k = 0;k<numitems;k++){
            input[k] = temp[k];
        }
    }
    public static int getdigit(int position,int value,int r){
        return value/(int) Math.pow(r,position)%r;
    }
}
