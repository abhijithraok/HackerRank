/**
 * Created by Abhijith on 01-Sep-17.
 */

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//int number = scan.nextInt();
        int n = scan.nextInt();
        System.out.println(factorial(n));
    }

    static int factorial(int n) {
        int key = 1;
        int count = 0;
        int largest = 0;
        ArrayList<Integer> binaryList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        if (n == 1) {
            return 1;
        }
        while (n > 0) {
            int reminder = n % 2;
            n = n / 2;
            binaryList.add(0, reminder);
            sb.insert(0, reminder);
        }
        for (int number : binaryList) {
            if (number == key) {
                count++;
            } else {
                count = 0;
            }
            if (largest < count) {
                largest = count;
            }
        }
        return largest;
    }

}