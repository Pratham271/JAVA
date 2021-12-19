import java.util.*;
class AlternateSort
{

    public static void alternateSort(LinkedList<Integer> ll)

    {
        Collections.sort(ll);
        for (int i = 1; i < (ll.size() + 1)/2; i++)
        {
            Integer x = ll.getLast();
            ll.removeLast();
            ll.add(2*i - 1, x);
        }

        System.out.println("\n\t" +ll);
    }

    public static void main (String[] args)

    {
        Integer arr[] = {1, 3, 8, 2, 7, 5, 6, 4};
        int l = arr.length;
        int i;
        for(i = 0; i<l; i++){
            System.out.print("\t" +arr[i] );
        }
        LinkedList<Integer> ll = new LinkedList<Integer>(Arrays.asList(arr));
        alternateSort(ll);

    }
}