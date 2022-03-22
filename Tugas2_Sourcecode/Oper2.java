/*
NIM             : 13020200173
Nama            : Andi Cici Amalia
Hari/Tanggal    : Sabtu, 12-03-2022
Waktu           : 18.06
 */
package Tugas2_Sourcecode;

public class Oper2 {
    public static void main(String[] args) {
        
        char i, j;
        /* ALGORITMA */
        i = 3; /* 00000011 dalam biner */
        j = 4; /* 00000100 dalam biner */

        System.out.println("i = "+ (int) i); 
        System.out.println("j = "+ j);
        System.out.println("i & j = "+ (i & j)); 
        System.out.println("i | j = "+ (i | j)); 
        System.out.println("i ^ j = "+ (i ^ j)); 

        System.out.println(Math.pow(i, j)); 
        System.out.println(" ~i = "+ ~i); 
    }
}
