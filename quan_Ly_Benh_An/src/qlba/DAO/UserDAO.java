    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlba.DAO;

/**
 *
 * @author Quang Huy
 */
import ConnectSQL.Connect_DTB;
import Model.UserData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO {

    public UserData checkLogin(String UserID, String Password, String QuyenTruyCap)
            throws Exception {
        String sql = "select UserID, Password, QuyenTruyCap from LogIn "
                + " where UserID = ? and Password = ? and QuyenTruyCap = ? ";

        try (
                Connection con = Connect_DTB.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ) {
            
            pstmt.setString(1, UserID);
            pstmt.setString(2, Password);
            pstmt.setString(3, QuyenTruyCap);
            
            try (ResultSet rs = pstmt.executeQuery();) {
                if (rs.next()) {
                    UserData us = new UserData();
                    us.setUserID(UserID);
                    
                    return us;
                }
            }
        }
        return null;

    }

}
