public class Menu {
    private String kodeMenu;
    private String namaMenu;
    private double harga;
    private String kategori;

    public Menu() {
        this.kodeMenu = "-";
        this.namaMenu = "-";
        this.harga = 0;
        this.kategori = "-";
    }

    public Menu(String kodeMenu, String namaMenu, double harga, String kategori) {
        this.kodeMenu = kodeMenu;
        this.namaMenu = namaMenu;
        this.harga = harga;
        this.kategori = kategori;
    }

    public void setData(String kodeMenu, String namaMenu, double harga, String kategori) {
        this.kodeMenu = kodeMenu;
        this.namaMenu = namaMenu;
        this.harga = harga;
        this.kategori = kategori;
    }

    public double hitungHarga(int jml) {
        return harga * jml;
    }

    public void tampilMenu() {
        System.out.println("Kode     : " + kodeMenu);
        System.out.println("Nama     : " + namaMenu);
        System.out.println("Kategori : " + kategori);
        System.out.println("Harga    : " + (int) harga);
    }

    public void tampilKasir(int jumlah) {
        System.out.println("Kode   : " + kodeMenu);
        System.out.println("Nama   : " + namaMenu);
        System.out.println("Harga  : " + (int) harga);
        System.out.println("Jumlah : " + jumlah);
        System.out.println("Total  : " + (int) hitungHarga(jumlah));
    }
}
