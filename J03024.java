import java.util.Scanner;

public class J03024 {
    static String check(String number) {
        Integer chan = 0;
        Integer le = 0;
        for (int x = 0; x < number.length(); x++) {
            char C = number.charAt(x);
            if ('0' <= C && C <= '9') {
                if ((C-'0') % 2 == 0) {
                    chan++;
                }
                else {
                    le++;
                }
            }
            else {
                return "INVALID";
            }
        }

        if ((number.length() % 2 == 0 && chan > le) ||
            (number.length() % 2 != 0 && chan < le)
        ) {
            return "YES";
        }
        else return "NO";

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); in.nextLine();
        while (t-- > 0) {
            System.out.println(check(in.nextLine()));
        }
        in.close();
    }
}
