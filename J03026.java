import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class J03026 {
    public static void main(String[] args) 
        throws IOException {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt(); input.nextLine();
        while (t-- > 0) {
            String a = input.nextLine();
            String b = input.nextLine();
            if (!a.equals(b)) {
                System.out.println(Math.max(a.length(), b.length()));
            } else {
                System.out.println(-1);
            }
        }
    }   
}
