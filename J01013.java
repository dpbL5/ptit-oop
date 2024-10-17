import java.util.Scanner;

public class J01013 {
    public static void main(String[] args) {
        int maxN = 2000000;
        int[] spf = sieve(maxN); // Smallest prime factor array
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        long sum = 0; // Use long to handle larger sums
        while (t-- > 0) {
            int n = in.nextInt();
            while (n > 1) {
                int primeFactor = spf[n];
                sum += primeFactor;
                n /= primeFactor;
            }
        }
        System.out.println(sum);
        in.close();
    }

    static int[] sieve(int n) {
        int[] spf = new int[n + 1]; // Smallest prime factor for each number
        for (int i = 2; i <= n; i++) {
            spf[i] = i; // Initially, set each number as its own smallest prime factor
        }
        for (int i = 2; i * i <= n; i++) {
            if (spf[i] == i) { // i is a prime number
                for (int j = i * i; j <= n; j += i) {
                    if (spf[j] == j) { // Set smallest prime factor for j
                        spf[j] = i;
                    }
                }
            }
        }
        return spf;
    }
}
