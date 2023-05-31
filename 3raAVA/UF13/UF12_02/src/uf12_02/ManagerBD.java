/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf12_02;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.Scanner;
/**
 *
 * @author sanand
 */
public class ManagerBD {
    private static Connection conn = null;
    String url;
    String user;
    String pass;
    

    public ManagerBD(String url, String user, String pass) {
        try {
         System.out.print("Cargando Driver...");
         Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
         System.out.println("OK!");
         System.out.print("Conectando a la base de datos...");
         conn = DriverManager.getConnection(url, user, pass);

         System.out.println("OK!");
      } catch (ClassNotFoundException ex) {
         ex.printStackTrace();
         
      } catch (Exception ex) {
         ex.printStackTrace();
         
      }
    }
    
    public void poblarBD(String path) throws SQLException, FileNotFoundException {
        Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = stmt.executeQuery("SELECT * FROM contactes");
        Scanner sc = new Scanner(new File (path));
        while (sc.hasNextLine()) {
            String[] fila = sc.nextLine().split(":");
            
            rs.moveToInsertRow();
            rs.updateString(2, fila[0]);
            rs.updateString(3, fila[1]);
            rs.updateString(4, fila[2]);
            rs.insertRow();
            //rs.updateRow();
        }
        
        rs.close();
        stmt.close();
    }
    public void exportarBD(String path) {
        
    }
    public void close() {
        
    }

    
   
   
    
}
