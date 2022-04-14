/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomor2;

import java.util.Scanner;

/**
 *
 * @author Syahren Maulana
 */
public class ganjilgenap {
    public static void main(String args[]){
         Scanner input = new Scanner(System.in);
         System.out.print("Masukkan Bilangan: ");
        int bilangan = input.nextInt();
        if (bilangan %2 == 1){
            System.out.println("GANJIL");
        }
        else
            System.out.println("GENAP");
    }
             
   
}
