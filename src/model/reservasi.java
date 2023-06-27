/*
* Nama:Adelia Tabita Sihotang 
*/

package model;

public class reservasi {

String costumer;
 String daftarKonser;
 String jenisTiket;
 String hargaTiket;


    public reservasi() {
    }
    

    public String getCostumer() {
        return this.costumer;
    }

    public void setCostumer(String costumer) {
        this.costumer = costumer;
    }

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

    public String getHargaTiket() {
        return this.hargaTiket;
    }

    public void setHargaTiket(String hargaTiket) {
        this.hargaTiket = hargaTiket;
    }



    public reservasi(String costumer, String daftarKonser, String jenisTiket, String hargaTiket) {
        this.costumer = costumer;
        this.daftarKonser = daftarKonser;
        this.jenisTiket = jenisTiket;
        this.hargaTiket = hargaTiket;
    }


    @Override
    public String toString() {
        return "{" +
            " costumer='" + getCostumer() + "'" +
            ", daftarKonser='" + getDaftarKonser() + "'" +
            ", jenisTiket='" + getJenisTiket() + "'" +
            ", hargaTiket='" + getHargaTiket() + "'" +
            "}";
    }
}


