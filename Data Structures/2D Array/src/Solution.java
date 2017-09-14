/**
 * Created by Abhijith on 14-Sep-17.
 */

import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;

public class Solution {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = in.nextInt();
            }
        }
    /*   int arr[][] = new int[6][6];
       Scanner scan = new Scanner(new File("testcase2.txt"));
       while (scan.hasNext()){
           if(scan.hasNextInt()){
               for(int i = 0; i < 6;i++){
                   for(int j = 0;j < 6;j++){
                       arr[i][j]=scan.nextInt();
                   }
               }
           }
           else {
               scan.next();
           }
       }*/
        hourglass(arr);
        // System.out.println(Arrays.deepToString(arr));
    }

    public static void hourglass(int[][] array) {
        int currValue = 0;
        int largestValue = Integer.MIN_VALUE;
        for (int i = 1; i < array.length - 1; i++) {
            for (int j = 1; j < array.length - 1; j++) {
                currValue = array[i][j] + array[i - 1][j - 1] + array[i - 1][j] + array[i - 1][j + 1] + array[i + 1][j - 1] + array[i + 1][j] + array[i + 1][j + 1];
                // int upper = array[i-1][j-1]+array[i-1][j]+array[i-1][j+1];
                //   int middle = array[i][j];
                //  int lower = array[i+1][j-1]+array[i+1][j]+array[i+1][j+1];
                //  currValue= upper+middle+lower;
                if (largestValue < currValue) {
                    largestValue = currValue;
                }

            }
        }
        System.out.println(largestValue);
    }
}
