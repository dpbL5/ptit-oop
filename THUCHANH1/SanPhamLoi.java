import java.util.Scanner;

public class SanPhamLoi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        int a[] = new int[m];
        for (int j = 0; j < m; j++) {
            a[j] = in.nextInt();
        }

        String e = "Errors: ";
        String c = "Corrects: ";

        for (int i = 1, k = 0; k < m; k++) {
            while (i < a[k]) {
                c += Integer.toString(i) + ", ";
                i++;
            }
        }

        System.out.println(e + "\n" + c);
    }   
}
