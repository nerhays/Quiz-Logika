/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomor4;

import java.util.Scanner;

/**
 *
 * @author Syahren Maulana
 */
public class ganjilgenapke2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
    System.out.println("##  Program Java Cari Ganjil Genap  ##");
    System.out.println("========================================");
    System.out.println();
    
        System.out.println("Masukkan Angka :");
      
      
       int angka[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
 
        System.out.println("\t Ganjil & Genap Array \n");
 
        System.out.print("\n Genap : ");
        for (int i = 0; i < 10; i++) {
            if (angka[i] % 2 == 0) {
                System.out.print(angka[i] + ", ");
 
            }
        }
 
        System.out.print("\n Ganjil : ");
        for (int j = 0; j < 10; j++) {
            if (angka[j] % 2 != 0) {
                System.out.print(angka[j] + ", ");
            }
    }
    }
}
 
        