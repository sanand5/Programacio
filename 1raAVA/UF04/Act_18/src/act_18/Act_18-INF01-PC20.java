/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act_18;


import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class Act_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Disme el teu nom");
        String nom= sc.nextLine();
        
        System.out.println("Cuantes hores treballes?");
        int H=sc.nextInt();
        
        System.out.println("A quant treballes");
        double preu=sc.nextDouble();
        
        double brut=0, imp=0;
        
        if(H>35){
            
            brut=(H-35)*(preu*1.5)+(35*preu);
            
        }else brut=preu*H;
        
        if (brut>500) {
            
            if (brut>900) {
                
                imp=400*0.25+(brut-900)*0.45;
                
            } else {
                
                imp=(brut-500)*0.25;
            }
        } 
        double net=brut-imp;
        System.out.println("El treballador "+nom+", te un brut de "+brut+"€ uns impostos de "+imp+"€ i un salari net de "+net+"€");
    }
    
}
