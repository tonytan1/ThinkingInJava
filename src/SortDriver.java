/**
 * Created by tonytan on 18/5/15.
 *
 *
 */
public class SortDriver {
    public static void main(String[] args){
        int[] studentIds = {2134, 1431,7685,5465,8754 };

        Sort.sort(studentIds);
        for(int i=0;i<studentIds.length; i++){
            System.out.print(studentIds[i]+" ");
        }
    }
}

//import java.util.Arrays;
//int[] studentIds = {....};
//Arrays.sort(studentIds)