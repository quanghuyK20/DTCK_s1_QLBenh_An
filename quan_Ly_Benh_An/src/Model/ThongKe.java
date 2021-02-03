/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Quang Huy
 */
public class ThongKe {
    
    private int LuotKhamBenh;
    private int BenhNhanXuatVien;
    private int BenhNhanChuaXuatVien;

    public ThongKe() {
    }

    public ThongKe(int LuotKhamBenh, int BenhNhanXuatVien, int BenhNhanChuaXuatVien) {
        this.LuotKhamBenh = LuotKhamBenh;
        this.BenhNhanXuatVien = BenhNhanXuatVien;
        this.BenhNhanChuaXuatVien = BenhNhanChuaXuatVien;
    }

    public int getLuotKhamBenh() {
        return LuotKhamBenh;
    }

    public void setLuotKhamBenh(int LuotKhamBenh) {
        this.LuotKhamBenh = LuotKhamBenh;
    }

    public int getBenhNhanXuatVien() {
        return BenhNhanXuatVien;
    }

    public void setBenhNhanXuatVien(int BenhNhanXuatVien) {
        this.BenhNhanXuatVien = BenhNhanXuatVien;
    }

    public int getBenhNhanChuaXuatVien() {
        return BenhNhanChuaXuatVien;
    }

    public void setBenhNhanChuaXuatVien(int BenhNhanChuaXuatVien) {
        this.BenhNhanChuaXuatVien = BenhNhanChuaXuatVien;
    }
    
    
    
    
    
}
