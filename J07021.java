import java.io.IOException;
import java.util.Scanner;

public class J07021 {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new java.io.File("DATA.in"));
        while (in.hasNextLine()) {
            String name = in.nextLine().trim().toLowerCase();

            if (name.equals("end")) break;

            String[] words = name.split("\\s+");

            for (String x : words) {
                x = x.substring(0, 1).toUpperCase() + x.substring(1);
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
