/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnectSQL;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Quang Huy
 */
public class Connect_DTB {

    public static Connection openConnection() throws Exception {

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionUrl = "jdbc:sqlserver://localhost; database=QuanLyBenhAn";
        String dbusername = "sa";
        String password = "030107";
        
        Connection con = DriverManager.getConnection(connectionUrl, dbusername, password);
        
        return con;
    }

}

