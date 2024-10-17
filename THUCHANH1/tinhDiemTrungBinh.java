

import java.util.ArrayList;
import java.util.Scanner;

public class tinhDiemTrungBinh {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Float> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(in.nextFloat());
        }
        a.sort(null);
        Float min = a.get(0), max = a.get(a.size()-1);

        while (a.contains(min)) {
            a.remove(min);
        }

        while (a.contains(max)) {
            a.remove(max);
        }

        Float sum = 0F;
        for (Float f: a) {
            sum += f;
        }

        System.out.printf("%.2f", sum / a.size());
        in.close();
    }
}
