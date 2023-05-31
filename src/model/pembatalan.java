/*
 * Nama: Elaine Agustina
 */
package model;

public class pembatalan {
/*
 * Deskripsi:
 *  Atribut:
 *      - Nomor Referensi tiket
 *      - Pengembalian uang
 *  Tugas
 *      - Pengguna memasukkan nomor referensi atau tiket yang ingin dibatalkan
 *      - Jumlah uang yang dikembalikan ke pengguna setelah pembatalan
 */

int noReferensiTiket;
double pengembalianUang;

    public int getNoReferensiTiket() {
        return this.noReferensiTiket;
    }

    public void setNoReferensiTiket(int noReferensiTiket) {
        this.noReferensiTiket = noReferensiTiket;
    }

    public double getPengembalianUang() {
        return this.pengembalianUang;
    }

    public void setPengembalianUang(double pengembalianUang) {
        this.pengembalianUang = pengembalianUang;
    }
}
