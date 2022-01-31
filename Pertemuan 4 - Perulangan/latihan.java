/*
 * Nama    : Roihan Kusuma Wardana
 * NIM     : 20200040049
 * Kelas   : TI20A
 */
package pbo4;
import java.util.Scanner;
/**
 *
 * @author ZRX1204
 */
public class latihan {
    public static void main(String args[]) {
        /*MEMBALIKKAN KATA*/
 String kata, dibalik = "";
 Scanner in = new Scanner(System.in);
 System.out.println("Masukkan kata :");
 kata= in.nextLine();
 
 for ( int i = kata.length()-1 ; i >= 0 ; i-- )
 dibalik = dibalik + kata.charAt(i);
 
 System.out.println("Kata dibalik : "+dibalik );
 }
}