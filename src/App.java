import model.Jadwalkonser;
import model.Pembayaran;
import model.Reservasi;
import model.Tiket;
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
        Reservasi dataReservasi1 = new Reservasi (1234, customers, jadwalkonserr, tiket, customer, 1);
        Reservasi dataReservasi1 = new Reservasi (1255, customers, jadwalkonserr, tiket, customer, 2);
        Reservasi dataReservasi1 = new Reservasi (1276, customers, jadwalkonserr, tiket, customer, 1);
    }
//init data pembayaran
    public static void initPembayaran () {
        double dataReservasi;
        Pembayaran pembayaran1 = new Pembayaran(154, "Visa", 1234567890, 99999.99, dataReservasi);
        Pembayaran pembayaran2 = new Pembayaran(244, "Debit", 1234632890, 199999.98, dataReservasi);
        Pembayaran pembayaran3 = new Pembayaran(345, "Mastercard", 1234567890, 99999.99, dataReservasi);
    }


//init data tiket
    public static void initTiket() {
        Reservasi reservasii;
        Tiket tiket1 = new Tiket(556431, "VIP", 99999.99, "setVIP15", reservasii);
        Tiket tiket1 = new Tiket(559831, "Reguler", 199999.98, "Reguler20", reservasii);
        Tiket tiket1 = new Tiket(557731, "VIP", 99999.99, "setVIP44", reservasii);
    }
}