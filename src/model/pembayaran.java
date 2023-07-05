/*
 * Nama: Elaine Agustina
 */     
package model;

public class Pembayaran {
    private Integer idPembayaran;
    private String metodePembayaran;
    private Integer noKartu;
    private Double totalPembayaran;
    private Reservasi dataReservasi;

    public Pembayaran() {
    }

    public Pembayaran(Integer idPembayaran, String metodePembayaran, Integer noKartu2, Double totalPembayaran, Reservasi dataReservasi) {
        this.idPembayaran = idPembayaran;
        this.metodePembayaran = metodePembayaran;
        this.noKartu = noKartu;
        this.totalPembayaran = totalPembayaran;
        this.dataReservasi = dataReservasi;
    }

    public Integer getIdPembayaran() {
        return idPembayaran;
    }

    public void setIdPembayaran(Integer idPembayaran) {
        this.idPembayaran = idPembayaran;
    }

    public String getMetodePembayaran() {
        return metodePembayaran;
    }

    public void setMetodePembayaran(String metodePembayaran) {
        this.metodePembayaran = metodePembayaran;
    }

    public Integer getNoKartu() {
        return noKartu;
    }

    public void setNoKartu(Integer noKartu) {
        this.noKartu = noKartu;
    }

    public Double getTotalPembayaran() {
        return totalPembayaran;
    }

    public void setTotalPembayaran(Double totalPembayaran) {
        this.totalPembayaran = totalPembayaran;
    }

    public Reservasi getDataReservasi() {
        return dataReservasi;
    }

    public void setDataReservasi(Reservasi dataReservasi) {
        this.dataReservasi = dataReservasi;
    }    

    @Override
    public String toString() {
        return "Pembayaran{" +
            "idPembayaran='" + idPembayaran + '\'' +
            ", metodePembayaran='" + metodePembayaran + '\'' +
            ", noKartu='" + noKartu + '\'' +
            ", totalPembayaran='" + totalPembayaran + '\'' +
            ", dataReservasi='" + dataReservasi + '\'' +
            '}';
    }
}
