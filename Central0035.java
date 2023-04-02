//Fitry Antyesti Ilyas
//13020210035
interface A {
    public void aaa();
}

interface B extends A {
    public void aaa();
}

class Central0035 implements B {
    public void aaa() {
        System.out.println("aaa");
    }

    public static void main(String[] args) {
        System.out.println("main");
        Central0035 obj = new Central0035();
        obj.aaa();
    }
}
//Berikut Penjelasan Perbaikan Program:
//Menghapus implementasi interface A pada kelas Central0035 karena interface A sudah diimplementasikan oleh interface B.
//Menambahkan deklarasi objek dari kelas Central0035 pada method main untuk mengakses method aaa().
//Menghapus kata kunci this pada pemanggilan method aaa() pada baris 11 karena this tidak dapat digunakan dalam konteks static method.
//Menambahkan kurung kurawal ({}) pada method main untuk menunjukkan awal dan akhir blok kode method.