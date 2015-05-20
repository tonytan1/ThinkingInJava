/**
 * Created by tonytan on 18/5/15.
 *
 * Precondition: array must be sorted lowest to highest.
 * Postcondition: array not altered
 */

public class binarySearch{
    public static int binarySeatrch(
            int[] array, int filledElement, int value){
        int mid;
        int low = 0;
        int midValue;
        int high = filledElement -1;

        while(low<=high){
            mid = (low+high)/2;
            midValue = array[mid];
            if(value == midValue){
                return mid;
            }
            else if(value < midValue){
                high = mid-1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
    public static void main(String[] args){
        int[] a1= {1,2,3,4,5,6,7,8};
        int v1 =4;

        System.out.printf("the index of %d is : "+binarySeatrch(a1,a1.length+1,v1),v1);
    }
}
