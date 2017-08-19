/**
 * Created by Abhijith on 19-Aug-17.
 */

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int array[] = new int[n];
        int temp[] = array;
        for (int a_i = 0; a_i < n; a_i++) {
            array[a_i] = in.nextInt();
        }

        for (int i = 1; i <= k; i++) {
            temp = rotation(temp);
        }
        //  System.out.println(Arrays.toString(temp));
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }

    }

    public static int[] rotation(int[] grid) {
        int array[] = new int[grid.length];
        for (int i = 1; i < grid.length; i++) {
            array[i - 1] = grid[i];
        }
        array[array.length - 1] = grid[0];
        //  System.out.println(Arrays.toString(array));
        return array;
    }
}