import java.util.Scanner;

public class J02103 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int test = 1; test <= t; test++) {
            

            int n = in.nextInt();
            int m = in.nextInt();
            int a[][] = new int[n][m];
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = in.nextInt();
                }
            }
            
            int b[][] = new int[m][m];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    b[i][j] = 0;
                    for (int k = 0; k < n; k++) {
                        b[i][j] += (a[k][i]*a[k][j]);
                    }
                }
            }

            System.out.println("Test " + test + ": ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.printf("%d ", b[i][j]);
                }
                System.out.println();
            }
        }
        in.close();
        
    }
}
