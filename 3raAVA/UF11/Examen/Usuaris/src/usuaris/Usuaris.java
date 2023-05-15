/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usuaris;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class Usuaris {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        
        File usuaris = new File ("/home/sanand/Documents/1DAM/Programacio/3raAVA/UF11/Examen/usuaris.txt");
        Scanner sc = new Scanner(System.in);
        try {
            Scanner scf = new Scanner(usuaris);
            System.out.print("User : ");
            String log = sc.nextLine();
            System.out.print("Password : ");
            int pass = sc.nextInt();
            
            boolean continuar = true;
            HashMap<String, Integer> logs = new HashMap<>();
            while (scf.hasNextLine()) {
                String line = scf.nextLine();
                String user = line.split(":")[0];
                String password = line.split(":")[1] ;
                if (user.equals(null) || password.equals(null)) {
                    continuar = false;
                    System.out.println("###Error : Archiu corrupte");
                    break;
                }
                logs.put(user, Integer.valueOf(password));
            }
            if (continuar) {
                int newPass;
                if (logs.containsKey(log)) {
                    if (logs.get(log)==pass) {
                        System.out.print("Nova contrasenya : ");
                        newPass = sc.nextInt();
                        logs.replace(log, newPass);
                    }else 
                        System.out.println("### Usuari o contrasenya no coincideixen amb els valors guardats");
                }else 
                    System.out.println("### Usuari o contrasenya no coincideixen amb els valors guardats");

                FileWriter wUsers = new FileWriter(usuaris);
                for (Map.Entry<String, Integer> entry : logs.entrySet()) {
                    wUsers.write(entry.getKey()+":"+entry.getValue()+"\n");
                }
                wUsers.close();
            }
            scf.close();
        } catch (FileNotFoundException e) {
            System.out.println("***Err : Incorrect path");
        } catch (NumberFormatException e) {
            System.out.println("***Err : Archiu corrupte");
        } catch (InputMismatchException e) {
            System.out.println("***Err : La contraseña a de ser enters");
        } catch (IOException e) {
            System.out.println("***Err : IO Exception");
        }
        
        
    }
}
