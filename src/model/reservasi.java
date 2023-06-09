/*
* Nama:Adelia Tabita Sihotang 
*/

package model;

import java.util.ArrayList;


public class Reservasi<Private> {

    private Integer idReservasi;
    private Integer jumlahTiket;
    private Customer customers;
    private Jadwalkonser jadwalkonserr;
    private Tiket tiket;
    private ArrayList<Customer> customer = 
        new ArrayList<Customer>();


public Reservasi(Integer idReservasi, ArrayList<Customer> customer, Jadwalkonser jadwalKonser, Tiket tiket, Integer jumlahTiket) {
        this.idReservasi = idReservasi;
        this.customer = customer;
        this.jadwalkonserr = jadwalKonser;
        this.tiket = tiket;
        this.jumlahTiket = jumlahTiket;
    }
    public Reservasi(Integer idReservasi2, Jadwalkonser jadwalKonser, Object object, Object object2, ArrayList<Customer> customer2, Integer jumlahTiket2) {
    }


    public Reservasi(Integer idReservasi2, Jadwalkonser jadwalKonser, Object jadwalkonserr2, Object tiket2,
            Customer customer2, Integer jumlahTiket2) {
    }
    
    public Integer getIdReservasi() {
        return this.idReservasi;
    }

    public void setIdReservasi(Integer idReservasi) {
        this.idReservasi = idReservasi;
    }

    public Customer getCustomers() {
        return this.customers;
    }

    public void setCustomers(Customer customers) {
        this.customers = customers;
    }

    public Jadwalkonser getJadwalkonserr() {
        return this.jadwalkonserr;
    }

    public void setJadwalkonserr(Jadwalkonser jadwalkonserr) {
        this.jadwalkonserr = jadwalkonserr;
    }

    public Tiket getTiket() {
        return this.tiket;
    }

    public void setTiket(Tiket tiket) {
        this.tiket = tiket;
    }

    public ArrayList<Customer> getCustomer() {
        return this.customer;
    }

    public void setCustomer(ArrayList<Customer> customer) {
        this.customer = customer;
    }

    public Integer getJumlahTiket() {
        return this.jumlahTiket;
    }

    public void setJumlahTiket(Integer jumlahTiket) {
        this.jumlahTiket = jumlahTiket;
    }

    @Override
    public String toString() {
        return "{" +
            " idReservasi='" + getIdReservasi() + "'" +
            ", customers='" + getCustomers() + "'" +
            ", jadwalkonserr='" + getJadwalkonserr() + "'" +
            ", tiket='" + getTiket() + "'" +
            ", customer='" + getCustomer() + "'" +
            ", jumlahTiket='" + getJumlahTiket() + "'" +
            "}";
    }
    public void setPembayaran(Pembayaran tmpPembayaran) {
    }


}


