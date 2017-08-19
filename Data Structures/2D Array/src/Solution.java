/**
 * Created by Abhijith on 19-Aug-17.
 */
import java.io.*;
import java.util.*;



public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int [][] array = new int[6][6];
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < 6;i++){
            for(int j = 0; j < 6; j++){
                array[i][j] = scan.nextInt();

            }
        }
        System.out.println(Arrays.deepToString(array));
    }
}