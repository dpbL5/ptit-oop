import java.io.FileInputStream;
import java.util.ArrayList;
import java.io.*;

public class J07015 {

    static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n);  i++) {
            if (n%i==0) return false;
        }
        return n > 1;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File("SONGUYEN.in")));
        ArrayList<Integer> a = (ArrayList<Integer>) in.readObject();
        int[] mp = new int[10004];

        for (Integer i: a) {
            if (isPrime(i)) {
                mp[i]++;
            }
        }
        
        for (int i=2; i <= 10000; i++) {
            if (mp[i] > 0) {
                System.out.println(i + " " + mp[i]);
            }
        }
        in.close();
    }
}
