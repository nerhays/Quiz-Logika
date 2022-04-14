/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomor8;

import java.util.Scanner;

/**
 *
 * @author Syahren Maulana
 */
public class Logically {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Inputkan jumlah buah: ");
        int jumlahBuah = userInput.nextInt(); userInput.nextLine();
        System.out.println();
        String[] namaBuah = new String[jumlahBuah];
        int[] banyakBuah = new int[jumlahBuah];
        masukkanNamaDanBanyakBuah(userInput, jumlahBuah, namaBuah, banyakBuah);
        
        int idxBuahTerbanyak = idxBuahTerbanyak(banyakBuah);
        System.out.println(
            (idxBuahTerbanyak >= 0)
            ? "Terbanyak: " + banyakBuah[idxBuahTerbanyak] + " (" + namaBuah[idxBuahTerbanyak] + ")"
            : "---"
            );
    }

    static void masukkanNamaDanBanyakBuah(Scanner userInput, int jumlahBuah, String[] namaBuah, int[] banyakBuah) {
        for (int i = 0; i < jumlahBuah; i++) {
            System.out.print("Masukkan nama buah " + (i + 1) + ": ");
            namaBuah[i] = userInput.nextLine();
            System.out.print("Masukkan banyak buah " + namaBuah[i] + ": ");
            banyakBuah[i] = userInput.nextInt(); userInput.nextLine();
            System.out.println();
        }
    }
    
    static int idxBuahTerbanyak(int[] banyakBuah) {
        int i = banyakBuah.length;
        if (i == 0) return -1; // -> jika jumlahBuah == 0.
        
        int idxOfTerbanyak = 0;
        while (i-- > 1) {
            if (banyakBuah[i] > banyakBuah[idxOfTerbanyak])
                idxOfTerbanyak = i;
        }
        return idxOfTerbanyak;
    }
}