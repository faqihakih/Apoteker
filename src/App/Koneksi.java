/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;


/**
 *
 * @author ACER
 */
public class Koneksi {
    
    public static Connection MySQl(){
    
        try {
            MysqlDataSource ds = new MysqlDataSource();
            ds.setUser("kelasa");        
            ds.setPassword("kelasa123");
            ds.setServerName("localhost");
            ds.setDatabaseName("dbapotek");
            ds.setPortNumber(3306);
            Connection c = ds.getConnection();
            return c;
        } catch (SQLException e) {
            
            System.err.println(e.getMessage());
            return null;
        }
    }
    
//    public static void main(String[] args) {
//        
//        
//        try {
//            Connection conn = Koneksi.MySQl();
//            System.out.println(conn.getCatalog());
//        } catch (SQLException e) {
//            
//        }
////    }
}
