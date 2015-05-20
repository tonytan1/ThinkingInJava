/**
 * Created by tonytan on 19/5/15.
 */

import java.util.Scanner;

public class SalesClerksDriver {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        SalesClerks clerk = new SalesClerks(2);
        String name;

        System.out.print("Enter clerk's name(q to quit)");
        name = stdIn.nextLine();
        while (!name.equals("q")){
            System.out.print("Enter sales amount: ");
            clerk.addSale(name, stdIn.nextDouble());
            stdIn.nextLine();
            System.out.print("Enter clerk's name(q to quit): ");
            name = stdIn.nextLine();
        }
        clerk.dumpData();
    }
}
