import model.reservasi;

public class App {
    public static void main(String[] args) throws Exception {
        init();
        
        reservasi dataReservasi = new reservasi(); 
        
        dataReservasi.setDaftarKonser("Konser A");
        dataReservasi.setJenisTiket("Tiket Reguler");
        dataReservasi.setHargaTiket(100000.0);
        dataReservasi.setJumlahTiketTersedia(100);
        dataReservasi.setTempatKonser("Venue X");
        dataReservasi.setDaftarTempatDuduk("A1, A2, A3, B1, B2, B3");
        dataReservasi.setTipeTempatDuduk("VIP");
                
        System.out.println("Data Reservasi:");
        System.out.println(dataReservasi.toString());
    }
    
    public static void init() {
        reservasi dataReservasi2 = new reservasi("BORN PINK WORLD TOUR ASIA", "Tiket VIP", 5000000.0, 10, "GBK", "VIP1", "VIP");
        cetakReservasi(dataReservasi2);
        reservasi dataReservasi3 = new reservasi("STAR LIGHT", "Tiket Reguler", 300000.0, 40, "Venue 1", "R61", "Regular");
        cetakReservasi(dataReservasi2);
        reservasi dataReservasi4 = new reservasi("THE REVE FESTIVAL", "Tiket Reguler", 7000000.0, 45, "GBK", "R33", "Regular");
        cetakReservasi(dataReservasi2);
    }
    
    public static void cetakReservasi(reservasi dataReservasi) {
        System.out.println("Data Reservasi:");
        System.out.println("Daftar Konser: " + dataReservasi.getDaftarKonser());
        System.out.println("Harga Tiket: " + dataReservasi.getHargaTiket());
    }
}   
    
        


//      System.out.println("1. Tampilkan Jadwal Konser");
//      System.out.println("2. Melakukan Reservasi");
//      System.out.println("3. Membatalkan Reservasi");
//      System.out.println("4. Pembayaran");
//      System.out.println("5. Menampilkan Reservasi");
//      System.out.println("6. Keluar");
