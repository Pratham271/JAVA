import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        int wt[] = {5,3,3,2,4,2};
        int val[] = {200,180,190,300,120,100};
        int capacity = 6;
        double maxvalue =getMaxValue(wt,val,capacity);
        System.out.println("The maxvalue is :" +maxvalue);
    }

    private static double getMaxValue(int[] wt, int[] val, int capacity) {
        Item [] items = new  Item[wt.length];
        for (int i = 0;i<items.length; i++){
            items[i] = new Item(wt[i],val[i],i);
        }
        Arrays.sort(items,new Comparator<Item>(){
            public int compare(Item o1,Item o2){
                return o2.cost.compareTo(o1.cost);
            }
        });
        double totalValue = 0;
        for (Item item:items) {
            int curwt = (int)item.wt;
            int curval = (int)item.val;
            
            if(capacity-curwt>=0){
                capacity = capacity-curwt;
                totalValue+=curval;
             }
            else{
                double fraction = (double)capacity/(double)curwt;
                totalValue+=curval*fraction;
                break;
            }
        }
        return totalValue;
    }
    static class Item{
        Double cost;
        double wt,val,ind;

        public Item(double wt, double val, double ind) {
            this.wt = wt;
            this.val = val;
            this.ind = ind;

            this.cost = Double.valueOf(val/wt);
        }
    }
}

