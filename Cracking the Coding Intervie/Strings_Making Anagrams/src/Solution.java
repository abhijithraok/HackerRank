/**
 * Created by Abhijith on 21-Aug-17.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int numberNeeded(String first, String second) {
        int sum = 0;
        int count = 0;
        ArrayList<Character> arraylist = new ArrayList<>();
        ArrayList<Character> arrayList2 = new ArrayList<>();
        for (int i = 0; i < first.length(); i++) {
            arraylist.add(first.charAt(i));
        }
        for (int i = 0; i < second.length(); i++) {
            char currChar = second.charAt(i);
            int index;
            if (arraylist.contains(currChar)) {
                index = arraylist.indexOf(currChar);
                // list2.add(currChar);
                arrayList2.add(currChar);
                arraylist.remove(index);
                count += 2;

            }
        }


        sum = first.length() + second.length();
        // System.out.println(arrayList2 );
        // System.out.println(count);
        sum = sum - count;
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
