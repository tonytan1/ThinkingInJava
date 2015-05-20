/**
 * ContactList.java
 * Created by tonytan on 16/5/15.
 *
 * this program creates a cell phone contacts phone number
 * list and print the created list
 */

import java.util.Scanner;

public class ContactList {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        long[] phoneList;
        int sizeOfList;
        Long phoneNum;

        System.out.println(
                "how many contact nums would you like to enter?"
        );
        sizeOfList = stdIn.nextInt();
        phoneList = new long[sizeOfList];

        for(int i=0; i < sizeOfList; i++){
            System.out.print("enter phone number: ");
            phoneNum = stdIn.nextLong();
            phoneList[i] = phoneNum;
        }

        System.out.println("\nContacts List: ");
        for(int i=0; i<sizeOfList; i++){
            System.out.println((i+1) + "." + phoneList[i]);
        }
    }
}
