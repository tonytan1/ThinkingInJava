/**
 * Created by tonytan on 17/5/15.
 */

public class Value {
    public static void main(String[] args) {
        int[] a = new int[1000];
        for (int i = 0; i < 1000; i++) {
            a[i] = (int) (Math.random() * 10 * Math.random() * 10 * Math.random() * 10);

            if(i%10 == 9){
                System.out.println(a[i]);
            }
            else{
                System.out.printf("%4d%s", a[i]," ");
            }
        }
    }
}