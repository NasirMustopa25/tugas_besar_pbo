// Soal 3 - Sistem Kafe
// Konsep: Constructor Overloading, method dengan parameter input
public class Menu {
    private String kodeMenu;
    private String namaMenu;
    private double harga;
    private String kategori;

    // Constructor 1: tanpa parameter
    public Menu() {
        this.kodeMenu = "-";
        this.namaMenu = "-";
        this.harga = 0;
        this.kategori = "-";
    }

    // Constructor 2: dengan parameter (Overloading)
    public Menu(String kodeMenu, String namaMenu, double harga, String kategori) {
        this.kodeMenu = kodeMenu;
        this.namaMenu = namaMenu;
        this.harga = harga;
        this.kategori = kategori;
    }

    // Setter, agar object dari constructor kosong bisa diisi
    public void setData(String kodeMenu, String namaMenu, double harga, String kategori) {
        this.kodeMenu = kodeMenu;
        this.namaMenu = namaMenu;
        this.harga = harga;
        this.kategori = kategori;
    }

    // Method dengan parameter input, mengembalikan total
    public double hitungHarga(int jml) {
        return harga * jml;
    }

    public void tampilMenu() {
        System.out.println("Kode     : " + kodeMenu);
        System.out.println("Nama     : " + namaMenu);
        System.out.println("Kategori : " + kategori);
        System.out.println("Harga    : " + (int) harga);
    }

    // Menampilkan struk sesuai ekspektasi output kasir
    public void tampilKasir(int jumlah) {
        System.out.println("Kode   : " + kodeMenu);
        System.out.println("Nama   : " + namaMenu);
        System.out.println("Harga  : " + (int) harga);
        System.out.println("Jumlah : " + jumlah);
        System.out.println("Total  : " + (int) hitungHarga(jumlah));
    }
}
