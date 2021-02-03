
package Model;

/**
 *
 * @author Quang Huy
 */
public class QuanLyBenhAn {
    
    private String MaBenhAn, TenBenhNhan,NguoiPhuTrach, Email, Khoa, MoTa;
    private int TinhTrang;
    private byte[] Hinh;

    public QuanLyBenhAn() {
    }

    public QuanLyBenhAn(String MaBenhAn, String TenBenhNhan, String NguoiPhuTrach, String Email, String Khoa, String MoTa, int TinhTrang, byte[] Hinh) {
        
        this.MaBenhAn = MaBenhAn;
        this.TenBenhNhan = TenBenhNhan;
        this.NguoiPhuTrach = NguoiPhuTrach;
        this.Email = Email;
        this.Khoa = Khoa;
        this.MoTa = MoTa;
        this.TinhTrang = TinhTrang;
        this.Hinh = Hinh;
    }

    public String getMaBenhAn() {
        return MaBenhAn;
    }

    public void setMaBenhAn(String MaBenhAn) {
        this.MaBenhAn = MaBenhAn;
    }

    public String getTenBenhNhan() {
        return TenBenhNhan;
    }

    public void setTenBenhNhan(String TenBenhNhan) {
        this.TenBenhNhan = TenBenhNhan;
    }

    public String getNguoiPhuTrach() {
        return NguoiPhuTrach;
    }

    public void setNguoiPhuTrach(String NguoiPhuTrach) {
        this.NguoiPhuTrach = NguoiPhuTrach;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getKhoa() {
        return Khoa;
    }

    public void setKhoa(String Khoa) {
        this.Khoa = Khoa;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    public int getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(int TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    public byte[] getHinh() {
        return Hinh;
    }

    public void setHinh(byte[] Hinh) {
        this.Hinh = Hinh;
    }

    
}
