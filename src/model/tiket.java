/*
 * Nama: Jerry Robert
 */
package model;

public class Tiket {
    private Integer idTiket;
    private String jenisTiket;
    private Double hargaTiket;
    private String tempatDuduk;
    private Reservasi reservasii;


    public Tiket() {
    }

    public Tiket(Integer idTiket, String jenisTiket, Double hargaTiket, String tempatDuduk, Reservasi reservasii) {
        this.idTiket = idTiket;
        this.jenisTiket = jenisTiket;
        this.hargaTiket = hargaTiket;
        this.tempatDuduk = tempatDuduk;
        this.reservasii = reservasii;
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

    public Double getHargaTiket() {
        return this.hargaTiket;
    }

    public void setHargaTiket(Double hargaTiket) {
        this.hargaTiket = hargaTiket;
    }

    public String getTempatDuduk() {
        return this.tempatDuduk;
    }

    public void setTempatDuduk(String tempatDuduk) {
        this.tempatDuduk = tempatDuduk;
    }

    public Reservasi getReservasii() {
        return this.reservasii;
    }

    public void setReservasii(Reservasi reservasii) {
        this.reservasii = reservasii;
    }

    @Override
    public String toString() {
        return "{" +
            " idTiket='" + getIdTiket() + "'" +
            ", jenisTiket='" + getJenisTiket() + "'" +
            ", hargaTiket='" + getHargaTiket() + "'" +
            ", tempatDuduk='" + getTempatDuduk() + "'" +
            ", reservasii='" + getReservasii() + "'" +
            "}";
    }

}
