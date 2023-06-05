import model.jadwalkonser;

public class App {
    public static void main(String[] args) {
        init();

        jadwalkonser datakonser = new jadwalkonser();

        datakonser.setNamaArtis("BLACKPINK");
        datakonser.setNamaKonser("BORN PINK WORLD TOUR ASIA 2023");

        jadwalkonser konser1 = new jadwalkonser("STAR LIGHT", "ASTRO");
        jadwalkonser konser2 = new jadwalkonser("THE REVE FESTIVAL ", "RED VELVET");
        
        System.out.println("3. Nama Konser: " + konser1.getNamaKonser());
        System.out.println("   Nama Artis: " + konser1.getNamaArtis());
        System.out.println("4. Nama Konser: " + konser2.getNamaKonser());
        System.out.println("   Nama Artis: " + konser2.getNamaArtis());
    }

    public static void init() {
        jadwalkonser konser3 = new jadwalkonser("BORN PINK WORLD TOUR ASIA 2023", "BLACKPINK");
        jadwalkonser konser4 = new jadwalkonser("MAP OF THE SEOUL TOUR", "BTS");

        System.out.println ("JADWAL KONSER TERKINI");
        System.out.println("1. Nama Konser: " + konser3.getNamaKonser());
        System.out.println("   Nama Artis: " + konser3.getNamaArtis());

        System.out.println("2. Nama Konser: " + konser4.getNamaKonser());
        System.out.println("   Nama Artis: " + konser4.getNamaArtis());
    }
}

//      System.out.println("1. Tampilkan Jadwal Konser");
//      System.out.println("2. Melakukan Reservasi");
//      System.out.println("3. Membatalkan Reservasi");
//      System.out.println("4. Pembayaran");
//      System.out.println("5. Menampilkan Reservasi");
//      System.out.println("6. Keluar");
  

