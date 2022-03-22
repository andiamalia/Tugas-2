/*
NIM             : 13020200173
Nama            : Andi Cici Amalia
Hari/Tanggal    : Ahad, 13-03-2022
Waktu           : 20.30
 */

package Tugas2_Sourcecode;

import java.util.Scanner;
public class If3 {
    public static void main(String[] args) {

        int a;
        Scanner masukan=new Scanner(System.in);
        /* Program */
        System.out.print ("Contoh IF tiga kasus \n"); 
        System.out.print ("Ketikkan suatu nilai integer :"); 
        a=masukan.nextInt();
        
        if (a > 0){
            System.out.println ("Nilai a positif "+ a);
        
        }else if (a == 0){
            System.out.println ("Nilai Nol "+ a);
        
        }else /* a > 0 */ {
            System.out.println ("Nilai a negatif "+ a);
        }
    }
    
}
