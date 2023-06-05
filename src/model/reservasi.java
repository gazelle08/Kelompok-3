/*
* Nama:Adelia Tabita Sihotang 
*/

package model;

public class reservasi {

/*
 * Deskripsi : 
 * Atribut :
 * Daftar Konser: Daftar konser musik yang tersedia untuk reservasi tiket.
 * Jenis Tiket: Pilihan jenis tiket yang ditawarkan untuk konser.
 * Tanggal dan Waktu: Informasi tentang tanggal dan waktu konser yang tersedia.
 * Harga: Harga tiket berdasarkan jenis tiket yang dipilih.
 * Jumlah Tiket Tersedia: Jumlah tiket yang tersedia untuk setiap jenis tiket dan konser.
 * Tempat Konser: Informasi lokasi atau tempat di mana konser akan diadakan.
 * Daftar Tempat Duduk: Daftar tempat duduk yang tersedia dalam venue konser.
 * Tipe Tempat Duduk: Klasifikasi atau kategori tempat duduk yang tersedia, seperti VIP,atau reguler.
 * Tugas:
 * Menampilkan Daftar Konser: Menampilkan daftar konser musik yang tersedia untuk reservasi tiket.
 * Memilih Konser: Memilih konser musik yang ingin dihadiri oleh pengguna.
 * Memilih Jenis Tiket: Memilih jenis tiket yang diinginkan, seperti tiket reguler atau tiket VIP.
 * Memilih Tanggal dan Waktu: Memilih tanggal dan waktu konser yang tersedia.
 * Memeriksa Ketersediaan Tiket: Memeriksa jumlah tiket yang tersedia untuk jenis tiket dan konser yang dipilih.
 * Menampilkan Daftar Tempat Duduk: Menampilkan daftar tempat duduk yang tersedia dalam venue konser.
 * Memilih Tempat Duduk: Memilih tempat duduk spesifik dari tempat duduk yang tersedia.
 * Menghitung Harga: Menghitung harga total tiket berdasarkan jenis tiket, jumlah tiket, dan tempat duduk yang dipilih.
 */

    
 String daftarKonser;
 String jenisTiket;
 double hargaTiket;
 Integer jumlahTiketTersedia;
 String TempatKonser;
 String daftarTempatDuduk;
 String tipeTempatDuduk;
 
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

    public double getHargaTiket() {
        return this.hargaTiket;
    }

    public void setHargaTiket(double hargaTiket) {
        this.hargaTiket = hargaTiket;
    }

    public Integer getJumlahTiketTersedia() {
        return this.jumlahTiketTersedia;
    }

    public void setJumlahTiketTersedia(Integer jumlahTiketTersedia) {
        this.jumlahTiketTersedia = jumlahTiketTersedia;
    }

    public String getTempatKonser() {
        return this.TempatKonser;
    }

    public void setTempatKonser(String TempatKonser) {
        this.TempatKonser = TempatKonser;
    }

    public String getDaftarTempatDuduk() {
        return this.daftarTempatDuduk;
    }

    public void setDaftarTempatDuduk(String daftarTempatDuduk) {
        this.daftarTempatDuduk = daftarTempatDuduk;
    }

    public String getTipeTempatDuduk() {
        return this.tipeTempatDuduk;
    }

    public void setTipeTempatDuduk(String tipeTempatDuduk) {
        this.tipeTempatDuduk = tipeTempatDuduk;
    }


    public reservasi() {
    }

    public reservasi(String daftarKonser, String jenisTiket, double hargaTiket, Integer jumlahTiketTersedia, String TempatKonser, String daftarTempatDuduk, String tipeTempatDuduk) {
        this.daftarKonser = daftarKonser;
        this.jenisTiket = jenisTiket;
        this.hargaTiket = hargaTiket;
        this.jumlahTiketTersedia = jumlahTiketTersedia;
        this.TempatKonser = TempatKonser;
        this.daftarTempatDuduk = daftarTempatDuduk;
        this.tipeTempatDuduk = tipeTempatDuduk;
    }

    @Override
    public String toString() {
        return "{" +
            " daftarKonser='" + getDaftarKonser() + "'" +
            ", jenisTiket='" + getJenisTiket() + "'" +
            ", hargaTiket='" + getHargaTiket() + "'" +
            ", jumlahTiketTersedia='" + getJumlahTiketTersedia() + "'" +
            ", TempatKonser='" + getTempatKonser() + "'" +
            ", daftarTempatDuduk='" + getDaftarTempatDuduk() + "'" +
            ", tipeTempatDuduk='" + getTipeTempatDuduk() + "'" +
            "}";
    }

}


