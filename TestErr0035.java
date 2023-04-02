
//Fitry Antyesti Ilyas
//13020210035
import java.util.Scanner;
public class TestErr0035 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double i = input.nextDouble();
        double k = 100;
        char c = 's';
        boolean falses = false;
        double j = i + 1;
        System.out.println("j adalah " + j + " k adalah " + k + " dan c adalah " + c + " dan falses adalah " + falses);
    }
}

//Berikut penjelasan Perbaikan Program:
//Perbaikan import untuk Scanner
//Mengubah tipe data variabel i menjadi double, karena input.nextDouble() mengembalikan nilai double.
//Mengubah tanda kutip ganda pada variabel c menjadi tanda kutip tunggal, karena char hanya dapat berisi satu karakter.
//Mengubah variabel trues menjadi falses dan memberi nilai false, karena trues tidak didefinisikan dan keinginan kita adalah untuk menginisialisasi variabel falses menjadi false.
//Mengubah tipe data variabel j menjadi double, karena hasil penjumlahan dari double dan double adalah double.
