public class Main {

    public static void main(String[] args) {
	   String [] arr = {"g","u","r","g","a","o","n"};
	   Algo(arr,1);
    }
    public static void Algo(String[] arr, int a){
        if (arr[a]!= "\u0000"){
            Algo(arr,a+1);
        }
        System.out.println(arr);
    }
}
