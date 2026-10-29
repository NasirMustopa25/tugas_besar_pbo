// Soal 1 - Sistem Data Buku
// Konsep: Class & Object, Attribute, Constructor dasar, Method void
public class Buku {
    // Attribute (default modifier / package-private, sesuai class diagram ~)
    String kodeBuku;
    String judul;
    String penulis;
    double harga;

    // Constructor
    public Buku(String kodeBuku, String judul, String penulis, double harga) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.penulis = penulis;
        this.harga = harga;
    }

    // Method void: hanya menampilkan data
    public void tampilData() {
        System.out.println("Kode Buku : " + kodeBuku);
        System.out.println("Judul     : " + judul);
        System.out.println("Penulis   : " + penulis);
        System.out.println("Harga     : Rp" + harga);
        System.out.println("-----------------------------");
    }
}
