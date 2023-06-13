import model.jadwalkonser;
import model.pembatalan;
import model.pembayaran;
import model.reservasi;
import model.tiket;

import java.time.LocalDate;
import java.util.Scanner;

public class App {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        init();
    }

    public static void init() {
        initJadwalKonser();
        initReservasi();
        initPembayaran();
        initPembatalan();
        initTiket();
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Jadwal Konser");
            System.out.println("2. Input Reservasi");
            System.out.println("3. Data Reservasi");
            System.out.println("4. Input Pembayaran");
            System.out.println("5. Data Pembayaran");
            System.out.println("6. Input Pembatalan");
            System.out.println("7. Data Pembatalan");
            System.out.println("8. Tiket");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    initJadwalKonser();
                    break;
                case 2:
                    inputDataReservasi();
                case 3:
                    initReservasi();
                    break;
                case 4:
                    inputPembayaran();
                    break;
                case 5:
                    initPembayaran();
                    break;
                case 6:
                    inputPembatalan();
                    break;
                case 7:
                    initPembatalan();
                    break;
                case 8:
                    initTiket();
                    break;
                case 0:
                    System.out.println("Terima kasih. Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
            System.out.println();
        } while (choice != 0);
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
    //input reservasi
    public static void cetakReservasi(reservasi dataReservasi) {
    System.out.println("Data Reservasi:");
    System.out.println("Daftar Konser: " + dataReservasi.getDaftarKonser());
    System.out.println("Jenis Tiket: " + dataReservasi.getJenisTiket());
    System.out.println("Harga Tiket: " + dataReservasi.getHargaTiket());
    System.out.println("Jumlah Tiket Tersedia: " + dataReservasi.getJumlahTiketTersedia());
    System.out.println("Tempat Konser: " + dataReservasi.getTempatKonser());
    System.out.println("Daftar Tempat Duduk: " + dataReservasi.getDaftarTempatDuduk());
    System.out.println("Tipe Tempat Duduk: " + dataReservasi.getTipeTempatDuduk());
}

// Masukkan input dari pengguna untuk Reservasi
public static reservasi inputDataReservasi() {
    System.out.println("Reservasi");

    System.out.print("Masukkan nama konser yang ingin kamu ikuti: ");
    String daftarKonser = scanner.nextLine();

    System.out.print("Masukkan Jenis Tiket: ");
    String jenisTiket = scanner.nextLine();

    // Mengambil atribut lainnya dari data yang telah diinisialisasi sebelumnya
    double hargaTiket = 500000;
    int jumlahTiketTersedia = 45;
    String tempatKonser = "GBK";
    String daftarTempatDuduk = "VIP1";
    String tipeTempatDuduk = "VIP";

    // Memeriksa data reservasi yang cocok berdasarkan nama konser dan jenis tiket
    if (daftarKonser.equalsIgnoreCase("Konser A") && jenisTiket.equalsIgnoreCase("Tiket Reguler")) {
        hargaTiket = 100000.0;
        jumlahTiketTersedia = 100;
        tempatKonser = "Venue X";
        daftarTempatDuduk = "A1, A2, A3, B1, B2, B3";
        tipeTempatDuduk = "VIP";
    } else if (daftarKonser.equalsIgnoreCase("BORN PINK WORLD TOUR ASIA") && jenisTiket.equalsIgnoreCase("Tiket VIP")) {
        hargaTiket = 5000000.0;
        jumlahTiketTersedia = 10;
        tempatKonser = "GBK";
        daftarTempatDuduk = "VIP1";
        tipeTempatDuduk = "VIP";
    } else if (daftarKonser.equalsIgnoreCase("STAR LIGHT") && jenisTiket.equalsIgnoreCase("Tiket Reguler")) {
        hargaTiket = 300000.0;
        jumlahTiketTersedia = 40;
        tempatKonser = "Venue 1";
        daftarTempatDuduk = "R61";
        tipeTempatDuduk = "Regular";
    } else if (daftarKonser.equalsIgnoreCase("THE REVE FESTIVAL") && jenisTiket.equalsIgnoreCase("Tiket Reguler")) {
        hargaTiket = 7000000.0;
        jumlahTiketTersedia = 45;
        tempatKonser = "GBK";
        daftarTempatDuduk = "R33";
        tipeTempatDuduk = "Regular";
    }

    // Inisialisasi objek reservasi dengan nilai yang diberikan oleh pengguna
    reservasi dataReservasi = new reservasi(daftarKonser, jenisTiket, hargaTiket, jumlahTiketTersedia, tempatKonser, daftarTempatDuduk, tipeTempatDuduk);

    System.out.println("Data Reservasi:");
    System.out.println(dataReservasi.toString());

    return dataReservasi;
}
//init data pembayaran
    public static void initPembayaran() {
    // Inisialisasi data pembayaran yang sudah ada sebelumnya
    pembayaran dataPembayaran1 = new pembayaran("Kartu Kredit", 44443333, 1, "Tiket Reguler", 100000.0, 100000.0);
    cetakPembayaran(dataPembayaran1);

    pembayaran dataPembayaran2 = new pembayaran("Visa", 11223344, 2, "Tiket VIP", 5000000.0, 10000000.0);
    cetakPembayaran(dataPembayaran2);

    pembayaran dataPembayaran3 = new pembayaran("Mastercard", 99887766, 3, "Tiket Reguler", 300000.0, 900000.0);
    cetakPembayaran(dataPembayaran3);

    pembayaran dataPembayaran4 = new pembayaran("American Express", 66226633, 4, "Tiket Reguler", 7000000.0, 28000000.0);
    cetakPembayaran(dataPembayaran4);
    }
    private static void cetakPembayaran(pembayaran dataPembayaran1) {
    }

// Input pembayaran
public static pembayaran inputPembayaran() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pembayaran");

        System.out.print("Masukkan Metode Pembayaran: ");
        String metodePembayaran = scanner.nextLine();

        System.out.print("Masukkan Nomor Kartu Kredit: ");
        int noKartuKredit = scanner.nextInt();

        System.out.print("Masukkan Jumlah Tiket: ");
        int jumlahTiket = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Masukkan Jenis Tiket: ");
        String jenisTiket = scanner.nextLine();

        pembayaran pembayaran = new pembayaran(metodePembayaran, noKartuKredit, jumlahTiket, jenisTiket, 0.0, 0.0);
        return pembayaran;
    }

//init data pembatalan
        public static void initPembatalan() {
        pembatalan dataPembatalan = new pembatalan();

        dataPembatalan.setNoReferensiTiket(1);
        dataPembatalan.setPengembalianUang(100000.0);

        System.out.println("Data Pembatalan:");
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
//input data pembatalan
    public static void inputPembatalan() {
        System.out.println("Pembatalan");

        System.out.print("Masukkan Alasan Pembatalan: ");
        String alasanPembatalan = scanner.nextLine();

        // Nomor referensi tiket diatur secara otomatis
        int noReferensiTiket = 5;
        // Tanggal pembatalan diatur secara otomatis
        LocalDate tanggalPembatalan = LocalDate.now();

        pembatalan dataPembatalan = new pembatalan(noReferensiTiket, alasanPembatalan);
        
        System.out.println("Data Pembatalan:");
        System.out.println(dataPembatalan.toString());
    }

public static void initTiket() {
    int nomorReservasi = 23912;
    String namaKonser = "BORN PINK TOUR IN ASIA";
    String jenisTiket = "Tiket VIP";
    double hargaTiket = 5000000.0;
    String tempatKonser = "GBK";
    String tipeTiket = "VIP";

    tiket dataTiket = new tiket();
    dataTiket.setNoPemesanan(nomorReservasi);
    dataTiket.setDaftarKonser(namaKonser);
    dataTiket.setJenisTiket(tipeTiket);
    dataTiket.setHarga(hargaTiket);
    dataTiket.setTempatKonser(tempatKonser);
    dataTiket.setTipeTempatDuduk(tipeTiket);

    System.out.println("Data Tiket:");
    System.out.println(dataTiket.toString());
}
}
