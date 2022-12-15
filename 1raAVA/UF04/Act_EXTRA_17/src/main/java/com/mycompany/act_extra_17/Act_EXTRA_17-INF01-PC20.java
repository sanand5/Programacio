/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.act_extra_17;

import java.util.Scanner;

/**
 *
 * @author sanzs
 */
public class Act_EXTRA_17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix les hores:");
        int h=sc.nextInt();
        System.out.print("Introdueix els minuts:");
        int min=sc.nextInt();
        System.out.print("Introdueix els segons:");
        int sec=sc.nextInt();
        sec++;
        if (sec==60) {
            min++;
            sec=0;
            if(min==60){
                h++;
                min=0;
                if(h==24){
                    h=0;
                }
            }
        }
        System.out.println("Si li sumem 1 sec. son les "+h+":"+min+":"+sec);
    }
}
