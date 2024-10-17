import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import J07033.main.SinhVien;

import java.io.*;

class SinhVien {
    static private String baseId = "B20DCCN";
    static private int id = 1;
    
    private String masv;
    private String ten;
    private String ngaysinh;
    private String lop;
    private float GPA;

    SinhVien(String ten, String lop, String nsinh, float GPA) 
        throws ParseException {
        this.masv = baseId + String.format("%03d", id);
        id++;
        this.ten = ten;
        this.lop = lop;
        Date tempDate = new SimpleDateFormat("dd/MM/yyyy").parse(nsinh);
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").format(tempDate);
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %.2f", masv, ten, lop, ngaysinh, GPA);
    }
}


public class J07010 {

    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner in = new Scanner(new File("SV.in"));
        int t = in.nextInt(); in.nextLine();
        ArrayList<SinhVien> svArrayList = new ArrayList<>();
        while (t-- > 0) {
            svArrayList.add(
                new SinhVien(
                    in.nextLine(), 
                    in.nextLine(), 
                    in.nextLine(),
                    Float.parseFloat(in.nextLine()) 
                )
            );
        }
        svArrayList.forEach(sv -> {
            System.out.println(sv);
        });

        in.close();
    }
}