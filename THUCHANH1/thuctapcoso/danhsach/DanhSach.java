package danhsach;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class SinhVien implements Comparable<SinhVien>{
    private String masv;
    private String ten;
    private String lop;
    private String email;
    private String sdt;

    SinhVien( String masv, String ten, String lop, String email, String sdt) {
        this.masv = masv;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.sdt = "0" + sdt;
    }

    @Override
    public int compareTo(SinhVien o) {
        if (this.lop.equals(o.lop)) {
            return this.masv.compareTo(o.masv);
        } else {
            return this.lop.compareTo(o.lop);
        }
    }

    @Override
    public String toString() {
        return this.masv + " " + this.ten + " " + this.lop + " " + this.email + " " + this.sdt;
    }
}  

public class DanhSach {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner in = new Scanner(new File("DANHSACH.in"));
        ArrayList<SinhVien> list = new ArrayList<>();
        while (in.hasNextLine()) {
            // System.out.println(in.nextLine());
            list.add(new SinhVien(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine()));
        }
        Collections.sort(list);

        for (SinhVien i: list) {
            System.out.println(i);
        }
    }
}
