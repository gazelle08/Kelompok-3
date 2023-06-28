/*
 * Nama: Vanessa Thames
 */
package model;

public class jadwalkonser {

Integer idJadwalKonser;
String namaKonser;
String namaArtis;
String tempatKonser;


public jadwalkonser() {
    }

    public jadwalkonser(Integer idJadwalKonser, String namaKonser, String namaArtis, String tempatKonser) {
        this.idJadwalKonser = idJadwalKonser;
        this.namaKonser = namaKonser;
        this.namaArtis = namaArtis;
        this.tempatKonser = tempatKonser;
    }

    public Integer getIdJadwalKonser() {
        return this.idJadwalKonser;
    }

    public void setIdJadwalKonser(Integer idJadwalKonser) {
        this.idJadwalKonser = idJadwalKonser;
    }

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

    public String getTempatKonser() {
        return this.tempatKonser;
    }

    public void setTempatKonser(String tempatKonser) {
        this.tempatKonser = tempatKonser;
    }

    @Override
    public String toString() {
        return "{" +
            " idJadwalKonser='" + getIdJadwalKonser() + "'" +
            ", namaKonser='" + getNamaKonser() + "'" +
            ", namaArtis='" + getNamaArtis() + "'" +
            ", tempatKonser='" + getTempatKonser() + "'" +
            "}";
    }

}
