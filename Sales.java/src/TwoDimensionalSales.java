import java.util.Scanner;
class Sales2 {
    public void calculateSales() {
        Scanner input = new Scanner(System.in);
        double sales[][] = new double[5][4];

        System.out.print("Enter sales person number (-1 to end):");
        int person = input.nextInt();

        while (person != -1) {
            System.out.print("Enter product number:");
            int product = input.nextInt();
            System.out.print("Enter sales amont:");
            double amount = input.nextDouble();


            if (person >= 1 && person < 5 && product >= 1 && product < 6 &&
                    amount >= 0)
                sales[product - 1][person - 1] = +amount;
            else
                System.out.println("Invalid Input!");

            System.out.print("Enter sales person number(-1 to end):");
            person = input.nextInt();
        }

        double salesPersonTotal[] = new double[4];

        //display data table
        for (int column = 0; column < 4; column++)
            salesPersonTotal[column] = 0;

        System.out.printf("%8s%14s%14s%14s%14s%10s\n",
                "Product", "Salesperson 1", "Salesperson 2", "Salesperson 3",
                "Salesperson 4", "Total");



        for (int row = 0; row < 5; row++) {
            double productTotal = 0.0;
            System.out.printf("%8d%", (row + 1));

            for (int column = 0; column < 4; column++) {
                System.out.printf("%14.2f", sales[row][column]);
                productTotal += sales[row][column];
                salesPersonTotal[column] += sales[row][column];
            }


            System.out.printf("8%s", "Total");

            for (int colum = 0; colum < 4; colum++)
                System.out.printf("14.2%f", salesPersonTotal[colum]);

            System.out.println();
        }
    }
}



    class Main {
        public static void main(String args[]) {
            Sales2 application = new Sales2();
            application.calculateSales();
        }
    }
