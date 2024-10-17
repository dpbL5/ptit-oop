import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

class ThiSinh implements Comparable<ThiSinh> {
    String ten;
    int ac;
    int submit;

    public ThiSinh(String ten, int ac, int submit) {
        this.ten = ten;
        this.ac = ac;
        this.submit = submit;
    }

    @Override
    public int compareTo(ThiSinh o) {
        if (this.ac != o.ac) {
            return o.ac - this.ac;
        }
        if (this.submit != o.submit) {
            return this.submit - o.submit;
        }
        return this.ten.compareTo(o.ten);
    }
    
    @Override
    public String toString() {
        return ten + " " + ac + " " + submit;
    }
}

public class LuyenTapLT {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("LUYENTAP.in"));
        int n = sc.nextInt();
        ArrayList<ThiSinh> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            list.add(new ThiSinh(sc.nextLine(), sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(list);
        
        for (ThiSinh i: list) {
            System.out.println(i);
        }
    }
}
