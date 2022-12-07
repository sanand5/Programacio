/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act.pkg14;

import java.util.Scanner;

/**
 *
 * @author sanzs
 */
public class Act14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduix els diners");
        int cant=sc.nextInt(), i=1, billet=500, nbill=0;
        while (cant>0)
           
            switch (i) {
                case 1:
                    nbill=cant/billet;
                    System.out.println(nbill+"de"+billet);
                    cant=cant-(nbill*billet );
                    billet=200;
                    i++;
                    break;
                case 2:
                    nbill=cant/billet;
                    System.out.println(nbill+"de"+billet);
                    cant=cant-(nbill*billet );
                    billet=100;
                    i++;
                    break;
                case 3:
                    nbill=cant/billet;
                    System.out.println(nbill+" de "+billet);
                    cant=cant-(nbill*billet );
                    billet=50;
                    i++;
                    break;
                case 4:
                    nbill=cant/billet;
                    System.out.println(nbill+" de "+billet);
                    cant=cant-(nbill*billet );
                    billet=20;
                    i++;
                    break;
                case 5:
                    nbill=cant/billet;
                    System.out.println(nbill+" de "+billet);
                    cant=cant-(nbill*billet);
                    billet=10;
                    i++;
                    break;
                case 6:
                    nbill=cant/billet;
                    System.out.println(nbill+" de "+billet);
                    cant=cant-(nbill*billet);
                    billet=5;
                    i++;
                    break;
                case 7:
                    nbill=cant/billet;
                    System.out.println(nbill+" de "+billet);
                    i++;
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
