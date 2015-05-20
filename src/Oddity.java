/**
 * Created by tonytan on 9/5/15.
 */
public class Oddity {
    public static boolean isOdd(int i) {
        if(i % 2 == 1) {
            System.out.println("ODD");
            return true;
        }
        else {
            System.out.println("haha");
            return false;
        }
    }

    public static void main(String[] args) {
        Oddity.isOdd(45678);
        System.out.println(2.00 - 1.10);//binary float cannot be accurately for every num.
    }
}
