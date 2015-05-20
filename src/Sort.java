/**
 * Created by tonytan on 18/5/15.
 */
public class Sort {
     public static void sort(int[] list){
         int j;

         for(int i=0;i<list.length;i++){
             j = indexOfSmallest(list, i);
             swap(list, i, j);
         }
     }

    private static int indexOfSmallest(int[] list, int startIndex){
        int minIndex = startIndex;

        for(int i=startIndex+1; i<list.length; i++){
            if(list[i] < list[minIndex]){
                minIndex = i;
            }
        }
        return minIndex;
    }

    private static void swap(int[] list, int i, int j){
        int temp;

        temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }
}
