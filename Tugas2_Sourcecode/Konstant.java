/*
NIM             : 13020200173
Nama            : Andi Cici Amalia
Hari/Tanggal    : Senin, 14-03-2022
Waktu           : 16.20
 */
package Tugas2_Sourcecode;

import java.util.Scanner;
public class Konstant{
public static void main(String[] args) {
        final float PHI = 3.1415f; 
        float r;
        Scanner masukan=new Scanner(System.in);
        
        /* program */ /* baca data */
        System.out.print ("Jari-jari lingkaran ="); 
        r = masukan.nextFloat();
        
        /* Hitung dan tulis hasil */
        System.out.print ("Luas lingkaran = "+ (PHI * r * r )+"\n");
        System.out.print ("Akhir program \n");
    }
    
}
