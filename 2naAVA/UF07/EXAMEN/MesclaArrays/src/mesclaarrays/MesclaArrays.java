/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mesclaarrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author sanand
 */
public class MesclaArrays {

    /**
     * @param args the command line arguments
     */
    public static void omplir(int[] A, int min, int max) {
        for (int i = 0; i < A.length; i++) {
            A[i] = (int) (Math.random() * (max - min + 1) + min);
        }
    }

    public static int[] mescla(int[] array1, int[] array2) {
        int mescla[] = new int[Math.max(array1.length, array2.length)];
        int min = Math.min(array1.length, array2.length);
        int major[];
        if (array1.length>=array2.length)
            major=array1;
        else 
            major=array2;
        for (int i = 0; i < mescla.length; i++) {
            if (i < min) {
                if (i % 2 == 0) {
                    mescla[i] = array1[i];
                } else {
                    mescla[i] = array2[i];
                }
            }else mescla[i] = major[i];
        }
        return mescla;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quina és la grandaria del 1r array? ");
        int V[] = new int[sc.nextInt()];
        omplir(V, 2, 9);
        System.out.print("Quina és la grandaria del 2n array? ");
        int R[] = new int[sc.nextInt()];
        omplir(R, 20, 29);
        System.out.println();
        System.out.println("La mescla dels arrays");
        System.out.println(Arrays.toString(V));
        System.out.println(Arrays.toString(R));
        System.out.println("és:");
        System.out.println(Arrays.toString(mescla(V,R)));
    }
}
