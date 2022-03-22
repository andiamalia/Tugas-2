/*
NIM             : 13020200173
Nama            : Andi Cici Amalia
Hari/Tanggal    : Senin, 14-03-2022
Waktu           : 17.20
 */
package Tugas2_Sourcecode;

import java.util.Scanner;
public class PrintWhile1 {

    public static void main(String[] args) {
        int N;
        int i = 1;
        Scanner masukan=new Scanner(System.in);
        /* Program */
        System.out.print ("Nilai N >0 = "); 
        N = masukan.nextInt();
        System.out.print ("Print i dengan WHILE (ringkas): \n"); 
        
        while (i <= N){
            System.out.println (i++); 
            } /* (i > N)*/
    }
}
