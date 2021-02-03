package Model;

/**
 *
 * @author Quang Huy
 */
public class ThongTin {

    private String MaBenhNhan,
            MaBenhAn, MaKhoa, NgayVao, NgayRa, TenBenhNhan, Tuoi, ChungMinhThu, QueQuan;
    private int GioiTinh;

    public ThongTin() {
    }

    public ThongTin(String MaBenhNhan, String MaBenhAn, String MaKhoa, String NgayVao, String NgayRa, String TenBenhNhan, String Tuoi, String ChungMinhThu, String QueQuan, int GioiTinh) {
        this.MaBenhNhan = MaBenhNhan;
        this.MaBenhAn = MaBenhAn;
        this.MaKhoa = MaKhoa;
        this.NgayVao = NgayVao;
        this.NgayRa = NgayRa;
        this.TenBenhNhan = TenBenhNhan;
        this.Tuoi = Tuoi;
        this.ChungMinhThu = ChungMinhThu;
        this.QueQuan = QueQuan;
        this.GioiTinh = GioiTinh;
    }

    public String getMaBenhNhan() {
        return MaBenhNhan;
    }

    public void setMaBenhNhan(String MaBenhNhan) {
        this.MaBenhNhan = MaBenhNhan;
    }

    public String getMaBenhAn() {
        return MaBenhAn;
    }

    public void setMaBenhAn(String MaBenhAn) {
        this.MaBenhAn = MaBenhAn;
    }

    public String getMaKhoa() {
        return MaKhoa;
    }

    public void setMaKhoa(String MaKhoa) {
        this.MaKhoa = MaKhoa;
    }

    public String getNgayVao() {
        return NgayVao;
    }

    public void setNgayVao(String NgayVao) {
        this.NgayVao = NgayVao;
    }

    public String getNgayRa() {
        return NgayRa;
    }

    public void setNgayRa(String NgayRa) {
        this.NgayRa = NgayRa;
    }

    public String getTenBenhNhan() {
        return TenBenhNhan;
    }

    public void setTenBenhNhan(String TenBenhNhan) {
        this.TenBenhNhan = TenBenhNhan;
    }

    public String getTuoi() {
        return Tuoi;
    }

    public void setTuoi(String Tuoi) {
        this.Tuoi = Tuoi;
    }

    public String getChungMinhThu() {
        return ChungMinhThu;
    }

    public void setChungMinhThu(String ChungMinhThu) {
        this.ChungMinhThu = ChungMinhThu;
    }

    public String getQueQuan() {
        return QueQuan;
    }

    public void setQueQuan(String QueQuan) {
        this.QueQuan = QueQuan;
    }

    public int getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(int GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

}
