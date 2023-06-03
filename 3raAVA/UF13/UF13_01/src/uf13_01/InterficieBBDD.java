/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf13_01;

import java.sql.*;
import java.time.LocalDate;

/**
 *
 * @author sanand
 */
public class InterficieBBDD {

    private static Connection conn = null;

    public InterficieBBDD(Connection conn) {
        InterficieBBDD.conn = conn;
    }

    /**
     * Aquesta funció suma tots els preus dels productes actius.
     *
     * @return La suma dels preus dels productes
     * @see #suma(boolean)
     */
    public int suma() {
        return suma(false);
    }

    /**
     * Aquesta funció suma els preus dels productes.
     *
     * @param actiu Segons el seu valor, la funció sumarà uns valors o tots.
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
                        res += rs.getDouble("preu");
                    }
                }
            } else {
                while (rs.next()) {
                    res += rs.getDouble("preu");
                }
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            System.out.println("### Error: Error en la Base de Dades ###");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("### Error: Error desonegut ###");
            System.out.println(e.getMessage());
        }

        return res;
    }

    /**
     * Aquesta funció insereix el preu total del producte i la data actual a la
     * taula "totals".
     *
     * @param total Fa referencia al valor total dels productes
     */
    public void inserir(int total) {
        try {
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("SELECT * FROM totals");

            rs.moveToInsertRow();
            rs.updateDate("data", Date.valueOf(LocalDate.now()));
            rs.updateInt("total", total);
            rs.insertRow();
            System.out.println("\nTOTALS s'ha acctualitzat amb un total de: " + total);
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            System.out.println("### Error: Error en la Base de Dades ###");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("### Error: Error desonegut ###");
            System.out.println(e.getMessage());
        }
    }

    /**
     * Mostra la taula de productes
     */
    public void mostrarProductes() {
        try {
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("SELECT * FROM productes");
            System.out.println("\n|----- PRODUCTES DEL MAGATZEM");
            System.out.printf("| %-6s", "ID");
            System.out.printf("| %-11s", "Nom");
            System.out.printf("| %-8s", "Preu");
            System.out.printf("| %s\n", "Actiu");
            while (rs.next()) {
                System.out.printf("| %-6s", rs.getInt(1));
                System.out.printf("| %-11s", rs.getString(2));
                System.out.printf("| %-8s", rs.getInt(3));
                System.out.printf("| %s\n", rs.getInt(4));
            }
            rs.close();
            stmt.close();

        } catch (SQLException e) {
            System.out.println("### Error: Error en la Base de Dades ###");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("### Error: Error desonegut ###");
            System.out.println(e.getMessage());
        }
    }

    /**
     * Mostra la taula del preu total
     */
    public void mostrarTotals() {
        try {
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("SELECT * FROM totals");
            System.out.println("\n|----- TAULA TOTALS");
            System.out.printf("| %-6s", "ID");
            System.out.printf("| %-11s", "Data");
            System.out.printf("| %-8s\n", "Total");
            while (rs.next()) {
                System.out.printf("| %-6s", rs.getInt(1));
                System.out.printf("| %-11s", rs.getDate(2));
                System.out.printf("| %s\n", rs.getInt(3));
            }

            rs.close();
            stmt.close();
        } catch (SQLException e) {
            System.out.println("### Error: Error en la Base de Dades ###");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("### Error: Error desonegut ###");
            System.out.println(e.getMessage());
        }
    }

}
