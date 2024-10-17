import java.io.*;
import java.util.*;

/* same as J07031 */

public class J07030_1 {
    static boolean isPrime(Integer x) {
        for (int i = 2; i <= Math.sqrt(x); i++)
            if (x%i==0) return false;
        return x > 1;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> n = (ArrayList<Integer>) ois.readObject();
        ois = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> m = (ArrayList<Integer>) ois.readObject();

        Set<Integer> set1 = new TreeSet<>();
        Set<Integer> set2 = new TreeSet<>();
        
        for(Integer i : n) set1.add(i);
        for(Integer i : m) set2.add(i);

        for (Integer i: set1) {
            Integer j = 1000000 - i;
            if (isPrime(i) && 
                isPrime(j) &&
                i < j &&
                ( (set1.contains(i) && set1.contains(j)) && (!set2.contains(i) && !set2.contains(j)) ) ) {
                System.out.println(i + " " + (j));
            }
        }
    }
}
