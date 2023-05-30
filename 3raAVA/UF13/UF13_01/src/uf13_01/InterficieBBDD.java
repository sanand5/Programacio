/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf13_01;

import java.sql.Connection;

/**
 *
 * @author sanand
 */
public class InterficieBBDD {
    // Conexión a la base de datos
   private static Connection conn = null;

   // Configuración de la conexión a la base de datos
   private static final String DB_HOST = "localhost";
   private static final String DB_PORT = "3306"; // Port#3306 en casa
//   private static final String DB_PORT = "3307"; // Port#3307 en server aula#026 
   private static final String DB_NAME = "tienda";  //"tienda";
   private static final String DB_URL = "jdbc:mysql://" + DB_HOST + ":" + DB_PORT + "/" + DB_NAME + "?serverTimezone=UTC";
   private static final String DB_USER = "root";
   private static final String DB_PASS = "";
   private static final String DB_MSQ_CONN_OK = "CONEXIÓN CORRECTA";
   private static final String DB_MSQ_CONN_NO = "ERROR EN LA CONEXIÓN";

   // Configuración de la tabla Clientes
   private static final String DB_CLI = "clientes";
   private static final String DB_CLI_SELECT = "SELECT * FROM " + DB_CLI;
   private static final String DB_CLI_ID = "id";
   private static final String DB_CLI_NOM = "nombre";
   private static final String DB_CLI_DIR = "direccion";

   //////////////////////////////////////////////////
   // MÉTODOS DE CONEXIÓN A LA BASE DE DATOS
   //////////////////////////////////////////////////
}
