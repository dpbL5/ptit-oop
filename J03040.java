import java.util.Scanner;

public class J03040 {

    static boolean dk1(String plate) {
        for (int i = 0; i < plate.length()-1; i++) {
            if (plate.charAt(i) >= plate.charAt(i+1)) {
                return false;
            }
        }
        return true;
    }

    static boolean dk2(String plate) {
        for (int i = 0; i < plate.length()-1; i++) {
            if (plate.charAt(i) != plate.charAt(i+1)) {
                return false;
            }
        }
        return true;
    }

    static boolean dk3(String plate) {
        for (int i = 0; i < 2; i++) {
            if (plate.charAt(i) != plate.charAt(i+1)) {
                return false;
            }
        }
        if (plate.charAt(3) != plate.charAt(4)) {
            return false;
        }
        return true;
    }

    static boolean dk4(String plate) {
        for (int i = 0; i < plate.length(); i++) {
            if (plate.charAt(i) != '6' && plate.charAt(i) != '8') {
                return false;
            }
        }
        return true;
    }


    static String plateCheck(String plate) {
        plate = plate.substring(5, 8) + plate.substring(9);
        // System.out.println(plate);

        if (dk1(plate) || dk2(plate) || dk3(plate) || dk4(plate)) {
            return "YES";
        } else {
            return "NO";
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); in.nextLine();
        while (t-- > 0) {
            String plate = in.nextLine();
            System.out.println(plateCheck(plate));
        }
    }
}
