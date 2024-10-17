import java.math.BigInteger;
import java.util.Scanner;
import java.io.*;

public class tinhTongSoLong {
    public static void main(String[] args) throws FileNotFoundException {
        // Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(new File("DATA.in"));
        Long sum = 0L;
        while (in.hasNext()) {
            try {
                String n = in.next();
                // System.out.println(n);
                Long x = Long.parseLong(n);
                // System.out.println(x);
                if (x > Integer.MAX_VALUE) {
                    sum += x;
                }
            } catch (Exception e) {
            }
        }
        in.close();
        System.out.println(sum);
    }
}
