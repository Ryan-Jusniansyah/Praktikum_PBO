 package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author L1400CDA
 */
public class koneksi {
    private static final String URL = "jdbc:mysql://localhost:3306/dbsepatu";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    
    public static Connection getConnection(){
        try{
            return DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException ex) {
            System.out.println("Koneksi gagal: " + ex.getMessage());
            return null;
        }
    }
}