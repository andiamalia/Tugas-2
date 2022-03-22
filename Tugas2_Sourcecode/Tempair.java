/*
NIM             : 13020200173
Nama            : Andi Cici Amalia
Hari/Tanggal    : Ahad, 20-03-2022
Waktu           : 20.10
 */
package Tugas2_Sourcecode;

import java.util.Scanner;
public class Tempair {
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus : */
        int T;
        Scanner masukan=new Scanner(System.in);
        System.out.print ("Contoh IF tiga kasus \n"); 
        System.out.print ("Temperatur (der. C) = "); 
        T=masukan.nextInt();
        if (T < 0) {
            System.out.print ("Wujud air beku \n"+ T);
        }else if ((0 <= T) && (T <= 100)){
            System.out.print ("Wujud air cair \n"+ T);
        }else if (T > 100){
            System.out.print ("Wujud air uap/gas \n"+ T); 
        };
    }
}
