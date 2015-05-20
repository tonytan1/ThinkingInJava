/**
 * Created by tonytan on 17/5/15.
 */
public class ArrayCopy {
    public static void main(String[] args){
        double[] priceJanuary =
                {1.23, 9.99, 22.5, 4.44, 5.55, 6.55, 5,43};

        double[] priceFebruary = new double[priceJanuary.length];

        for(int i=0; i<priceJanuary.length; i++){
            priceFebruary[i] = priceJanuary[i];
        }

        priceFebruary[1] = 10.9;

        System.out.printf("%7s%7s\n", "Jan", "Feb");
        for(int i = 0; i<priceJanuary.length; i++){
            System.out.printf("%7.2f%7.2f\n",
                    priceJanuary[i], priceFebruary[i]);
        }

    }
}
