/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e1.magatzem;
import java.sql.*;

/**
 *
 * @author AiA
 */
public class E1Magatzem {

    private static final String DB_HOST = "localhost";
//    private static final String DB_PORT = "3307"; // port MySQL IES server#026
    private static final String DB_PORT = "3306";
    private static final String DB_NAME = "magatzem";
    private static final String DB_URL = "jdbc:mysql://" + DB_HOST + ":" + DB_PORT + "/" + DB_NAME + "?serverTimezone=UTC";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "";

    public static void main(String[] args) {
        try {
            // Carreguem el Driver      
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);         
            
            InterficieBBDD magatzem = new InterficieBBDD(conn);
            System.out.println("##1 Mostrem el contingut de la taula PRODUCTES ##");
            magatzem.mostrarProductes();
            
            System.out.print("\n##2 Actualitzem TOTALS només amb els productes actius ##");
            magatzem.inserir(magatzem.suma());
            magatzem.mostrarTotals();
            
            System.out.print("\n##3 Actualitzem TOTALS amb tots els productes ##");            
            magatzem.inserir(magatzem.suma(true));
            magatzem.mostrarTotals();

            conn.close();
        } catch (Exception e) {
            System.out.println("*** Ha fallat l'operació");
            System.out.println(e);
        }

    }
}
