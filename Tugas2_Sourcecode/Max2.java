/*
NIM             : 13020200173
Nama            : Andi Cici Amalia
Hari/Tanggal    : Senin, 14-03-2022
Waktu           : 17.00
 */
package Tugas2_Sourcecode;

import java.util.Scanner;
public class Max2 {
    
    public static void main(String[] args) {

        int a, b;
        Scanner masukan=new Scanner(System.in);
        /* Program */
        System.out.print ("Maksimum dua bilangan : \n");
        System.out.print ("Ketikkan dua bilangan, pisahkan dg RETURN : \n");
        a=masukan.nextInt();
        b=masukan.nextInt();

        System.out.println ("Ke dua bilangan : a = "+ a+" b = "+b); 
        if (a >= b){
            System.out.println ("Nilai a yang maksimum "+ a);
        
        }else /* a > b */{
            System.out.println ("Nilai b yang maksimum: "+ b);
        } 
    }
}
