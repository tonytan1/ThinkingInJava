/**
 * Created by tonytan on 19/5/15.
 */
public class SalesClerks {
    private SalesClerk[] clerks;
    private int filledElement = 0;

    public SalesClerks(int initialSize){
        clerks = new SalesClerk[initialSize];
    }

    public void addSale(String name, double amount){
        int clerkIndex = findClerk(name);

        if(clerkIndex == -1){
            if(filledElement == clerks.length){
                doubleLength();
            }
            clerkIndex = filledElement;
            clerks[clerkIndex] = new SalesClerk(name);
            filledElement++;
        }
        clerks[clerkIndex].adjustSales(amount);
    }

    public void dumpData(){
        for(int i=0; i<filledElement; i++){
            System.out.printf("%s: %6.2f\n",clerks[i].getName(),clerks[i].getSales());
        }
    }

    private int findClerk(String name){
        for(int i=0; i<filledElement;i++){
            if(clerks[i].getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    private void doubleLength(){
        SalesClerk[] clerks2 = new SalesClerk[2*clerks.length];
        System.arraycopy(clerks,0,clerks2,0,clerks.length);
        clerks = clerks2;
    }
}
