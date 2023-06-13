/*
 * Nama: Jerry Robert
 */
package model;

public class tiket {
/*
 * Deskripsi : Menampilkan Reservasi
 * Atribut :
*Daftar Konser
*Jenis Tiket
*Tanggal dan Waktu
*Harga
*Tempat Konser
*Tipe Tempat Duduk

Tugas:
Menampilkan daftar konser musik yang telah dibeli sebelumnya
Menampilkan jenis tiket yang dibeli oleh customer seperti reguler atau VIP
Menampilkan tanggal dan waktu mulainya konser
Menampilkan harga tiket yang sudah dipilih sebelumnya
Menampilkan tempat lokasi yang harus dituju oleh customer
Menampilkan lokasi tempat duduk mana yang akan diduduki oleh customer berdasarkan tipe tiket yang ia beli
 */

String daftarKonser;
String jenisTiket;
double harga;
String tempatKonser;
String tipeTempatDuduk;

    public tiket(String daftarKonser, String jenisTiket, double harga, String tempatKonser, String tipeTempatDuduk) {
        this.daftarKonser = daftarKonser;
        this.jenisTiket = jenisTiket;
        this.harga = harga;
        this.tempatKonser = tempatKonser;
        this.tipeTempatDuduk = tipeTempatDuduk;
    }

    public tiket() {
    }

    public String getDaftarKonser() {
        return this.daftarKonser;
    }

    public void setDaftarKonser(String daftarKonser) {
        this.daftarKonser = daftarKonser;
    }

    public String getJenisTiket() {
        return this.jenisTiket;
    }

    public void setJenisTiket(String jenisTiket) {
        this.jenisTiket = jenisTiket;
    }

    public double getHarga() {
        return this.harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getTempatKonser() {
        return this.tempatKonser;
    }

    public void setTempatKonser(String tempatKonser) {
        this.tempatKonser = tempatKonser;
    }

    public String getTipeTempatDuduk() {
        return this.tipeTempatDuduk;
    }

    public void setTipeTempatDuduk(String tipeTempatDuduk) {
        this.tipeTempatDuduk = tipeTempatDuduk;
    }

    @Override
    public String toString() {
        return "{" +
            " daftarKonser='" + getDaftarKonser() + "'" +
            ", jenisTiket='" + getJenisTiket() + "'" +
            ", harga='" + getHarga() + "'" +
            ", tempatKonser='" + getTempatKonser() + "'" +
            ", tipeTempatDuduk='" + getTipeTempatDuduk() + "'" +
            "}";
    }

}
