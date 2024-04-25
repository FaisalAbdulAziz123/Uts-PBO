import java.util.Scanner;

@SuppressWarnings("unused")
class Booking {
    private String nama;
    private int jumlahOrang;
    private String tanggal;
    private String waktu;

    // Konstruktor
    public Booking(String nama, int jumlahOrang, String tanggal, String waktu) {
        this.nama = nama;
        this.jumlahOrang = jumlahOrang;
        this.tanggal = tanggal;
        this.waktu = waktu;
    }

    // Metode untuk menampilkan informasi pemesanan
    public void displayBookingInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Jumlah Orang: " + jumlahOrang);
        System.out.println("Tanggal: " + tanggal);
        System.out.println("Waktu: " + waktu);
    }
}
