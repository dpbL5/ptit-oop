import java.io.IOException;
import java.util.*;

public class J02022 {

    static int[] X = new int[10];
    static boolean[] checked = new boolean[10];

    static void res(int n) {

        for (int i = 1; i < n; i++) {
            if (Math.abs(X[i] - X[i+1]) == 1) {
                return;
            }
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(X[i]);
        }
        System.out.println();
    }


    static void Try(int i, int n) {
        for (int j = 1; j <= n; j++) {
            if (checked[j] == false) {
                X[i] = j;
                
                if (i == n) res(n);
                else {
                    checked[j] = true;
                    Try(i+1, n);
                    checked[j] = false;
                }
            }
            
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        
        int test = in.nextInt();

        while (test-- > 0) {
            int n = in.nextInt();
            Try(1, n);
            System.out.println();
        }

        in.close();
    }
}
