/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkg10119014.latihan42.tabungan;
import java.util.Scanner;
/**
 *
 * @author Andri
 * Nama : Andri Dwi P
 * kelas: IF-1
 * NIM  : 10119014
 */
public class IF10119014Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("=====Program Penarikan Uang=====");
    System.out.print("Masukan Saldo Awal : ");
    int saldo = scanner.nextInt();
    Tabungan tabungan = new Tabungan (saldo);
    System.out.print("Jumlah uang yang diambil : ");
    int jumlah = scanner.nextInt();
    
    System.out.println("Saldo Anda Sekarang : " + tabungan.ambilUang(jumlah));
    }
    
}
