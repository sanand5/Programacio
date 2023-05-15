/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf11_b04;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class UF11_B04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> surnames = new ArrayList<>();
        try {
            Scanner scname = new Scanner(new File("DocumentsB/usa_noms.txt"));
            Scanner scsur = new Scanner(new File("DocumentsB/usa_cognoms.txt"));
            System.out.print("number?");
            int cant = sc.nextInt();
            sc.nextLine();
            System.out.print("file?");
            FileWriter wr = new FileWriter(new File(sc.nextLine() + ".txt"), true);
            while (scname.hasNextLine()) {
                names.add(scname.nextLine());
            }
            while (scsur.hasNextLine()) {
                surnames.add(scsur.nextLine());
            }
            for (int i = 0; i < cant; i++) {
                try {
                    wr.write(names.get((int) (Math.random() * (names.size() - 1 - 0 + 1) + 0)) + " " + surnames.get((int) (Math.random() * (surnames.size() - 1 - 0 + 1) + 0)) + "\n");
                } catch (IOException e) {
                    System.out.println("***Err : IOException");
                }
            }
            sc.close();
            scname.close();
            scsur.close();
            wr.close();
        } catch (FileNotFoundException e) {
            System.out.println("***Err : incorrect path");
        } catch (IOException e) {
            System.out.println("***Err : IOException");
        } catch (InputMismatchException e) {
            System.out.println("***Err : only numbers pls");
        }

    }

}
