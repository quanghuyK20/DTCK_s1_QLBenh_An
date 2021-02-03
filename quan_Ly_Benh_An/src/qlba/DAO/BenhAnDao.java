package qlba.DAO;

import ConnectSQL.Connect_DTB;
import Model.QuanLyBenhAn;
import Model.ThongTin;
import Model.UserData;
import java.awt.Event;
import java.util.List;
import java.awt.color.ICC_ColorSpace;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.sql.rowset.serial.SerialBlob;

/**
 *
 * @author Quang Huy
 */
public class BenhAnDao {

    public boolean insert(QuanLyBenhAn ba)   throws Exception {

        String sql = "INSERT INTO QLBenhAn ( MaBenhAn ,TenBenhNhan ,NguoiPhuTrach ,Email ,Khoa ,MoTa ,TinhTrang ,Hinh) VALUES (?, ?, ?, ? , ?, ?, ?, ?) ";
        try (
                Connection con = Connect_DTB.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {

            pstmt.setString(1, ba.getMaBenhAn());
            pstmt.setString(2, ba.getTenBenhNhan());
            pstmt.setString(3, ba.getNguoiPhuTrach());
            pstmt.setString(4, ba.getEmail());
            pstmt.setString(5, ba.getKhoa());
            pstmt.setString(6, ba.getMoTa());
            pstmt.setInt(7, ba.getTinhTrang());

            if (ba.getHinh() != null) {
                Blob Hinh = new SerialBlob(ba.getHinh());
                pstmt.setBlob(8, Hinh);
            } else {
                Blob Hinh = null;
                pstmt.setBlob(8, Hinh);
            }
            return pstmt.executeUpdate() > 0;
        }

    }

    public boolean delete(String MaBenhAn) throws Exception {

        String sql = "delete from QLBenhAn"
                + " where MaBenhAn = ? ";
        try (
                Connection con = Connect_DTB.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {

            pstmt.setString(1, MaBenhAn);

            return pstmt.executeUpdate() > 0;
        }
    }

    public boolean update(QuanLyBenhAn ba)   throws Exception {

        String sql = " UPDATE dbo.QLBenhAn"
                + " SET TenBenhNhan = ? ,NguoiPhuTrach = ?, Email = ?,Khoa = ?,MoTa = ?,TinhTrang = ? , Hinh = ? "
                + " where MaBenhAn = ? ";
        try (
                Connection con = Connect_DTB.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {

            pstmt.setString(8, ba.getMaBenhAn());
            pstmt.setString(1, ba.getTenBenhNhan());
            pstmt.setString(2, ba.getNguoiPhuTrach());
            pstmt.setString(3, ba.getEmail());
            pstmt.setString(4, ba.getKhoa());
            pstmt.setString(5, ba.getMoTa());
            pstmt.setInt(6, ba.getTinhTrang());

            if (ba.getHinh() != null) {
                Blob Hinh = new SerialBlob(ba.getHinh());
                pstmt.setBlob(7, Hinh);
            } else {
                Blob Hinh = null;
                pstmt.setBlob(7, Hinh);
            }
            return pstmt.executeUpdate() > 0;
        }

    }

    public QuanLyBenhAn findByID(String MaBenhAn)
            throws Exception {

        String sql = "select * from QLBenhAn where MaBenhAn = ? ";
        try (
                Connection con = Connect_DTB.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {

            pstmt.setString(1, MaBenhAn);
            try (ResultSet rs = pstmt.executeQuery();) {
                if (rs.next()) {
                    QuanLyBenhAn ba = createBenhAn(rs);
                    return ba;
                }
            }
            return null;
        }

    }

    public List<QuanLyBenhAn> findBy(String a, String b) throws Exception {
        if (a.equals("TinhTrang") && b.equals("Đã Ra Viện")) {
            b = "1";
        }
        if (a.equals("TinhTrang") && b.equals("Chưa Ra Viện")) {
            b = "0";
        }
        String sql = "SELECT * FROM QLBenhAn WHERE " + a + " = N'" + b + "' ;";
        try (
                Connection con = Connect_DTB.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {

            try (ResultSet rs = pstmt.executeQuery();) {
                List<QuanLyBenhAn> list = new ArrayList<>();

                while (rs.next()) {
                    QuanLyBenhAn ba = createBenhAn(rs);
                    list.add(ba);

                }
                return list;
            }
        }
    }

    public List<QuanLyBenhAn> findAll() throws Exception {

        String sql = "select * from QLBenhAn ";
        try (
                Connection con = Connect_DTB.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {

            try (ResultSet rs = pstmt.executeQuery();) {
                List<QuanLyBenhAn> list = new ArrayList<>();
                while (rs.next()) {
                    QuanLyBenhAn ba = createBenhAn(rs);
                    list.add(ba);
                }
                return list;
            }
        }
    }


    private QuanLyBenhAn createBenhAn(final ResultSet rs) throws SQLException {
        QuanLyBenhAn ba = new QuanLyBenhAn();
        ba.setMaBenhAn(rs.getString("MaBenhAn"));
        ba.setTenBenhNhan(rs.getString("TenBenhNhan"));
        ba.setNguoiPhuTrach(rs.getString("NguoiPhuTrach"));
        ba.setEmail(rs.getString("Email"));
        ba.setKhoa(rs.getString("Khoa"));
        ba.setMoTa(rs.getString("MoTa"));
        ba.setTinhTrang(rs.getInt("TinhTrang"));

        Blob blob = rs.getBlob("Hinh");
        if (blob != null) {
            ba.setHinh(blob.getBytes(1, (int) blob.length())); // Đọc dữ liệu hình từ CSDL
        }
        return ba;
    }

}
