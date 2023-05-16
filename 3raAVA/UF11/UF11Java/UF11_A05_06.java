/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf11_a05_06;

import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author sanand
 */
public class UF11_A05_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File f = new File("/home/sanand/Documents/1DAM/Programacio/3raAVA/UF11/PartA/UF11_A05&06/Eliminar/BBDD/");
        
        try {
            System.out.println("El archiu ha segut eliminat? "+killAll(f));
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static boolean killAll(File f) throws FileNotFoundException {
        if (!f.exists()) {
            throw new FileNotFoundException("*** Error : El archiu no s'ha pogut eliminar ja que "+f.getName()+" no existeix.");
        }
        for (File listFile : f.listFiles()) {
            if (listFile.isDirectory()) {
                killAll(listFile);
            }else new File(listFile.getPath()).delete();
        }
        return f.delete();
    }

    
}
