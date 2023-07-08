import model.Jadwalkonser;
import model.Pembayaran;
import model.Reservasi;
import model.Tiket;
import model.Customer;
import java.util.Scanner;
import java.util.ArrayList;

public class App {
    static ArrayList<Reservasi> reservasi = new ArrayList<Reservasi>();
    static ArrayList<Customer> customer = new ArrayList<Customer>();
    static ArrayList<Jadwalkonser> jadwalkonserList = new ArrayList<Jadwalkonser>();

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        init();
        inputDataCustomer();
        showJadwalkonser();
        inputDataReservasi();
        inputDataPembayaran();
    }

    public static void inputDataCustomer() {
        Scanner input = new Scanner(System.in);
        Integer idCustomer;
        String nama, alamatEmail;
        System.out.println("Masukkan ID Customer : ");
        idCustomer = input.nextInt();
        input.nextLine();
        System.out.println("Masukkan Nama : ");
        nama = input.nextLine();
        System.out.println("Masukkan Alamat Email : ");
        alamatEmail = input.nextLine();

        Customer tmpCustomer = new Customer(idCustomer, nama, alamatEmail);
        customer.add(tmpCustomer);
    }

    public static void showJadwalkonser() {
        System.out.println("Daftar Jadwal Konser:");
        for (Jadwalkonser j : jadwalkonserList) {
            cetakJadwalkonser(j);
        }
        System.out.println();
    }

    public static void cetakJadwalkonser(Jadwalkonser x) {
        System.out.println(x.getIdJadwalKonser() + " " + x.getNamaKonser() + " " + x.getNamaArtis() + " " + x.getTempatKonser());
    }

    public static Jadwalkonser getJadwalKonserById(Integer id) {
        for (Jadwalkonser j : jadwalkonserList) {
            if (j.getIdJadwalKonser() == id) {
                return j;
            }
        }
        return null;
    }

    public static void inputDataReservasi() {
        // Menampilkan daftar jadwal konser
        int idReservasiTerakhir = 11240;
        System.out.println("Masukkan ID Jadwal Konser yang akan Anda ikuti : ");
        Integer idJadwalKonser = input.nextInt();
        Jadwalkonser jadwalKonser = getJadwalKonserById(idJadwalKonser);
        String jenisTiket = null;

        if (jadwalKonser != null) {
            System.out.println("Pilih Jenis Tiket (1: VIP, 2: Regular): ");
            int jenisTiketChoice = input.nextInt();
            input.nextLine();

            if (jenisTiketChoice == 1) {
                jenisTiket = "VIP";
            } else if (jenisTiketChoice == 2) {
                jenisTiket = "Regular";
            } else {
                System.out.println("Pilihan Jenis Tiket tidak valid.");
                return;
            }

            Integer jumlahTiket;
            System.out.println("Masukkan Jumlah Tiket : ");
            jumlahTiket = input.nextInt();
            input.nextLine();

            // Menghasilkan ID Reservasi baru
            int idReservasiBaru = idReservasiTerakhir + 1;

            Tiket tiket = new Tiket(); // Inisialisasi objek Tiket
            // Tentukan objek Tiket berdasarkan jenis tiket
            if (jenisTiket.equals("VIP")) {
                tiket = new Tiket(12345, "VIP", 750000.0, "setVIP15", null, jadwalKonser);
            } else if (jenisTiket.equals("Regular")) {
                tiket = new Tiket(67890, "Regular", 450000.0, "setReguler53", null, jadwalKonser);
            }

            Reservasi tmpReservasi = new Reservasi(idReservasiBaru, customer, jadwalKonser, tiket, jumlahTiket);
            reservasi.add(tmpReservasi);

            // Memperbarui ID Reservasi terakhir yang digunakan
            idReservasiTerakhir = idReservasiBaru;

            System.out.println("Reservasi berhasil ditambahkan! ID Reservasi: " + idReservasiBaru);
            
            // Cetak tiket
            System.out.println("Cetak Tiket? (ya/tidak): ");
            String cetakTiketChoice = input.nextLine();
            
            if (cetakTiketChoice.equalsIgnoreCase("ya")) {
                cetakTiket(tiket);
            }
        } else {
            System.out.println("Jadwal konser tidak ditemukan.");
        }
    }

    public static void inputDataPembayaran() {
        System.out.println();
        System.out.println("Data Pembayaran Tiket Anda");
        System.out.println("Masukkan ID Reservasi : ");
        Integer idReservasi = input.nextInt();
        input.nextLine();

        Reservasi reservasiTerpilih = null;
        for (Reservasi r : reservasi) {
            if (r.getIdReservasi().equals(idReservasi)) {
                reservasiTerpilih = r;
                break;
            }
        }

        if (reservasiTerpilih != null) {
            double totalPembayaran = reservasiTerpilih.getJumlahTiket() * reservasiTerpilih.getJadwalkonserr().getTiket().getHargaTiket();
            System.out.println("Total Pembayaran: " + totalPembayaran);

            System.out.println("Masukkan Metode Pembayaran : ");
            String metodePembayaran = input.nextLine();

            Pembayaran pembayaran = new Pembayaran(reservasiTerpilih.getIdReservasi(), metodePembayaran, idReservasi, totalPembayaran, reservasiTerpilih);
            reservasiTerpilih.setPembayaran(pembayaran);

            System.out.println("Pembayaran berhasil ditambahkan!");

            // Menampilkan data reservasi
            System.out.println("Data Reservasi:");
            System.out.println("ID Reservasi: " + reservasiTerpilih.getIdReservasi());
            System.out.println("Customer: " + reservasiTerpilih.getCustomer());
            System.out.println("Jadwal Konser: " + reservasiTerpilih.getJadwalkonserr().getNamaKonser());
            System.out.println("Jumlah Tiket: " + reservasiTerpilih.getJumlahTiket());
            System.out.println("Harga Tiket: " + reservasiTerpilih.getJadwalkonserr().getTiket().getHargaTiket());
            System.out.println("Tempat Duduk: " + reservasiTerpilih.getJadwalkonserr().getTiket().getTempatDuduk());
        } else {
            System.out.println("Reservasi dengan ID tersebut tidak ditemukan.");
        }
    }
    
    public static void init() {
        initJadwalkonser();
    }

    public static void initJadwalkonser() {
        Tiket tiket1 = new Tiket(556431, "VIP", 750000.00, "setVIP15", null, null);
        Tiket tiket2 = new Tiket(556461, "Reguler", 450000.00, "setReguler53", null, null);
        Tiket tiket3 = new Tiket(557541, "Reguler", 450000.00, "setReguler34", null, null);
    
        Jadwalkonser konser1 = new Jadwalkonser(112, "STAR LIGHT", "ASTRO", "Indonesia Convention Exhibition (ICE)");
        konser1.setTiket(tiket1);
        Jadwalkonser konser2 = new Jadwalkonser(113, "BORN PINK", "BLACKPINK", "Gelora Bung Karno (GBK)");
        konser2.setTiket(tiket2);
        Jadwalkonser konser3 = new Jadwalkonser(114, "REVE FESTIVAL", "RED VELVET", "Jakarta Convention Center (JCC)");
        konser3.setTiket(tiket3);
    
        jadwalkonserList.add(konser1);
        jadwalkonserList.add(konser2);
        jadwalkonserList.add(konser3);
    }    
    public static void showTiket() {
        System.out.println("Daftar Tiket:");
        for (Jadwalkonser j : jadwalkonserList) {
            if (j.getTiket() != null) {
                cetakTiket(j.getTiket());
            }
        }
        System.out.println();
    }
    
    public static void cetakTiket(Tiket tiket) {
        System.out.println("ID Tiket: " + tiket.getIdTiket());
        System.out.println("Jenis Tiket: " + tiket.getJenisTiket());
        System.out.println("Harga Tiket: " + tiket.getHargaTiket());
        System.out.println("Tempat Duduk: " + tiket.getTempatDuduk());
        sts
        System.out.println("===================================");
    }
}