import model.Jadwalkonser;
import model.pembayaran;
import model.Reservasi;
import model.Tiket;
import model.tiket;
import model.Customer;
import java.util.Scanner;
import java.util.ArrayList;

public class App {
    static ArrayList<Reservasi> reservasi= new ArrayList<Reservasi>();
    static ArrayList<Customer> customer= new ArrayList<Customer>();
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
       init();
    }

// input data customer
public static void inputDataCustomer() {
        Scanner input = new Scanner(System.in);
        Integer idCustomer;
        String nama, alamatEmail;
        System.out.print("ID Customer: ");
        idCustomer = input.nextInt();
        input.nextLine();
        System.out.print("Nama: ");
        nama = input.nextLine();
        System.out.print("Alamat Email: ");
        alamatEmail = input.nextLine();

        Customer tmpCustomer = new Customer(idCustomer, nama, alamatEmail);
        int pilihan = 0;

    }
// input data jadwal konser


public static void init() {
        initJadwalkonser();
        initReservasi();
        initPembayaran();
        initTiket();
        initCustomer();
}
// init data customer
    private static void initCustomer() {
        Customer customer1 = new Customer(122648, "Clara Xarena", "xaren123@gmail.com"); 
}
//init data jadwal konser
    public static void initJadwalkonser() {
        Jadwalkonser konser1 = new Jadwalkonser(112, "STAR LIGHT", "ASTRO", "Indonesia Convention Exhibition (ICE)");
        Jadwalkonser konser2 = new Jadwalkonser(113, "BORN PINK", "BLACKPINK", "Gelora Bung Karno (GBK)");
        Jadwalkonser konser3 = new Jadwalkonser(114, "REVE FESTIVAL", "RED VELVED", "Jakarta Convention Center (JCC)");
    }
//init data reservasi
    public static void initReservasi() {
        Reservasi dataReservasi1 = new Reservasi (null, null, null, null);

    }
//init data pembayaran
    public static void initPembayaran () {

    }

//init data tiket
    public static void initTiket() {
        Tiket tiket1 = new Tiket(556431, "VIP", 99999.99, "setVIP15", null);
}
}