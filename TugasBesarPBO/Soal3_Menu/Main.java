public class Main {
    public static void main(String[] args) {
        // Opsi 1: constructor dengan parameter
        Menu m1 = new Menu("M01", "Nasi Goreng", 18000, "Makanan");

        // Opsi 2: constructor tanpa parameter, lalu diisi
        Menu m2 = new Menu();
        m2.setData("M02", "Es Teh Manis", 5000, "Minuman");

        System.out.println("=== EKSPEKTASI OUTPUT KASIR ===");
        m1.tampilKasir(2);

        System.out.println();
        System.out.println("=== DAFTAR MENU ===");
        m1.tampilMenu();
        System.out.println();
        m2.tampilMenu();
        System.out.println("Total beli 3 -> " + (int) m2.hitungHarga(3));
    }
}
