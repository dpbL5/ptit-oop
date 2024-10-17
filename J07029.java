import java.io.*;
import java.util.*;

public class J07029 {

    static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n%i==0) return false;
        }
        return n> 1;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File("DATA.in")));
        ArrayList<Integer> list = (ArrayList<Integer>) in.readObject();
        
        TreeMap<Integer, Integer> mp = new TreeMap<>();
        
        for (Integer i : list) {
            if (isPrime(i)) {
                if (mp.get(i) == null) {
                    mp.put(i, 1);
                } else {
                    mp.put(i, mp.get(i) + 1);
                }
            }
        }

        int k = 0;
        for (Integer i: mp.descendingKeySet()) {
            System.out.println(i + " " + mp.get(i));
            k++;
            if (k == 10) break;
        }
    }
}
