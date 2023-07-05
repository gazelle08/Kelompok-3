package model;

public class Customer {
    private Integer idCustomer;
    private String nama;
    private String alamatEmail;
  

    public Customer() {
    }

    public Customer(Integer idCustomer, String nama, String alamatEmail) {
        this.idCustomer = idCustomer;
        this.nama = nama;
        this.alamatEmail = alamatEmail;
    }

    public Integer getIdCostumer() {
        return this.idCustomer;
    }

    public void setIdCostumer(Integer idCustomer) {
        this.idCustomer = idCustomer;
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
            " idCustomer='" + getIdCustomer() + "'" +
            ", nama='" + getNama() + "'" +
            ", alamatEmail='" + getAlamatEmail() + "'" +
            "}";
    }

    public String getIdCustomer() {
        return null;
    }

    public int size() {
        return 0;
    }

    public Customer get(int i) {
        return null;
    }
    
}
