public class Main {
    public static void main(String[] args) {
        
        Buku buku1 = new Buku("B001", "Pemrograman Java Dasar", "Budi Santoso", 85000);
        Buku buku2 = new Buku("B002", "Struktur Data dan Algoritma", "Siti Rahma", 95000);

        System.out.println("=== DATA INVENTARIS BUKU ===");
        buku1.tampilData();
        buku2.tampilData();
    }
}
