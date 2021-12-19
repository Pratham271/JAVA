public class Main {

    public static void main(String[] args) {
	   int [] weight = {10,7,4,2};
	   int [] price = {60,28,20,24};
	   int capacity = 11;
	   int n = weight.length;
	   int [][] values = new int[n+1][capacity+1];
	   for (int i = 0;i<=n;i++){
	       for (int j = 0;j<=capacity;j++){
	           values[i][j] = -1;
           }
       }
       int z = getMaxProfit(weight,price,n,capacity,values);
        System.out.println(z);
    }

    private static int getMaxProfit(int[] weight, int[] price, int n, int capacity, int[][] values) {
        if(n==0 || capacity==0){
            values[n][capacity] = 0;
            return 0;
        }
        if(values[n-1][capacity-1]!=-1)
            return values[n-1][capacity-1];
        int incl = 0,excl=0;

       if(weight[n-1]<=capacity){
           incl = price[n-1] + getMaxProfit(weight,price,n-1,capacity-weight[n-1],values);
       }
       excl = getMaxProfit(weight,price,n-1,capacity,values);
       values[n-1][capacity-1] = Math.max(incl,excl);
       return values[n-1][capacity-1];
    }
}
