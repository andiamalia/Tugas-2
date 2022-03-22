/*
NIM             : 13020200173
Nama            : Andi Cici Amalia
Hari/Tanggal    : Senin, 14-03-2022
Waktu           : 17.16
 */
package Tugas2_Sourcecode;

import java.util.Scanner;
public class PrintWhile {
    
    public static void main(String[] args) {
        int N;
        int i;
        Scanner masukan=new Scanner(System.in);
        /* Program */
        System.out.print ("Nilai N >0 = "); /* Inisialisasi */
        N = masukan.nextInt();
        i = 1; /* First Elmt */
        
        System.out.print ("Print i dengan WHILE: \n"); 
        while (i <= N) /* Kondisi pengulangan */
        { 
            System.out.println (i); /* Proses */
            i++;
        }; /* (i > N) */
    }
}
