import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class NhanVien {
    private static int id = 1;

    private String maNV;
    private String hoTen;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;
    private String maSoThue;
    private String ngayKyHopDong;

    public NhanVien(String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maSoThue, String ngayKyHopDong)
        throws Exception {
        String pattern = "dd/MM/yyyy";
        this.maNV = String.format("%05d", id++);
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        Date date = new SimpleDateFormat(pattern).parse(ngaySinh);
        this.ngaySinh = new SimpleDateFormat(pattern).format(date);
        this.diaChi = diaChi;
        this.maSoThue = maSoThue;
        date = new SimpleDateFormat(pattern).parse(ngayKyHopDong);
        this.ngayKyHopDong = new SimpleDateFormat(pattern).format(date);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s %s %s", maNV, hoTen, gioiTinh, ngaySinh, diaChi, maSoThue, ngayKyHopDong);
    }
}

public class J04007 {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        NhanVien nv1 = new NhanVien(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
        System.out.println(nv1.toString());
    }
}
