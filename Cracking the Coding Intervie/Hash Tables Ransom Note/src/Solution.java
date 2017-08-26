/**
 * Created by Abhijith on 26-Aug-17.
 */

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        ArrayList<String> magazineList = new ArrayList<>();
        ArrayList<String> ransomList = new ArrayList<>();
        for (int magazine_i = 0; magazine_i < m; magazine_i++) {
            magazineList.add(in.next());
        }
        for (int ransom_i = 0; ransom_i < n; ransom_i++) {
            ransomList.add(in.next());

        }
        Collections.sort(magazineList);
        Collections.sort(ransomList);

        boolean b = ransomNote(ransomList, magazineList);
        if (b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    public static boolean ransomNote(ArrayList<String> ransomArray, ArrayList<String> magazineArray) {
        for (String ransomWord : ransomArray) {
            if (!magazineArray.remove(ransomWord)) {
                return false;
            }
        }
        return true;
    }
}
