/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf13_01;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

import java.sql.*;
/**
 *
 * @author sanand
 */
public class InterficieBBDD {

    // Conexión a la base de datos
    private static Connection conn = null;
    
    public InterficieBBDD(Connection conn) {
        this.conn = conn;
    }

    /**
     * Esta funció suma tots els preus dels productes actius
     * @return La suma dels preus dels productes
     * @see #suma(boolean) 
     */
    public int suma() {
        return suma(false);
    }

    /**
     * Esta funció suma els preus dels productes
     * @param actiu : segons el seu valor la funcio sumara uns valors o tots 
     * <ul>
     * <li>true : suma tots els valors</li>
     * <li>false : suma sols els valors actius</li>
     * </ul>
     * @return La suma dels preus dels productes
     */
    public int suma(boolean actiu) {

        int res = 0;
        try {
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("SELECT * FROM productes");
            

            if (!actiu) {
                while (rs.next()) {
                    if (rs.getBoolean("actiu")) {
                        res+=rs.getDouble("preu");
                    }
                }
            }else{
                while (rs.next()) {
                    res+=rs.getDouble("preu");
                }
            }
            
            rs.close();
            stmt.close();
            

        } catch (Exception x) {
            System.out.println(x);
        }
        
        return res;
    }

    /**
     * Esta funcio insereix el preu total del producte i la data actual a la taula totals
     * @param total : fa referencia al valor total dels productes
     */
    public void inserir(int total) {
        try {
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("SELECT * FROM totals");
            
            rs.moveToInsertRow();
            rs.updateDate("data", new Date(1));
            rs.updateInt("total", total);
            rs.insertRow();

            
            
            rs.close();
            stmt.close();
            

        } catch (Exception x) {
            System.out.println(x);
        }
    }

    
    /**
     * Mostra la taula de productes
     * @see #mostrar(java.lang.String, java.lang.String) 
     */
    public void mostrarProductes() {
        mostrar("productes", "PRODUCTES DEL MAGATZEM");
    }

    /**
     * Mostra la taula total
     */
    public void mostrarTotals() {
        mostrar("totals", "TAULA TOTALS");
    }

    /**
     * Mostra una taula
     * @param tabla : fa referencia a la taula que es demana
     * @param text : fa referència al titol de dalt de la taula
     */
    public void mostrar(String tabla, String text) {
        try {
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("SELECT * FROM "+tabla);
            System.out.println("\n|----- "+text);
            ResultSetMetaData md = (ResultSetMetaData) rs.getMetaData();
            for (int i = 1; i <= md.getColumnCount(); i++) {
                System.out.printf("| %-6s", md.getColumnName(i));
            }
            System.out.println();
            while (rs.next()) {
                for (int i = 1; i <= md.getColumnCount(); i++) {
                    System.out.printf("| %-6s", rs.getString(i));
                }
                System.out.println();
            }
            rs.close();
            stmt.close();

        } catch (Exception x) {
            System.out.println(x);
        }
    }
}
/*
Exepcions
Revisar comentaris
correu
*/