/*
NIM             : 13020200173
Nama            : Andi Cici Amalia
Hari/Tanggal    : Senin, 14-03-2022
Waktu           : 17.05
 */
package Tugas2_Sourcecode;

import java.util.Scanner;
public class PriFor {
    
    public static void main(String[] args) {

        int i,N; 
        Scanner masukan=new Scanner(System.in);
        /* Program */
        /* program */
        System.out.print ("Baca N, print 1 s/d N "); 
        System.out.print ("N = ");
        N=masukan.nextInt();
            for (i = 1; i <= N; i++){
                System.out.println (i); 
            };
                System.out.println ("Akhir program \n"); 
    }
}
