/*
NIM             : 13020200173
Nama            : Andi Cici Amalia
Hari/Tanggal    : Jumat, 11-03-2022
Waktu           : 13.22
 */
package Tugas2_Sourcecode;

import java.util.Scanner;

public class BacaData {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus */
        int a;
        Scanner masukan;
        /* Program */
        System.out.print ("Contoh membaca dan menulis, ketik nilai integer: \n");
        masukan = new Scanner(System.in);
        a = masukan.nextInt(); /* coba ketik : masukan.nextInt(); ; 
        Apa akibatnya ?*/
        System.out.print ("Nilai yang dibaca : "+ a);
    }
    
}
