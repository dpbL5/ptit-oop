package thuctapcoso;

public class NhiemVu implements Comparable<NhiemVu> {

    SinhVien sv;
    DeTai deTai;

    public NhiemVu(SinhVien sv, DeTai dt) {
        this.sv = sv;
        this.deTai = dt;
    }
    
    @Override
    public String toString() {
        return String.format("%s %s %s %s", sv.id, sv.name,
            deTai.deTai, deTai.giangVien);
    }

    @Override
    public int compareTo(NhiemVu o) {
        return this.sv.id.compareTo(o.sv.id);
    }

}
 