import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * J03004
 */
public class J03004 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); in.nextLine();
        while (t-- > 0) {
            StringTokenizer input = new StringTokenizer(in.nextLine(), " ");
            ArrayList<String> words = new ArrayList<>();
            while (input.hasMoreTokens()) {
                words.add(input.nextToken());
            }
            
            String ho = words.get(0).toUpperCase();
            words.remove(0);

            ArrayList<String> ans = new ArrayList<>();

            for (int i = 0; i < words.size(); i++) {
                String s = " ";
                if (i == words.size()-1) s = ",";
                words.set(i, words.get(i).substring(0, 1).toUpperCase() 
                    + words.get(i).substring(1).toLowerCase() + s);
            }

            for (String e : words) {
                System.out.print(e);
            }
            System.out.println(" " + ho);
        }
    }
}