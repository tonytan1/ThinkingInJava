import java.security.PublicKey;

/**
 * Created by tonytan on 19/5/15.
 */
public class SalesClerk {
    private String name;
    private double sales = 0.0;

    public SalesClerk(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }

    public double getSales(){
        return sales;
    }

    public void adjustSales(double amount){
        sales += amount;
    }
}
