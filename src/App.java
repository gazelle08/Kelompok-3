import model.jadwalkonser;
import model.pembatalan;
import model.pembayaran;
import model.reservasi;
import model.tiket;

public class App {
    public static void main(String[] args) {
        init();
    }

    public static void init() {
        initJadwalKonser();
        initReservasi();
        initPembayaran();
        initPembatalan();
        initTiket();
    }
//init data jadwal konser
    public static void initJadwalKonser() {
        jadwalkonser konser1 = new jadwalkonser("STAR LIGHT", "ASTRO");
        jadwalkonser konser2 = new jadwalkonser("THE REVE FESTIVAL", "RED VELVET");
        jadwalkonser konser3 = new jadwalkonser("BORN PINK TOUR IN ASIA", "BLACKPINK");

        System.out.println("JADWAL KONSER YANG NGE-HITZ");
        System.out.println("1. Nama Konser: " + konser1.getNamaKonser());
        System.out.println("   Nama Artis: " + konser1.getNamaArtis());
        System.out.println("2. Nama Konser: " + konser2.getNamaKonser());
        System.out.println("   Nama Artis: " + konser2.getNamaArtis());
        System.out.println("3. Nama Konser: " + konser3.getNamaKonser());
        System.out.println("   Nama Artis: " + konser3.getNamaArtis());
    }
//init data reservasi
    public static void initReservasi() {
        reservasi dataReservasi1 = new reservasi();

        dataReservasi1.setDaftarKonser("Konser A");
        dataReservasi1.setJenisTiket("Tiket Reguler");
        dataReservasi1.setHargaTiket(100000.0);
        dataReservasi1.setJumlahTiketTersedia(100);
        dataReservasi1.setTempatKonser("Venue X");
        dataReservasi1.setDaftarTempatDuduk("A1, A2, A3, B1, B2, B3");
        dataReservasi1.setTipeTempatDuduk("VIP");

        System.out.println();
        System.out.println("Data Reservasi:");
        System.out.println(dataReservasi1.toString());

        reservasi dataReservasi2 = new reservasi("BORN PINK WORLD TOUR ASIA", "Tiket VIP", 5000000.0, 10, "GBK", "VIP1", "VIP");
        cetakReservasi(dataReservasi2);

        reservasi dataReservasi3 = new reservasi("STAR LIGHT", "Tiket Reguler", 300000.0, 40, "Venue 1", "R61", "Regular");
        cetakReservasi(dataReservasi3);

        reservasi dataReservasi4 = new reservasi("THE REVE FESTIVAL", "Tiket Reguler", 7000000.0, 45, "GBK", "R33", "Regular");
        cetakReservasi(dataReservasi4);
    }

    public static void cetakReservasi(reservasi dataReservasi) {
        System.out.println("Data Reservasi:");
        System.out.println("Daftar Konser: " + dataReservasi.getDaftarKonser());
        System.out.println("Harga Tiket: " + dataReservasi.getHargaTiket());
    }
//init data pembayaran
    public static void initPembayaran() {
        pembayaran dataPembayaran = new pembayaran();

        dataPembayaran.setMetodePembayaran("Kartu Kredit");
        dataPembayaran.setNoKartuKredit(44443333);
        dataPembayaran.setJumlahTiket(1);
        dataPembayaran.setJenisTiket("Tiket Reguler");
        dataPembayaran.setHarga(100000.0);
        dataPembayaran.setTotalPembayaran(100000.0);

        System.out.println();
        System.out.println("Data Pembayaran: ");
        System.out.println(dataPembayaran.toString());

        pembayaran dataPembayaran2 = new pembayaran("Visa", 11223344, 2, "Tiket VIP", 5000000.0, 10000000.0);
        cetakPembayaran(dataPembayaran2);

        pembayaran dataPembayaran3 = new pembayaran("Mastercard", 99887766, 3, "Tiket Reguler", 300000.0, 900000.0);
        cetakPembayaran(dataPembayaran3);

        pembayaran dataPembayaran4 = new pembayaran("American Express", 66226633, 4, "Tiket Reguler", 7000000.0, 28000000.0);
        cetakPembayaran(dataPembayaran4);
    }

    public static void cetakPembayaran(pembayaran dataPembayaran) {
        System.out.println("Data Pembayaran");
        System.out.println("Jenis Tiket: " + dataPembayaran.getJenisTiket());
        System.out.println("Total Pembayaran: " + dataPembayaran.getTotalPembayaran());
    }
//init data pembatalan
    public static void initPembatalan() {
    pembatalan dataPembatalan = new pembatalan();

    dataPembatalan.setNoReferensiTiket(1);
    dataPembatalan.setPengembalianUang(100000.0);

    System.out.println();
    System.out.println("Data Pembatalan: ");
    System.out.println(dataPembatalan.toString());

    pembatalan dataPembatalan2 = new pembatalan(2, 10000000.0);
    cetakPembatalan(dataPembatalan2);

    pembatalan dataPembatalan3 = new pembatalan(3, 900000.0);
    cetakPembatalan(dataPembatalan3);

    pembatalan dataPembatalan4 = new pembatalan(4, 28000000.0);
    cetakPembatalan(dataPembatalan4);
}

public static void cetakPembatalan(pembatalan dataPembatalan) {
    System.out.println("Data Pembatalan");
    System.out.println("No Referensi Tiket: " + dataPembatalan.getNoReferensiTiket());
    System.out.println("Pengembalian Uang: " + dataPembatalan.getPengembalianUang());
}
//init tiket
public static void initTiket() {
    tiket dataTiket1 = new tiket();
    dataTiket1.setDaftarKonser("BORN PINK TOUR IN ASIA");
    dataTiket1.setJenisTiket("Tiket VIP");
    dataTiket1.setHarga(5000000.0);
    dataTiket1.setTempatKonser("GBK");
    dataTiket1.setTipeTempatDuduk("VIP");

    tiket dataTiket2 = new tiket("STAR LIGHT", "Tiket Reguler", 300000.0, "Venue 1", "Regular");

    tiket dataTiket3 = new tiket();
    dataTiket3.setDaftarKonser("THE REVE FESTIVAL");
    dataTiket3.setJenisTiket("Tiket Reguler");
    dataTiket3.setHarga(7000000.0);
    dataTiket3.setTempatKonser("GBK");
    dataTiket3.setTipeTempatDuduk("Regular");

    System.out.println();
    System.out.println("Data Tiket:");
    System.out.println(dataTiket1.toString());
    System.out.println(dataTiket2.toString());
    System.out.println(dataTiket3.toString());
}

}