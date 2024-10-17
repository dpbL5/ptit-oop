package javaXX;

public class Sinhvien implements Comparable<Sinhvien>{

    private String masv;
    private String ten;
    private String lop;
    private String email;

    public Sinhvien(String masv, String ten, String lop, String email) {

        this.masv = masv;
        this.ten = "";
        ten = ten.trim().toLowerCase();
        String[] words = ten.split("\\s+");
        for (String w : words)
            this.ten += String.valueOf(w.charAt(0)).toUpperCase() + w.substring(1) + " ";
        this.lop = lop;
        this.email = email;
    }

    @Override
    public String toString() {
        return masv + " " + ten + " " + lop + " " + email;
    }

    @Override
    public int compareTo(Sinhvien o) {
        return this.masv.compareTo(o.masv);
    }
}
