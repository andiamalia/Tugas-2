/*
NIM             : 13020200173
Nama            : Andi Cici Amalia
Hari/Tanggal    : Selasa, 15-03-2022
Waktu           : 21.05
 */
package Tugas2_Sourcecode;

import java.util.Scanner;
public class PrintXRepeat {
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus : */
        int Sum;
        int x;
        Scanner masukan=new Scanner(System.in);
        /* Program */
        System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
        x = masukan.nextInt(); /* First Elmt */
        
            if (x == 999){
            System.out.print("Kasus kosong \n");
            
            }else { /* MInimal ada satu data yang dijumlahkan*/
                Sum = 0; /* Inisialisasi; invariant !! */
                
                do{
                    Sum = Sum + x; /* Proses */
                    System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
                    x = masukan.nextInt(); /* Next Elmt */
                        
                     } while (x != 999);
                       System.out.println ("Hasil penjumlahan = "+Sum);
                        /* Terminasi */
            } 
    }

}