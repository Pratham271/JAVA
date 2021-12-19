package academy.learnprogramming.binarysearch;

public class Main {

    public static void main(String[] args) {
	  int [] arr = {-22,-15,1,7,20,35,55};
      //  System.out.println( iterativebinarysearch(arr,-15));
        //System.out.println( iterativebinarysearch(arr,35));
        //System.out.println( iterativebinarysearch(arr,888));
        //System.out.println( iterativebinarysearch(arr,1));
        System.out.println(recursivebinarysearch(arr,0,arr.length,-15));
        System.out.println(recursivebinarysearch(arr,0,arr.length,35));
        System.out.println(recursivebinarysearch(arr,0,arr.length,888));
        System.out.println(recursivebinarysearch(arr,0,arr.length,1));

    }
    public static int iterativebinarysearch(int [] input, int value){
        int start = 0;
        int end = input.length;
        while(start<end){
            int midpoint = (start + end)/2;
            System.out.println("midpoint = " + midpoint);
            if(input[midpoint] == value){
                return midpoint;
            }
            else if(input[midpoint]<value){
                start = midpoint +1;
            }
            else{
                end = midpoint;
            }
        }
        return -1;
    }
    
    public static int recursivebinarysearch(int []input, int start,int end,int value){
        if(start>=end){
            return -1;
        }
        int midpoint = (start+end)/2;
        System.out.println("midpoint : " +midpoint);
        if(input[midpoint] == value){
            return midpoint;
        }
        else if(input[midpoint]<value){
           return recursivebinarysearch(input,midpoint+1,end,value);
        }
        else{
           return recursivebinarysearch(input,start,midpoint,value);
        }

    }
}
