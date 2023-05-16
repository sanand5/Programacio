/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf11_b03;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class UF11_B03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        Scanner srFile;
        FileWriter wr;
        while (true) {
            try {
                System.out.print("file\n?¿ ");
                String path = sc.nextLine();
                //String path = "DocumentsB/usa_persones.txt";
                File f = new File(path);
                srFile = new Scanner(f);
                System.out.print("new file\n?¿ ");
                path = sc.nextLine();
                File newF = new File(path+".txt");
                newF.createNewFile();
                wr = new FileWriter(newF, true);
                break;
            } catch (FileNotFoundException e) {
                System.out.println("***Err : incorrect path");
            } catch (IOException e){
                System.out.println("***Err : IOExcepcion");
            }   
        }
        ArrayList<String> list = new ArrayList<>();
        while (srFile.hasNextLine()) {
            list.add(srFile.nextLine());
        }
        Collections.sort(list);
        
        for (String nombre : list) {
            try {
                wr.write(nombre+"\n");
            } catch (IOException e) {
                System.out.println("***Err : IOExcepcion");
            }
        }
        
        try {
            wr.close();
        } catch (IOException e){
            System.out.println("***Err : IOExcepcion");
        }
        
    }
    
}
