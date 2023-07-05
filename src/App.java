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

        System.out.println("Masukkan ID Jadwal Konser : ");
        Integer idJadwalKonser = input.nextInt();
        Jadwalkonser jadwalKonser = getJadwalKonserById(idJadwalKonser);
        Scanner input = new Scanner(System.in);
        Integer idReservasi, jumlahTiket;
        System.out.println("Masukkan ID Reservasi : ");
        idReservasi = input.nextInt();

        System.out.println("Masukkan Jumlah Tiket : ");
        jumlahTiket = input.nextInt();
        
        if (jadwalKonser != null) {
            Reservasi tmpReservasi = new Reservasi<>(idReservasi, customer, jadwalKonser, null, jumlahTiket);
            reservasi.add(tmpReservasi);
            System.out.println("Reservasi berhasil ditambahkan!");
        } else {
            System.out.println("Jadwal konser tidak ditemukan.");
        }
    }

  public static void inputDataPembayaran() {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan ID Reservasi : ");
        Integer idReservasi = input.nextInt();
        Reservasi reservasiTerakhir = null;
        for (Reservasi r : reservasi) {
            if (r.getIdReservasi() == idReservasi) {
                reservasiTerakhir = r;
                break;
            }
        }

        if (reservasiTerakhir != null) {
            double totalPembayaran = reservasiTerakhir.getJumlahTiket() * reservasiTerakhir.getJadwalkonserr().getTiket().getHargaTiket();
            System.out.println("Total Pembayaran: " + totalPembayaran);

            System.out.println("Masukkan Metode Pembayaran : ");
            String metodePembayaran = input.next();

            Pembayaran pembayaran = new Pembayaran(reservasiTerakhir.getIdReservasi(), metodePembayaran, idReservasi, totalPembayaran, reservasiTerakhir);
            reservasiTerakhir.setPembayaran(pembayaran);

            System.out.println("Pembayaran berhasil ditambahkan!");
        }
    }
    public static void cetakTiket(Reservasi reservasi) {
        System.out.println("ID Tiket: " + reservasi.getTiket().getIdTiket());
        System.out.println("Jumlah Tiket: " + reservasi.getJumlahTiket());
        System.out.println("Harga Tiket: " + reservasi.getTiket().getHargaTiket());
        System.out.println("Tempat Duduk: " + reservasi.getTiket().getTempatDuduk());
     }

    public static void init() {
        initCustomer();
        initJadwalkonser();
    }

    public static void initCustomer() {
        Customer customer1 = new Customer(1, "John Doe", "john.doe@example.com");
        Customer customer2 = new Customer(2, "Jane Smith", "jane.smith@example.com");
        customer.add(customer1);
        customer.add(customer2);
    }

    public static void initJadwalkonser() {
        Tiket tiket1 = new Tiket(556431, "VIP", 99999.99, "setVIP15", null);
        Tiket tiket2 = new Tiket(556461, "VIP", 69999.99, "setReguler53", null);
        Tiket tiket3 = new Tiket(557541, "VIP", 69999.99, "setReguler34", null);

        Jadwalkonser konser1 = new Jadwalkonser(112, "STAR LIGHT", "ASTRO", "Indonesia Convention Exhibition (ICE)");
        konser1.setTiket(tiket1);
        Jadwalkonser konser2 = new Jadwalkonser(113, "BORN PINK", "BLACKPINK", "Gelora Bung Karno (GBK)");
        konser2.setTiket(tiket2);
        Jadwalkonser konser3 = new Jadwalkonser(114, "REVE FESTIVAL", "RED VELVED", "Jakarta Convention Center (JCC)");
        konser3.setTiket(tiket3);

        jadwalkonserList.add(konser1);
        jadwalkonserList.add(konser2);
        jadwalkonserList.add(konser3);
    }
}
