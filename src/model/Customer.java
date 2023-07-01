package model;

public class Customer {
    private Integer idCostumer;
    private String nama;
    private String alamatEmail;
  

    public Customer() {
    }

    public Customer(Integer idCostumer, String nama, String alamatEmail) {
        this.idCostumer = idCostumer;
        this.nama = nama;
        this.alamatEmail = alamatEmail;
    }

    public Integer getIdCostumer() {
        return this.idCostumer;
    }

    public void setIdCostumer(Integer idCostumer) {
        this.idCostumer = idCostumer;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamatEmail() {
        return this.alamatEmail;
    }

    public void setAlamatEmail(String alamatEmail) {
        this.alamatEmail = alamatEmail;
    }

    @Override
    public String toString() {
        return "{" +
            " idCostumer='" + getIdCostumer() + "'" +
            ", nama='" + getNama() + "'" +
            ", alamatEmail='" + getAlamatEmail() + "'" +
            "}";
    }
    
}
