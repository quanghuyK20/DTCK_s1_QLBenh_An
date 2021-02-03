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
public class UserData {

    private String UserID, Password, QuyenTruyCap;
    private String Ho, Ten, MaNhanVien;

    public UserData() {
    }

    public UserData(String UserID, String Password, String Ho, String Ten, String MaNhanVien, String QuyenTruyCap) {
        this.UserID = UserID;
        this.Password = Password;
        this.Ho = Ho;
        this.Ten = Ten;
        this.MaNhanVien = MaNhanVien;
        this.QuyenTruyCap = QuyenTruyCap;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getQuyenTruyCap() {
        return QuyenTruyCap;
    }

    public void setQuyenTruyCap(String QuyenTruyCap) {
        this.QuyenTruyCap = QuyenTruyCap;
    }

    public String getHo() {
        return Ho;
    }

    public void setHo(String Ho) {
        this.Ho = Ho;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

}
