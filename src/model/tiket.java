/*
 * Nama: Jerry Robert
 */
package model;

public class tiket {

Integer idTiket;
String jenisTiket;
String hargaTiket;
String tempatDuduk;
String dataReservasi;


    public tiket() {
    }

    public tiket(Integer idTiket, String jenisTiket, String hargaTiket, String tempatDuduk, String dataReservasi) {
        this.idTiket = idTiket;
        this.jenisTiket = jenisTiket;
        this.hargaTiket = hargaTiket;
        this.tempatDuduk = tempatDuduk;
        this.dataReservasi = dataReservasi;
    }

    public Integer getIdTiket() {
        return this.idTiket;
    }

    public void setIdTiket(Integer idTiket) {
        this.idTiket = idTiket;
    }

    public String getJenisTiket() {
        return this.jenisTiket;
    }

    public void setJenisTiket(String jenisTiket) {
        this.jenisTiket = jenisTiket;
    }

    public String getHargaTiket() {
        return this.hargaTiket;
    }

    public void setHargaTiket(String hargaTiket) {
        this.hargaTiket = hargaTiket;
    }

    public String getTempatDuduk() {
        return this.tempatDuduk;
    }

    public void setTempatDuduk(String tempatDuduk) {
        this.tempatDuduk = tempatDuduk;
    }

    public String getDataReservasi() {
        return this.dataReservasi;
    }

    public void setDataReservasi(String dataReservasi) {
        this.dataReservasi = dataReservasi;
    }


}
