//Fitry Antyesti Ilyas
//13020210035

public class Test0035 {
    public static void main(String[] args) {
        // (a) buat instansi objek bernama balok1 dari Class Balok() →default const.
        Balok balok1 = new Balok();

        // (b) buat instansi objek bernama balok2 dari Class Balok(20,35, 15)→param const.
        Balok balok2 = new Balok(20, 35, 15);

        // (c) setter → set nilai l = 5 dari konstruktor Balok()
        balok1.setL(5);

        // (d) setter → set nilai p = 25 dari konstruktor Balok()
        balok1.setP(25);

        // (e) setter → set nilai t = 10 dari konstruktor Balok(20,35, 15)
        balok2.setT(10);

        // (f) panggil method info dari objek balok1
        balok1.info();

        // (g) panggil method info dari objek balok2
        balok2.info();
    }
}

// class Balok
class Balok extends PersegiPanjang {
    int t;
    
    // (h) Konstruktor Balok() →default const.
    public Balok() {
        super(); // nilai panjang=30 & lebar=20 dari konstruktor superclass PersegiPanjang
        this.t = 15; // nilai tinggi=15
    }
    
    // (i) Konstruktor Balok(20,35, 15)→param const.
    public Balok(int p, int l, int t) {
        super(p, l); // nilai pada saat runtime p p, l=l dari konstruktor superclass PersegiPanjang
        this.t = t; // nilai pada saat runtime t t;
    }
    
    // (j) Buat getter setter class Balok
    public int getT() {
        return this.t;
    }
    
    public void setT(int t) {
        this.t = t;
    }
    
    // (k) Fungsi untuk menghitung volume balok : p x l x t
    public int volume() {
        return this.getP() * this.getL() * this.t;
    }
    
    // (l) Fungsi untuk menampilkan nilai panjang, lebar, tinggi, luas, dan volume balok
    public void info() {
        System.out.println("Panjang: " + this.getP());
        System.out.println("Lebar: " + this.getL());
        System.out.println("Tinggi: " + this.t);
        System.out.println("Luas: " + this.luas());
        System.out.println("Volume: " + this.volume());
    }
}

// class Persegi Panjang
class PersegiPanjang {
int p, l;

public PersegiPanjang() {
    // (m) berisi nilai panjang=30 & lebar=20
    this.p = 30;
    this.l = 20;
}

public PersegiPanjang(int p, int l) {
    // (n) berisi nilai pada saat runtime p p, l=l 
    this.p = p;
    this.l = l;
}

// (o) buat getter setter class Persegi Panjang
public int getP() {
    return p;
}

public void setP(int p) {
    this.p = p;
}

public int getL() {
    return l;
}

public void setL(int l) {
    this.l = l;
}

public int luas() {
    // (q) fungsi untuk menghitung luas persegi panjang : p x l
    return p * l;
}

public int keliling() {
    // (r) fungsi untuk menghitung keliling persegi panjang : 2x (p+l)
    return 2 * (p + l);
}
}