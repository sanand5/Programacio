/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e4article;

/**
 *
 * @author AiA
 */
public class E4Article {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\n####### \nInstanciem article1:");
        Article article1 = new Article("Pantaló", 55.5, 21, -5);

        System.out.println("\n####### \nInstanciem article2:");
        Article article2 = new Article("Pijana", 100, 21, 10);
        article2.imprimeix();

        System.out.println("\n####### \nCanvi de preu article2:");
        article2.setPreu(0);
        System.out.println("El preu d'a2 és: " + article2.getPreu());

        System.out.println("\n####### \nCanvi quants queden article2:");
        article2.setQuantsQueden(13);
        article2.imprimeix();

        System.out.println("\n####### \nCalcular descompte d'article2:");
        System.out.println("El PVP d'a2 amb 20% de descompte és: " + article2.getPVPDescompte(20) + "€");

        System.out.println("\n####### \nVendre unitats d'article2:");
        int unitats = 24;
        if (article2.vendre(unitats)) {
            System.out.println("S'han venut " + unitats + " unitats de " + article2.getNom());
        } else {
            System.out.println("No hi ha suficients unitats per a vendre");
        }

        System.out.println("\n####### \nEmmagatzemar unitats d'article2:");
        unitats = 11;
        if (article2.emmagatzema(unitats)) {
            System.out.println("S'han emmagatzemat " + unitats + " unitats de " + article2.getNom());
            System.out.println("Queden " + article2.getQuantsQueden() + " unitats");
        } else {
            System.out.println("ERROR, no es poden emmagatzemar valors negatius");
        }

        System.out.println("\n####### \nCanvi article2 a 10% IVA:");
        article2.setIva(10);
        article2.imprimeix();

        System.out.println("\n####### \nCanvi article2 a 33% IVA:");
        article2.setIva(33);

        System.out.println("\n####### \nInstanciem article3:");
        Article article3 = new Article("Sabates", 89, 12, 8);
    }

}
