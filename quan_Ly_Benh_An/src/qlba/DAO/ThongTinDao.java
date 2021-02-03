package qlba.DAO;

import ConnectSQL.Connect_DTB;
import Model.QuanLyBenhAn;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.sql.rowset.serial.SerialBlob;
import Model.ThongTin;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Quang Huy
 */
public class ThongTinDao {

    public boolean insert(ThongTin tt)
            throws Exception {

        String sql = "INSERT INTO ThongTinBenhAn(MaBenhNhan, MaBenhAn, MaKhoa, "
                + "NgayVao, NgayRa, TenBenhNhan, Tuoi, GioiTinh, ChungMinhThu, QueQuan) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (
                Connection con = Connect_DTB.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {

            pstmt.setString(1, tt.getMaBenhNhan());
            pstmt.setString(2, tt.getMaBenhAn());
            pstmt.setString(3, tt.getMaKhoa());
            pstmt.setString(4, tt.getNgayVao());
            pstmt.setString(5, tt.getNgayRa());
            pstmt.setString(6, tt.getTenBenhNhan());
            pstmt.setString(7, tt.getTuoi());
            pstmt.setInt(8, tt.getGioiTinh());
            pstmt.setString(9, tt.getChungMinhThu());
            pstmt.setString(10, tt.getQueQuan());

            return pstmt.executeUpdate() > 0;
        }

    }

    public boolean update(ThongTin tt)
            throws Exception {

        String sql = "UPDATE[dbo].[ThongTinBenhAn] "
                + " SET [MaBenhAn] = ? ,[MaKhoa] = ?  ,[NgayVao] = ?  ,"
                + "[NgayRa] = ? ,[TenBenhNhan] = ? ,[Tuoi] = ? ,[GioiTinh] = ? ,"
                + "[ChungMinhThu] = ?,[QueQuan] = ?"
                + " WHERE [MaBenhNhan] =  ? ";
        try (
                Connection con = Connect_DTB.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {

            pstmt.setString(10, tt.getMaBenhNhan());
            pstmt.setString(1, tt.getMaBenhAn());
            pstmt.setString(2, tt.getMaKhoa());
            pstmt.setString(3, tt.getNgayVao());
            pstmt.setString(4, tt.getNgayRa());
            pstmt.setString(5, tt.getTenBenhNhan());
            pstmt.setString(6, tt.getTuoi());
            pstmt.setInt(7, tt.getGioiTinh());
            pstmt.setString(8, tt.getChungMinhThu());
            pstmt.setString(9, tt.getQueQuan());

            return pstmt.executeUpdate() > 0;
        }

    }

    public boolean deleteByMaBN(String MaBenhNhan)
            throws Exception {

        String sql = "DELETE FROM ThongTinBenhAn"
                + " WHERE [MaBenhNhan] =  ? ";
        try (
                Connection con = Connect_DTB.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {

            pstmt.setString(1, MaBenhNhan);

            return pstmt.executeUpdate() > 0;
        }
    }
    public ThongTin findByMaBN(String MaBenhNhan)
            throws Exception {

        String sql = "SELECT * FROM ThongTinBenhAn WHERE [MaBenhNhan] = ? ";
        try (
                Connection con = Connect_DTB.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1,MaBenhNhan);
            try (ResultSet rs = pstmt.executeQuery();) {
                if (rs.next()) {
                    ThongTin tt = createThongTin(rs);

                    return tt;
                }
            }
            return null;
        }
    }
    public List<ThongTin> findBy(String a , String b) throws Exception {
        if(a.equals("GioiTinh")&&b.equals("Nam")){
            b = "1" ;
        }
        if(a.equals("GioiTinh")&&b.equals("Nữ")){
            b = "0" ;
        }
        String sql = "SELECT * FROM ThongTinBenhAn WHERE "+a+" = N'"+b+"' ;";
        try (
                Connection con = Connect_DTB.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {

            try (ResultSet rs = pstmt.executeQuery();) {
                List<ThongTin> list = new ArrayList<>();
                
                while(rs.next()) {
                    ThongTin tt = createThongTin(rs);
                    list.add(tt);
                    
                }
                return list ;
            }
        }
    }

    public List<ThongTin> findAll()
            throws Exception {

        String sql = "SELECT * FROM ThongTinBenhAn";

        try (
                Connection con = Connect_DTB.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {

            try (ResultSet rs = pstmt.executeQuery();) {
                List<ThongTin> list = new ArrayList<>();

                while (rs.next()) {
                    ThongTin tt = createThongTin(rs);

                    list.add(tt);
                }
                return list;
            }
        }
    }

    private ThongTin createThongTin(final ResultSet rs) throws SQLException {
        ThongTin tt = new ThongTin();
        
        tt.setMaBenhNhan(rs.getString("MaBenhNhan"));
        tt.setMaBenhAn(rs.getString("MaBenhAn"));
        tt.setMaKhoa(rs.getString("MaKhoa"));
        tt.setNgayVao(rs.getString("NgayVao"));
        tt.setNgayRa(rs.getString("NgayRa"));
        tt.setTenBenhNhan(rs.getString("TenBenhNhan"));
        tt.setTuoi(rs.getString("Tuoi"));
        tt.setGioiTinh(rs.getInt("GioiTinh"));
        tt.setChungMinhThu(rs.getString("ChungMinhThu"));
        tt.setQueQuan(rs.getString("QueQuan"));
        
        return tt;
    }
}
