/*
 * Nama: Elaine Agustina
 */     
package model;

public class pembayaran {
    /*
* Deskripsi:
*  Atribut:
*      - Metode pembayaran 
*      - Nomor kartu kredit 
*      - Jumlah tiket
*      - Jenis tiket
*      - Harga
*      - Total Pembayaran
*  Tugas:
*      - Pengguna diberikan opsi untuk memilih metode pembayaran yang paling sesuai untuk mereka
*      - Nomor kartu kredit pengguna yang digunakan untuk melakukan pembayaran 
*      - Memperlihatkan kuantitas tiket yang telah dibeli pengguna
*      - Menampilkan jenis tiket yang dibeli oleh customer seperti reguler atau VIP
*      - Menampilkan harga tiket yang sudah dipilih sebelumnya
*      - Memperlihatkan nilai yang perlu dibayar oleh pengguna
*/

String metodePembayaran;
long noKartuKredit;
int jumlahTiket;
String jenisTiket;
double harga;
double totalPembayaran;

    public String getMetodePembayaran() {
        return this.metodePembayaran;
    }

    public void setMetodePembayaran(String metodePembayaran) {
        this.metodePembayaran = metodePembayaran;
    }

    public int getNoKartuKredit() {
        return this.noKartuKredit;
    }

    public void setNoKartuKredit(int noKartuKredit) {
        this.noKartuKredit = noKartuKredit;
    }

    public int getJumlahTiket() {
        return this.jumlahTiket;
    }

    public void setJumlahTiket(int jumlahTiket) {
        this.jumlahTiket = jumlahTiket;
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

    public double getTotalPembayaran() {
        return this.totalPembayaran;
    }

    public void setTotalPembayaran(double totalPembayaran) {
        this.totalPembayaran = totalPembayaran;
    }

    public pembayaran() {
    }

    public pembayaran(String metodePembayaran, int noKartuKredit, int jumlahTiket, String jenisTiket, double harga, double totalPembayaran) {
        this.metodePembayaran = metodePembayaran;
        this.noKartuKredit = noKartuKredit;
        this.jumlahTiket = jumlahTiket;
        this.jenisTiket = jenisTiket;
        this.harga = harga;
        this.totalPembayaran = totalPembayaran;
    }

    @Override
    public String toString() {
        return "{" +
            " metodePembayaran='" + getMetodePembayaran() + "'" +
            ", noKartuKredit='" + getNoKartuKredit() + "'" +
            ", jumlahTiket='" + getJumlahTiket() + "'" +
            ", jenisTiket='" + getJenisTiket() + "'" +
            ", harga='" + getHarga() + "'" +
            ", totalPembayaran='" + getTotalPembayaran() + "'" +
            "}";
    }

}



