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
        LinkedList<Character> list1 = new LinkedList<>();
        LinkedList<Character> list2 = new LinkedList<>();
for(int i = 0; i < first.length();i++){
    list1.add(first.charAt(i));
}
for(int i = 0;i< second.length();i++){
    char currChar = second.charAt(i);
    int index;
    if(list1.contains(currChar)){
        index = list1.indexOf(currChar);
        list2.add(currChar);
        list1.remove(index);
        count +=2;

    }
}


        sum = first.length() + second.length();
     //  System.out.println(list1+"   " +list2 );
       // System.out.println(count);
       sum = sum-count;
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
