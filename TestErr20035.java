
//Fitry Antyesti Ilyas
//13020210035
public class TestErr20035 {
    public static void main(String[] args) {
        int tot = 0;
        int j = 0;
        for (int i = 0; i < 10; i++) {
            tot += i;
            if (i < j) {
                System.out.println(i);
            } else {
                System.out.println(j);
            }
        }
        do {
            j++;
        } while (j < 10);
        while (j < 10) {
            j++;
        }
    }
}
//Berikut Penjelasan Perbaikan Program:
//Menginisialisasi variabel tot dan j dengan nilai awal 0.
//Mengubah operator += pada baris 7 dari +== menjadi +=.
//Menghapus titik koma (;) pada baris 6 dan baris 11 karena akan mengakibatkan kesalahan sintaksis.
//Mengubah elses pada baris 10 menjadi else.
//Mengubah whiles pada baris 14 menjadi while.
//Menghapus kurung kurawal ({}) pada baris 16 karena tidak dibutuhkan.