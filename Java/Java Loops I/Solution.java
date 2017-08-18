import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int mulitple = 0;
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i = 1;i<= 10;i++){
            int multiple = num *i;
            System.out.println(num+ " x "+i+" = "+ multiple);
        }
    }
}