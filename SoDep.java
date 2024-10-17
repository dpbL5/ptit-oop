import java.io.IOException;
import java.util.Scanner;

public class SoDep {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); in.nextLine();
        while (t-- > 0) {
            StringBuilder input = new StringBuilder(in.nextLine());
            StringBuilder rinput = new StringBuilder(input).reverse();
            Boolean con = true;

            if (input.toString().equals(rinput.toString())) {
                for (int i = 0; i < input.length(); i++) {
                    Character c = input.charAt(i);
                    switch (c) {
                        case '2':
                        case '3':
                        case '5':
                        case '7':
                            break;
                    
                        default:
                            con = false;
                            break;
                    }
                    if (!con) break;
                }
            } else {
                con = false;
            }

            if (con) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
