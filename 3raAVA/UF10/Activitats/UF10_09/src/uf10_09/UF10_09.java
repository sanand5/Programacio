/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf10_09;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class UF10_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <Gat> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("Iteració nom: "+i);
                System.out.print("Nom del gat: ");
                String nom = sc.nextLine();
                System.out.print("Edat del gat: ");
                int edat = sc.nextInt();
                list.add(new Gat(nom, edat));
                sc.nextLine();
            } catch (ErrNom | ErrEdar e) {
                System.out.println(e);
                sc.nextLine();
                i--;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        imprimir(list);
        
        try {
            System.out.print("Quina posició vols borra: ");
            list.remove(sc.nextInt());
            imprimir(list);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error : No esta en la llista");
        } catch (InputMismatchException e){
            System.out.println("Error : Has de escriure un numero");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void imprimir(ArrayList<Gat> list) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).imprimir();
        }
    }
    
}
