/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prova03;
import java.sql.*;
/**
 *
 * @author sanand
 */
public class Prova03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            String url = "jdbc:mysql://localhost:3306/prova";
            Connection conn = DriverManager.getConnection(url, "root", "");
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("SELECT * FROM venedors");
            int numcolumns = rs.getMetaData().getColumnCount();
            
           
            
            rs.moveToInsertRow();
            rs.updateString(2, "detgwerfsdf");
            rs.updateDate(3, new Date(9999999999999L));
            rs.insertRow();
            rs.moveToCurrentRow();
            
            
            rs.absolute(4);
            rs.deleteRow();
//            for (int i = 0; i < 5; i++) {
//                rs.last();
//                
//            }
            
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
