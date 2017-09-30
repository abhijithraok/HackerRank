/**
 * Created by Abhijith on 27-Sep-17.
 */
import java.util.*;
public class Solution {

    public static boolean isBalanced(String expression) {
        boolean b = true;
        Stack<Character> brackets = new Stack<Character>();

        if(expression.length() == 1){
            return false;
        }
        if(expression.length() %2 != 0){
            return false;
        }
        for(int i=0; i<expression.length(); i++){
            char next = expression.charAt(i);
            if(next == '{')  brackets.add('}');
            else if(next == '[') brackets.add(']');
            else if(next == '(') brackets.add(')');
            else if(brackets.empty() || brackets.pop() != next) {
                return false;
            }
        }
        return brackets.empty();
    }





    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
