package tinhsogio;

public class GiangVien {
    private String maGV;
    private String tenGV;
    private Float gioChuan;

    public Float getGioChuan() {
        return gioChuan;
    }

    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    public void setGioChuan(Float gioChuan) {
        this.gioChuan = gioChuan;
    }

    public GiangVien(String ma, String ten) {
        this.maGV = ma;
        this.tenGV = ten;
        this.gioChuan = 0F;
    }

    
}
