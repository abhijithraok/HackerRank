/**
 * Created by Abhijith on 17-Sep-17.
 */
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] number = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            number[a_i] = in.nextInt();
        }
        int temp = 0;
        int count = 0;
        // int n = number.length;
        // System.out.println(Arrays.toString(number));
        int lenght = number.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {

                if (number[j - 1] > number[j]) {
                    temp = number[j - 1];
                    number[j - 1] = number[j];
                    number[j] = temp;
                    count++;
                }

            }
        }
        System.out.println("Array is sorted in "+ count +" swaps.");
        System.out.println("First Element: "+number[0]);
        System.out.println("Last Element: "+number[n-1]);

    }
}