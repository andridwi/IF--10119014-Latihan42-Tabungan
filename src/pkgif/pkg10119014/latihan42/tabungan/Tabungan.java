/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkg10119014.latihan42.tabungan;

/**
 *
* @author Andri
 * Nama : Andri Dwi P
 * kelas: IF-1
 * NIM  : 10119014
 */
class Tabungan {
    private int saldo;
     
    public Tabungan(int saldo){
        this.saldo = saldo;
    }
    public int ambilUang(int jumlah){
      return saldo - jumlah;  
    }
}
