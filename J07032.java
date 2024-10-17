import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class J07032 {

    private static boolean check(int n)
    {
        String s = Integer.toString(n);
        if (s.length() == 1 || s.length() % 2 == 0)
            return false;
        for (int i = 0; i <= s.length() / 2; ++i)
        {
            if (s.charAt(i) % 2 == 0)
                return false;
            if (s.charAt(i) != s.charAt(s.length() - i - 1))
                return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> d1 = ((ArrayList<Integer>)ois.readObject());
        ois = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> d2 = ((ArrayList<Integer>)ois.readObject());

        Set<Integer> set1 = new TreeSet<>();
        Set<Integer> set2 = new TreeSet<>();

        d1.forEach(i -> { 
            if (check(i)) set1.add(i);
        });
        d2.forEach(i -> {
            if (check(i)) set2.add(i);
        });

        set1.retainAll(set2);

        int k = 0;
        for (Integer i : set1) {
            if (k++ == 10) break;
            System.out.println(i + " " + (Collections.frequency(d1, i) + Collections.frequency(d2, i)));
        }

   }
}
