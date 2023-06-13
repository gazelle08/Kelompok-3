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
            System.out.println("2. Reservasi");
            System.out.println("3. Pembayaran");
            System.out.println("4. Pembatalan");
            System.out.println("5. Tiket");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Membersihkan karakter newline

            switch (choice) {
                case 1:
                    initJadwalKonser();
                    break;
                case 2:
                    initReservasi();
                    break;
                case 3:
                    initPembayaran();
                    break;
                case 4:
                    initPembatalan();
                    break;
                case 5:
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
    //input reservasi
     System.out.println("Reservasi");

        System.out.print("Masukkan nama konser yang ingin kamu ikuti: ");
        String daftarKonser = scanner.nextLine();

        System.out.print("Masukkan Jenis Tiket: ");
        String jenisTiket = scanner.nextLine();

        System.out.print("Masukkan Harga Tiket: ");
        double hargaTiket = scanner.nextDouble();

        System.out.print("Masukkan Jumlah Tiket Tersedia: ");
        int jumlahTiketTersedia = scanner.nextInt();
        scanner.nextLine(); // Membersihkan karakter newline

        System.out.print("Masukkan Tempat Konser: ");
        String tempatKonser = scanner.nextLine();

        System.out.print("Masukkan Daftar Tempat Duduk: ");
        String daftarTempatDuduk = scanner.nextLine();

        System.out.print("Masukkan Tipe Tempat Duduk: ");
        String tipeTempatDuduk = scanner.nextLine();

        reservasi dataReservasi = new reservasi(daftarKonser, jenisTiket, hargaTiket, jumlahTiketTersedia, tempatKonser, daftarTempatDuduk, tipeTempatDuduk);

        System.out.println("Data Reservasi:");
        System.out.println(dataReservasi.toString());
    }


    public static void cetakReservasi(reservasi dataReservasi) {
        System.out.println("Data Reservasi:");
        System.out.println("Daftar Konser: " + dataReservasi.getDaftarKonser());
        System.out.println("Harga Tiket: " + dataReservasi.getHargaTiket());
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

    // Input pembayaran
    System.out.println("Pembayaran");

    System.out.print("Masukkan Metode Pembayaran: ");
    String metodePembayaran = scanner.nextLine();

    System.out.print("Masukkan Nominal Pembayaran: ");
    double nominalPembayaran = scanner.nextDouble();
    scanner.nextLine(); // Membersihkan karakter newline

    // Tanggal pembayaran diatur secara otomatis
    LocalDate tanggalPembayaran = LocalDate.now();

    pembayaran dataPembayaran = new pembayaran(metodePembayaran, nominalPembayaran, tanggalPembayaran);

    System.out.println("Data Pembayaran:");
    System.out.println(dataPembayaran.toString());
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
//input pembatalan
        System.out.println(" Pembatalan");

        System.out.print("Masukkan Alasan Pembatalan: ");
        String alasanPembatalan = scanner.nextLine();

        System.out.print("Masukkan Tanggal Pembatalan: ");
        String tanggalPembatalan = scanner.nextLine();

        System.out.println("Data Pembatalan:");
        System.out.println(dataPembatalan.toString());
    }

//init tiket
public static void initTiket() {
    tiket dataTiket1 = new tiket();
    dataTiket1.setDaftarKonser("BORN PINK TOUR IN ASIA");
    dataTiket1.setJenisTiket("Tiket VIP");
    dataTiket1.setHarga(5000000.0);
    dataTiket1.setTempatKonser("GBK");
    dataTiket1.setTipeTempatDuduk("VIP");

    System.out.println();
    System.out.println("Data Tiket 1:");
    System.out.println(dataTiket1.toString());

    tiket dataTiket2 = new tiket();
    dataTiket2.setDaftarKonser("THE REVE FESTIVAL");
    dataTiket2.setJenisTiket("Tiket Reguler");
    dataTiket2.setHarga(7000000.0);
    dataTiket2.setTempatKonser("GBK");
    dataTiket2.setTipeTempatDuduk("Regular");

    System.out.println();
    System.out.println("Data Tiket 2:");
    System.out.println(dataTiket2.toString());
}
}