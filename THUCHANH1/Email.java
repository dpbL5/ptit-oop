import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Email
 */
public class Email {

    public static void main(String[] args) throws FileNotFoundException{
        Scanner in = new Scanner(new File("DANHSACH.in"));

        HashMap<String, Integer> mp = new HashMap<>();

        while (in.hasNextLine()) {
            String domain = "@ptit.edu.vn";
            StringTokenizer nameTokenizer = new StringTokenizer(in.nextLine());
            String out = "";
            while (nameTokenizer.hasMoreTokens()) {

                

                String token = nameTokenizer.nextToken();
                
                if (!nameTokenizer.hasMoreTokens()) {
                    out = token.toLowerCase() + out;
                }
                else { 
                    out += token.toLowerCase().charAt(0);
                }
            }
            if (mp.containsKey(out)) {
                mp.put(out, mp.get(out) + 1);
                System.out.println(out+mp.get(out).toString()+domain);
            } else {
                mp.put(out, 1);
                System.out.println(out+domain);
            }
        }

        in.close();
    }
}