/*
 * Nama: Vanessa Thames
 */
package model;

public class jadwalkonser {
/*
 * Deskripsi: Tampilan Jadwal Konser
 * Atribut:
 * Nama Konser
 * Nama artis/group musik
 * 
 * Tugas:
 * Menampilkan nama konser yang dimiliki oleh nama artis/ group musik
 * Menampilkan nama artis atau grup musik yang akan tampil dalam konser.
 */ 

String namaKonser;
String namaArtis;

    public String getNamaKonser() {
        return this.namaKonser;
    }

    public void setNamaKonser(String namaKonser) {
        this.namaKonser = namaKonser;
    }

    public String getNamaArtis() {
        return this.namaArtis;
    }

    public void setNamaArtis(String namaArtis) {
        this.namaArtis = namaArtis;
    }
}
