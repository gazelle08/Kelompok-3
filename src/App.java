import model.Jadwalkonser;
import model.Pembayaran;
import model.pembayaran;
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
        System.out.println("Masukkan ID Customer /t: ");
        idCustomer = input.nextInt();
        input.nextLine();
        System.out.println("Masukkan Nama /t: ");
        nama = input.nextLine();
        System.out.println("Masukkan Alamat Email /t: ");
        alamatEmail = input.nextLine();

        Customer tmpCustomer = new Customer(idCustomer, nama, alamatEmail);
    }

// input data reservasi
public static void inputDataReservasi(){
    Scanner input = new Scanner(System.in);
        Integer idReservasi, jumlahTiket;
        System.out.println("Masukkan ID Reservasi /t: ");
        idReservasi = input.nextInt();
        
        System.out.println("Masukkan Jumlah Tiket /t: ");
        jumlahTiket = input.nextInt();      
}

//input data tiket
public class Tiket {
    private Integer idTiket;
    private String jenisTiket;
    private Double hargaTiket;
    private String tempatDuduk;
    private ArrayList<Reservasi> reservasiList;

    public Tiket(Integer idTiket, String jenisTiket, Double hargaTiket, String tempatDuduk) {
        this.idTiket = idTiket;
        this.jenisTiket = jenisTiket;
        this.hargaTiket = hargaTiket;
        this.tempatDuduk = tempatDuduk;
        this.reservasiList = new ArrayList<>();
    }

    public void tambahkanReservasi(Reservasi reservasi) {
        reservasiList.add(reservasi);
    }
}

public static void init() {
        initJadwalkonser();
        initReservasi();
        initPembayaran();
        initTiket();
} 
//init data jadwal konser
    public static void initJadwalkonser() {
        Jadwalkonser konser1 = new Jadwalkonser(112, "STAR LIGHT", "ASTRO", "Indonesia Convention Exhibition (ICE)");
        Jadwalkonser konser2 = new Jadwalkonser(113, "BORN PINK", "BLACKPINK", "Gelora Bung Karno (GBK)");
        Jadwalkonser konser3 = new Jadwalkonser(114, "REVE FESTIVAL", "RED VELVED", "Jakarta Convention Center (JCC)");
    }
    public static void cetakMahasiswa(Jadwalkonser x){
        System.out.println(x.getIdJadwalKonser() + " "+ x.getNamaKonser() + " " +x.getNamaArtis()+ " " +x.getTempatKonser() );
    }
//init data reservasi
    public static void initReservasi() {
        Reservasi dataReservasi1 = new Reservasi (null, null, null, null, null, null);

    }
//init data pembayaran
    public static void initPembayaran () {
        Pembayaran pembayaran1 = new Pembayaran(122, "Visa", 12345321, 99999.99, null);
        Pembayaran pembayaran2 = new Pembayaran(123, "Debit", 12347822, 69999.99, null);
        Pembayaran pembayaran3 = new Pembayaran(127, "Mastercard", 12349162, 69999.99, null);
    }

//init data tiket
    public static void initTiket() {
        Tiket tiket1 = new Tiket(556431, "VIP", 99999.99, "setVIP15", null);
        Tiket tiket2 = new Tiket(556431, "VIP", 99999.99, "setReguler53", null);
        Tiket tiket3 = new Tiket(556431, "VIP", 99999.99, "setReguler34", null);

}
public static void cetakMahasiswa(Tiket x){
        System.out.println(x.getIdTiket() + " "+ x.getJenisTiket()+ " "+ x.getHargaTiket()+ " "+ x.getTempatDuduk());
}
}