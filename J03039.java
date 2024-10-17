import java.math.BigInteger;
import java.util.Scanner;

public class J03039 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            BigInteger n = in.nextBigInteger();
            BigInteger m = in.nextBigInteger();
            if (n.mod(m) == BigInteger.ZERO || m.mod((n)) == BigInteger.ZERO) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
