import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;
import java.lang.*;

public class J07022 {
    public static void main(String[] args) throws IOException{
        try {
            Scanner in = new Scanner(new java.io.File("DATA.in"));
            ArrayList<String> st = new ArrayList<>();
            while (in.hasNext()) {
                String str = in.next();
                try {
                    int n = Integer.parseInt(str);
                } catch (NumberFormatException e) {
                    st.add(str);
                }
            }
            Collections.sort(st);
            st.forEach(x -> {System.out.print(x + " ");});
            in.close();
        } catch (FileNotFoundException e) {

        }
    }
}
