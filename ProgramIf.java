import java.util.Scanner;
public class ProgramIf {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Nilai Hasil Tugas : ");
        int angka = input.nextInt();
        if (angka >= 80 && angka <= 100){
            System.out.println("Kategori A");
        }
        else if (angka >= 50 && angka <= 79){
            System.out.println("Kategori B");
        }
        else if (angka >= 30 && angka <= 49){
            System.out.println("Kategori C");
        }
        else if (angka >= 11 && angka <= 29){
            System.out.println("Kategori D");
        }
        else if (angka >= 0 && angka <= 10) {
            System.out.println("Kayegori E");
        }
        else {
            System.out.println("NILAI YANG DI MASUKKAN TIDAK SESUAI KATEGORI");
        }
        input.close();
    }
    
}