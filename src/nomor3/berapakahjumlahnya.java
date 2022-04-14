/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomor3;

import java.util.Scanner;

/**
 *
 * @author Syahren Maulana
 */
public class berapakahjumlahnya {
    public static void main(String[] args) {
     System.out.println("Menghitung Bilangan 1 sampai n bilangan");
     System.out.println("________________________________________________");
    
     int n;
     int hasil = 0;

     Scanner x = new Scanner(System.in);
     System.out.print("Masukan banyak bilangan = ");
     n = x.nextInt();

     for (int i=1; i<=n; i++)
     hasil += i;
     System.out.println("Jumlah bilangan = " + hasil);
    }
    
}
