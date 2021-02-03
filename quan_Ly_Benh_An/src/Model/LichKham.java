
package Model;

/**
 *
 * @author Quang Huy
 */
public class LichKham {
    
    private String MaSoKhamBenh, HoTen , NgaySinh, SDT, NgheNghiep , Email,  DiaChi, NgayKham, MotaTrieuChung ;
    private int GioiTinh;

    public LichKham() {
    }

    public LichKham(String MaSoKhamBenh, String HoTen, String NgaySinh, String SDT, String NgheNghiep, String Email, String DiaChi, String NgayKham, String MotaTrieuChung, int GioiTinh) {
        this.MaSoKhamBenh = MaSoKhamBenh;
        this.HoTen = HoTen;
        this.NgaySinh = NgaySinh;
        this.SDT = SDT;
        this.NgheNghiep = NgheNghiep;
        this.Email = Email;
        this.DiaChi = DiaChi;
        this.NgayKham = NgayKham;
        this.MotaTrieuChung = MotaTrieuChung;
        this.GioiTinh = GioiTinh;
    }

    public String getMaSoKhamBenh() {
        return MaSoKhamBenh;
    }

    public void setMaSoKhamBenh(String MaSoKhamBenh) {
        this.MaSoKhamBenh = MaSoKhamBenh;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getNgheNghiep() {
        return NgheNghiep;
    }

    public void setNgheNghiep(String NgheNghiep) {
        this.NgheNghiep = NgheNghiep;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getNgayKham() {
        return NgayKham;
    }

    public void setNgayKham(String NgayKham) {
        this.NgayKham = NgayKham;
    }

    public String getMotaTrieuChung() {
        return MotaTrieuChung;
    }

    public void setMotaTrieuChung(String MotaTrieuChung) {
        this.MotaTrieuChung = MotaTrieuChung;
    }

    public int getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(int GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    
}
