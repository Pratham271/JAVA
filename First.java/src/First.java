import java.util.Scanner;

public class First {

    public static void main(String[] args) {
	    int [][]a = new int[10][10];
        int row, col, i, j;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter row for the array (max 10) : ");
        row = s.nextInt();
        System.out.print("Enter column for the array (max 10) : ");
        col = s.nextInt();
        System.out.print("Enter " +(row*col)+ " Array Elements : ");
        for(i=0; i<row; i++)
        {
            for(j=0; j<col; j++)
            {
                a[i][j] = s.nextInt();
            }
        }
        for(i=0; i<row; i++)
        {
            for(j=0; j<col; j++)
            {
                if(a[i][j]%2!=0) {

                    a[i][j] = 2*a[i][j];
                }
            }
        }
        System.out.print("The Array is :\n");
        for(i=0; i<row; i++)
        {
            for(j=0; j<col; j++)
            {
                System.out.print(a[i][j]+ "  ");
            }
            System.out.println();
        }
    }
}
