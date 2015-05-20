/**
 * Created by tonytan on 17/5/15.
 */
public class CoinFlips {
    public static void main(String[] args){
        final int NUM_OF_COINS = 3;
        final int NUM_OF_REPS = 10000;

        int[] frequency = new int[NUM_OF_COINS + 1];
        int heads;
        double fractionOfReps;
        int numOfAsterisks;

        for(int rep=0; rep<NUM_OF_REPS; rep++){
            heads=0;
            for(int i=0;i<NUM_OF_COINS; i++){
                heads += (int)(Math.random()*2);//probability!!!!!!!(int)(1.9)=1 !=2
            }
            frequency[heads]++;
        }
        System.out.println("Number of times each head count occurred: ");
        for(heads=0; heads<=NUM_OF_COINS;heads++){
            System.out.print(" "+heads+" "+frequency[heads]+" ");
            fractionOfReps = (float)frequency[heads]/NUM_OF_REPS;
            numOfAsterisks = (int) Math.round(fractionOfReps*100);

            for(int i=0; i<numOfAsterisks;i++){
                System.out.print("*");
            }
            System.out.println((int)(1.8)      );
        }
    }
}
