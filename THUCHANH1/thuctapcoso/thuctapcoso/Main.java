package thuctapcoso;

import java.io.*;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) 
    throws  FileNotFoundException{
        Scanner in = new Scanner(new File("SINHVIEN.in"));
        int n = in.nextInt(); in.nextLine();
        ArrayList<SinhVien> svList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            svList.add(new SinhVien(
                in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine()));
        }
        in.close();

        in = new Scanner(new File("DETAI.in"));
        n = in.nextInt();
        in.nextLine();
        ArrayList<DeTai> dtList = new ArrayList<>();
        for (int i = 0 ; i < n; i++) {
            dtList.add(new DeTai(i+1, in.nextLine(), in.nextLine()));
        }
        in.close();

        in = new Scanner(new File("HOIDONG.in"));
        n = in.nextInt();
        ArrayList<ArrayList<NhiemVu>> nvList = new ArrayList<>(9);

        for (int i = 0; i < 9; i++) {
            nvList.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            String id = in.next();
            String idDT = in.next();
            String hoiDong = in.next();
            int k = hoiDong.charAt(hoiDong.length() - 1) - '0';
            for (SinhVien sv :svList) {
                if (sv.id.equals(id)) {
                    for (DeTai dt: dtList) {
                        if (dt.id.equals(idDT)) {
                            nvList.get(k).add(new NhiemVu(sv, dt));
                            break;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            Collections.sort(nvList.get(i));
        }

        for (int i = 0; i < 9; i++) {
            if (nvList.get(i).size() > 0) {
                System.out.printf("DANH SACH HOI DONG %d:\n", i);
                for (NhiemVu nv : nvList.get(i)) {
                    System.out.println(nv);
                }
            }
        }

        in.close();
    }
}
