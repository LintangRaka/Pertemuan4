import java.util.Scanner;

public class TugasSwitch {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.println("================================================");
        System.out.println("=============Bioskop Zonkxs===================");
        System.out.println("1. STUDIO DOLBY ATMOS");
        System.out.println("2. IMAX");
        System.out.println("3. THE PREMIERE");
        System.out.println("================================================");
        System.out.print("Tentukan Pilihan Anda: ");
        int pilih = masukan.nextInt();
        int harga = 0;
        switch (pilih) {
            case ( 1 ):
                harga = 100000;
                break;
            case ( 2 ):
                harga = 250000;
                break;
            case ( 3 ):
                harga = 350000;
                break;
            default:
                System.out.println("Pilihan Tidak Tersedia Untuk Sekarang");
                System.exit(0);
                break;
        }
        System.out.print("Masukkan Jumlah Yang Anda Inginkan: ");
        Scanner jum = new Scanner(System.in);
        int jumlah = jum.nextInt();
        int total = harga * jumlah;
        System.out.println("Total Harga Tiket: " +total);
        System.out.println("Terima Kasih, Selamat Menikmati Film Kesayangan Anda");
        masukan.close();
        jum.close();
    }
}