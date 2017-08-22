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
        int count = 0;
        int sum = 0;
        StringBuilder sb1 = new StringBuilder(first);
        StringBuilder sb2 = new StringBuilder(second);
        for(int i = 0; i < sb1.length();i++){
            for(int j= 0;j <sb2.length();j++){
                if(sb1.charAt(i)==sb2.charAt(j)){
                    sb1.deleteCharAt(i);
                    sb2.deleteCharAt(j);

                    count++;
                }
            }
        }
        sum = sb1.length() + sb2.length();
      //  System.out.println(sb1+"   " +sb2 );
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
