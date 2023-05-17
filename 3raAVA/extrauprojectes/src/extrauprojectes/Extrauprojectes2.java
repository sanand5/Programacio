/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extrauprojectes;

import java.io.File;
import java.io.FileNotFoundException;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Andreuet
 */
public class Extrauprojectes2 {

    /**
     * @param f 
     * @param extensio
     */
    public static void buscar2(File f, File d, String extensio) {
        for (File lf : f.listFiles()) {
            if (lf.isDirectory()) {
                File[] list = lf.listFiles();
                String nom;
                int fjava = 0;
                
                for (File file : list) {
                    if (file.isFile()) {
                        if (file.getName().split("\\.")[file.getName().split("\\.").length-1].equals("java")) {
                            fjava++;
                        }
                    }
                }
                
                if (fjava>1) {
                    nom = lf.getName();
                    File carpetacreada = new File(d, nom);
                    carpetacreada.mkdir();
                    buscar2(lf, carpetacreada, extensio);
                }else 
                buscar2(lf, d, extensio);
            }
            else if(lf.getName().contains(extensio)) {
                try {
                    copia( lf, d, extensio);
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }
        
        
    }
    
    public static void copia(File file, File desti, String extensio) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(file);
        
        
        String nom = file.getName().split(extensio)[0];
        String important = "";
        String id = "";
        
        File copia = new File (desti, nom+extensio);
        
        FileWriter fw = new FileWriter(copia, true);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.contains("important") || line.contains("Important") || line.contains("IMPORTANT")) {
                important = "*";
            }
            if (line.contains("id :") || line.contains("Id :") || line.contains("ID :") || line.contains("id:") || line.contains("Id:") || line.contains("ID:")) {
                id = "_"+line.split(": ")[1].replace(" ", "-");
            }
            fw.write(line+"\n");
        }
        copia.renameTo(new File(copia.getParent(), important+nom+id+extensio));
        sc.close();
        fw.close();
    }
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        //path = "/Users/Andreuet/Documents/1DAM/Programacio/3raAVA/jk";
        File origen = new File ("/Users/Andreuet/Documents/1DAM/Programacio/3raAVA/UF11");
        File desti = new File ("/Users/Andreuet/Documents/1DAM/copia");
        desti.mkdir();
        try {
            if (!origen.exists()) {
                throw new FileNotFoundException();
            }
            buscar2(origen,desti, ".java");
            System.out.println("Tot bé :)");
        } catch (FileNotFoundException e) {
            System.out.println("***Err : El fitcher no eistei");
        }
        
    }
    
}