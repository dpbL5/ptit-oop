import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class J03009 {

    static ArrayList<String> split(String string) {
        ArrayList<String> result = new ArrayList<>();
        StringTokenizer tk = new StringTokenizer(string);
        while (tk.hasMoreTokens()) {
            result.add(tk.nextToken());
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); in.nextLine();
        while (t-- > 0) {
            SortedSet<String> st = new TreeSet<>();
            ArrayList<String> set1 = split(in.nextLine());
            st.addAll(set1);
            // System.out.println(st);

            SortedSet<String> st2 = new TreeSet<>();
            ArrayList<String> set2 = split(in.nextLine());
            st2.addAll(set2);

            for (String s : st) {
                if (!st2.contains(s)) {
                    System.out.print(s + " ");
                }
            }
            System.out.println();
        }
    }
}
