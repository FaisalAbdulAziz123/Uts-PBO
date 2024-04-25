import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di Aplikasi Pemesanan Tempat!");
        System.out.print("Masukkan nama Anda: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan jumlah orang: ");
        int jumlahOrang = scanner.nextInt();
        scanner.nextLine(); // Membuang karakter baru

        System.out.print("Masukkan tanggal (dd/mm/yyyy): ");
        String tanggal = scanner.nextLine();

        System.out.print("Masukkan waktu: ");
        String waktu = scanner.nextLine();

        // Membuat objek booking berdasarkan input pengguna
        Booking booking = new Booking(nama, jumlahOrang, tanggal, waktu);

        // Menampilkan informasi pemesanan
        System.out.println("\nDetail Pemesanan:");
        booking.displayBookingInfo();

        // Tutup scanner
        scanner.close();
    }
}