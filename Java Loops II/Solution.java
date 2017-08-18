import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        double s1 = 0;
        int sum = 0;
        int j = 1;
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            count(a,b,n,j);
            j++;
        }
        in.close();


    }
    public static void count(int a , int b, int n,int j){
        double s1 = 0;
        int sum = 0;

        for( int i = 0; i < n; i++){
            s1 += Math.pow(2,i)*b;
            sum = a + (int)s1;
            j++;
            System.out.print(sum + " ");

        }
        System.out.println();
    }
}