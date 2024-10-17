package tinhsogio;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{

        File gv = new File("GIANGVIEN.in");
        File gio = new File("GIOCHUAN.in");

        Hashtable<String, GiangVien> mp = new Hashtable<>();
        Scanner in = new Scanner(gv);
        in.nextLine();
        while (in.hasNextLine()) {
            String maGV = in.next();
            mp.put(maGV, new GiangVien(maGV, in.nextLine().trim()));
        }
        in.close();

        in = new Scanner(gio);
        in.nextLine();
        while (in.hasNextLine()) {
            String maGV = in.next(), maMon = in.next();
            Float sogio = in.nextFloat();
            GiangVien temp = mp.get(maGV);
            temp.setGioChuan(temp.getGioChuan() + sogio);
            mp.put(maGV, temp);
        }
        in.close();

        in = new Scanner(gv);
        in.nextLine();
        while (in.hasNextLine()) {

            String m = in.next();
            in.nextLine();
            System.out.println(mp.get(m).getTenGV() + " " + String.format("%.2f", 
                                                            mp.get(m).getGioChuan()));
            
        }
        in.close();


    }
}
