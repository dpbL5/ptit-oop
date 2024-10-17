import java.util.Scanner;

public class J01014 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            long n = in.nextLong();
            System.out.println(timUocSoLonNhat(n));
        }
        in.close();
    }
    public static long timUocSoLonNhat(long n) {
        long maxPrimeFactor = -1;
        while (n%2==0) {
            n/=2;
            maxPrimeFactor = 2;
        }
        for (long i = 3; i*i <= n; i+=2) {
            while (n%i==0) {
                n/=i;
                maxPrimeFactor = n;
            }
        }
        if (n > 2) {
            maxPrimeFactor = n;
        }
        return maxPrimeFactor;
    }
}
