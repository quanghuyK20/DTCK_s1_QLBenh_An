package qlba.DAO;

import ConnectSQL.Connect_DTB;
import Model.ThongTin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Quang Huy
 */
public class ThongKeDao {

    public List<ThongTin> findAll()
            throws Exception {

        String sql = "SELECT COUNT(*) FROM LichKham "
                   + " WHERE STT > 1";

        try (
                Connection con = Connect_DTB.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {

            try (ResultSet rs = pstmt.executeQuery();) {

            }catch(Exception e ){
                
                e.printStackTrace();
                
            }
        }
        return null;
    }
}
