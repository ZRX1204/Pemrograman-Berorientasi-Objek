/*
 * Nama    : Roihan Kusuma Wardana
 * NIM     : 20200040049
 * Kelas   : TI20A
 */
package PBO4;
import java.util.Scanner;

public class PBO4_1 {
    public static void main(String[] args) {
        //inisialisasi variabel
        boolean loop = true;
        do {
            //inisialisasi variabel
            String kalimatAwal, kalimatBalik = "", jawab;
            Scanner sc = new Scanner(System.in);

            System.out.print("Masukkan kalimat : ");
            kalimatAwal = sc.nextLine().toLowerCase();
            int ukuran = kalimatAwal.length();
            for (int i = ukuran - 1; i >= 0; i--) {
                kalimatBalik += kalimatAwal.charAt(i);
            }if (kalimatAwal.equalsIgnoreCase(kalimatBalik)) {
                System.out.println("Result True");
                System.out.println("ini kalimat PALINDROME.");
            } else {
                System.out.println("Result False");
                System.out.println("ini bukan kalimat PALINDROME.");
            }
            System.out.println("==========================================");
            System.out.println("Apakah anda ingin keluar?");
            System.out.print("Jawab [Y/T]> ");
            jawab = sc.nextLine();
            if (jawab.equalsIgnoreCase("Y")) {
                loop = false;
            }
            System.out.println("==========================================");
        } while (loop);
    }
}