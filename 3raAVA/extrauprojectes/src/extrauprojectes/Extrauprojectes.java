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
public class Extrauprojectes {

    /**
     * @param f 
     * @param extensio
     */
    public static void buscar2(File f, String extensio) {
        for (File lf : f.listFiles()) {
            if (lf.isDirectory()) {
                buscar2(lf, extensio);
            }
            else if(lf.getName().contains(extensio)) {
                try {
                    fun(lf, extensio);
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }
        
        
    }
    public static void copia(File f, String extensio) throws IOException {
        Scanner sc = new Scanner(f);
        String b = "";
        String path = "/Users/Andreuet/Documents/1DAM/Programacio/3raAVA/contenedora/";
        String[] nom = f.getName().split(extensio);
        char ch = 'B';
        while (new File (path+nom[0]+b+extensio).exists()) {
            b="_"+ch;
            ch++;
        }
        FileWriter fw = new FileWriter(new File (path+nom[0]+b+extensio), true);
        while (sc.hasNextLine()) {
            fw.write(sc.nextLine()+"\n");
        }
        sc.close();
        fw.close();
    
        
    }
    public static void fun(File f, String extensio) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(f);
        
        String folder = "/Users/Andreuet/Documents/1DAM/Programacio/3raAVA/proves/";
        String nom = f.getName().split(extensio)[0];
        String important = null;
        String id = "";
        
        File copia = new File (folder+nom+extensio);
        
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
        String path = "/Users/Andreuet/Documents/1DAM/Programacio/3raAVA/UF11";
        path = "/Users/Andreuet/Documents/1DAM/Programacio/3raAVA/proves2";
        File f = new File (path);
        buscar2(f, ".java");
        
    }
    
}
