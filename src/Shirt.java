/**
 * Created by tonytan on 15/5/15.
 */

import java.util.Scanner;

public class Shirt {
    private String name;
    private String primary;
    private String trim;

    //***************************************************************************

    public Shirt() {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("Enter person's name: ");
        this.name = stdIn.nextLine();

        this.primary = selectColor("primary");
        this.trim = selectColor("trim");
    }

    //****************************************************************************

    public void display(){
        System.out.println(this.name + "'s shirt: \n" +
        this.primary + " with " +this.trim + " trim");
    }

    //****************************************************************************

    private String selectColor(String colorType) {
        Scanner stdIn = new Scanner(System.in);
        String color;
        int colorValue;

        do {
            System.out.println("enter shirt's" + colorType +
                    " color (w, r, y): ");
            color = stdIn.nextLine();
            if(color.equals("w")){
                colorValue = 1;
            }
            else if(color.equals("r")){
                colorValue = 2;
            }
            else {
                colorValue = 3;
            }

        } while (!color.equals("w") && !color.equals("r") &&
                !color.equals("y"));

        switch (colorValue) {
            case 1:
                color = "white";
                break;
            case 2:
                color = "red";
                break;
            case 3:
                color = "yellow";
                break;
        }
        return color;
    }
}
