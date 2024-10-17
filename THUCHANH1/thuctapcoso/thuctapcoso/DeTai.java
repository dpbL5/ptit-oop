package thuctapcoso;

public class DeTai {
    String id;
    String giangVien;
    String deTai;

    public DeTai(int id, String giangVien, String deTai) {
        this.id = String.format("DT%03d", id);
        this.giangVien = giangVien;
        this.deTai = deTai;
    }
}
