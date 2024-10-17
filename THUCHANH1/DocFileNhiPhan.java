import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class DocFileNhiPhan {

    static boolean isPrime(int n) {
        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, FileNotFoundException{
        ObjectInputStream inp = new ObjectInputStream(new FileInputStream("DAYSO.DAT"));
        ArrayList<Integer> List = (ArrayList<Integer>) inp.readObject();
        SortedSet<Integer> st = new TreeSet<>();
        for (Integer i: List) {
            if (isPrime(i) && i > 100) {
                st.add(i);
            }
        }

        for (Integer i: st) {
            System.out.println(i);
        }
        inp.close();
    }
}
