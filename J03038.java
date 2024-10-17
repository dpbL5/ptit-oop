import java.util.Scanner;
import java.util.TreeSet;

/**
 * J03038
 */
public class J03038 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        TreeSet<Character> set = new TreeSet<>();

        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        
        System.out.println(set.size());
    }
}