/**
 * Created by Abhijith on 27-Sep-17.
 */
import java.util.*;
public class Solution {

    public static boolean isBalanced(String expression) {
        boolean b = true;
        if(expression.length() == 1){
            return false;
        }
        if(expression.length() %2 != 0){
            return false;
        }
        ArrayList<Character> charList = new ArrayList();

        for(int i = 0;i < expression.length();i++){
            char currChar = expression.charAt(i);
            charList.add(currChar);

        }
        while (!charList.isEmpty()) {
            Character firstChar = charList.get(0);
            Character secondChar = charList.get(1);
            Character lastChar = charList.get(charList.size() - 1);

            if (firstChar.equals('{') && lastChar.equals('}')) {
                b= true;
                charList.remove(0);
                charList.remove(charList.size()-1);
            }
            else if (firstChar.equals('(') && lastChar.equals(')')) {
                b= true;
                charList.remove(0);
                charList.remove(charList.size()-1);
            }
            else if (firstChar.equals('[') && lastChar.equals(']')) {
                b= true;
                charList.remove(0);
                charList.remove(charList.size()-1);
            }
            else if(firstChar.equals('{') && secondChar.equals('}')){
                charList.remove(0);
                charList.remove(0);
            }
            else if(firstChar.equals('(') && secondChar.equals(')')){
                charList.remove(0);
                charList.remove(0);
            }
            else if(firstChar.equals('[') && secondChar.equals(']')){
                charList.remove(0);
                charList.remove(0);
            }
            else {

                return false;
            }

        }
        return b;
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
