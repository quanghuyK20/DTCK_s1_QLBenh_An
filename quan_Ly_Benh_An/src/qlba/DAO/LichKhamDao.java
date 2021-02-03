package qlba.DAO;

import ConnectSQL.Connect_DTB;
import Model.LichKham;
import Model.ThongTin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Quang Huy
 */
public class LichKhamDao {

    public boolean insert(LichKham lc) throws Exception {

        String sql = "INSERT INTO LichKham (MaSoKhamBenh, HoTen, NgaySinh ,GioiTinh ,SDT ,NgheNghiep ,Email ,DiaChi, NgayKham ,MoTaTrieuChung) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";

        try (
                Connection con = Connect_DTB.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {

            pstmt.setString(1, lc.getMaSoKhamBenh());
            pstmt.setString(2, lc.getHoTen());
            pstmt.setString(3, lc.getNgaySinh());
            pstmt.setInt(4, lc.getGioiTinh());
            pstmt.setString(5, lc.getSDT());
            pstmt.setString(6, lc.getNgheNghiep());
            pstmt.setString(7, lc.getEmail());
            pstmt.setString(8, lc.getDiaChi());
            pstmt.setString(9, lc.getNgayKham());
            pstmt.setString(10, lc.getMotaTrieuChung());

            return pstmt.executeUpdate() > 0;
        }
    }

    public boolean update(LichKham lc)
            throws Exception {

        String sql = "UPDATE dbo.LichKham"
                + " SET HoTen = ?, NgaySinh = ?, GioiTinh = ?, SDT = ?,"
                + "NgheNghiep = ? , Email = ? , DiaChi = ? ,NgayKham = ? ,MoTaTrieuChung = ?"
                + " WHERE MaSoKhamBenh = ? ";
        try (
                Connection con = Connect_DTB.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {

            pstmt.setString(10, lc.getMaSoKhamBenh());
            pstmt.setString(1, lc.getHoTen());
            pstmt.setString(2, lc.getNgaySinh());
            pstmt.setInt(3, lc.getGioiTinh());
            pstmt.setString(4, lc.getSDT());
            pstmt.setString(5, lc.getNgheNghiep());
            pstmt.setString(6, lc.getEmail());
            pstmt.setString(7, lc.getDiaChi());
            pstmt.setString(8, lc.getNgayKham());
            pstmt.setString(9, lc.getMotaTrieuChung());

            return pstmt.executeUpdate() > 0;
        }

    }

    public boolean deleteByMaKhamBenh(String MaSoKhamBenh)
            throws Exception {

        String sql = "DELETE FROM lichkham"
                + " WHERE [MaSoKhamBenh] =  ? ";
        try (
                Connection con = Connect_DTB.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {

            pstmt.setString(1, MaSoKhamBenh);

            return pstmt.executeUpdate() > 0;
        }

    }

    public LichKham findByMaKhambenh(String MaSoKhamBenh)
            throws Exception {

        String sql = "SELECT * FROM LichKham WHERE [MaSoKhamBenh] =  ? ";
        try (
                Connection con = Connect_DTB.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {

            pstmt.setString(1, MaSoKhamBenh);

            try (ResultSet rs = pstmt.executeQuery();) {
                if (rs.next()) {

                    return createLichKham(rs);
                }
            }
            return null;
        }
    }

    public List<LichKham> findAll()
            throws Exception {

        String sql = "SELECT * FROM LichKham";

        try (
                Connection con = Connect_DTB.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {

            try (ResultSet rs = pstmt.executeQuery();) {
                List<LichKham> list = new ArrayList<>();

                while (rs.next()) {

                    LichKham lc = createLichKham(rs);

                    list.add(lc);
                }
                return list;
            }
        }
    }
    
    public List<LichKham> findBy(String a , String b) throws Exception {
        if(a.equals("GioiTinh")&&b.equals("Nam")){
            b = "1" ;
        }
        if(a.equals("GioiTinh")&&b.equals("Nữ")){
            b = "0" ;
        }
        String sql = "SELECT * FROM LichKham WHERE "+a+" = N'"+b+"' ;";
        try (
                Connection con = Connect_DTB.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {

            try (ResultSet rs = pstmt.executeQuery();) {
                List<LichKham> list = new ArrayList<>();
                
                while(rs.next()) {
                    LichKham lc = createLichKham(rs);
                    list.add(lc);
                    
                }
                return list ;
            }
        }
    }

    public LichKham createLichKham(final ResultSet rs) throws SQLException {
        LichKham lc = new LichKham();

        lc.setMaSoKhamBenh(rs.getString("MaSoKhamBenh"));
        lc.setHoTen(rs.getString("HoTen"));
        lc.setNgaySinh(rs.getString("NgaySinh"));
        lc.setGioiTinh(rs.getInt("GioiTinh"));
        lc.setSDT(rs.getString("SDT"));
        lc.setNgheNghiep(rs.getString("NgheNghiep"));
        lc.setEmail(rs.getString("Email"));
        lc.setDiaChi(rs.getString("DiaChi"));
        lc.setNgayKham(rs.getString("NgayKham"));
        lc.setMotaTrieuChung(rs.getString("MoTaTrieuChung"));

        return lc;
    }

}
