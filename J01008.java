import java.util.Arrays;
import java.util.Scanner;

public class J01008 {
    static final int maxN = 10000000;
    
    static boolean[] prime = new boolean[maxN+2];

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        doSieveOfEratosthenes();

        for (int test = 1; test <= t; test++){

            StringBuilder out = new StringBuilder();
            long n = in.nextLong();
            int x = 2;
            while (n > 1 && x <= maxN) {
                if (prime[x]) {
                    int count = 0;
                    while (n%x==0) {
                        count++;
                        n/=x;
                    }
                    if (count > 0) out.append(String.format("%d(%d) ", x, count));
                }
                x++;
            }

            System.out.println(String.format("Test %d: ", test) + out.toString());
        }
        in.close();
    }

    public static void doSieveOfEratosthenes() {

        Arrays.fill(prime, true);

        prime[0] = prime[1] = false;

        for (int p = 2; p*p <= maxN; p++) {
            
            if (prime[p]) {

                for (int i = p*p; i <= maxN; i+=p) {
                    prime[i] = false;
                }

            }

        }
    }
}
