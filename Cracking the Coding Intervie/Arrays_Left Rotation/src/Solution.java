/**
 * Created by Abhijith on 19-Aug-17.
 */

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        for(int i = 0; i < n; i++) {
            System.out.print(a[(k+i)%n] + " ");
        }
    }
}
