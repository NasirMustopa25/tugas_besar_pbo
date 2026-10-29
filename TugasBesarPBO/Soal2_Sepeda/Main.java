public class Main {
    public static void main(String[] args) {
        Sepeda s1 = new Sepeda("S01", "Sepeda Gunung", 3, 15000);
        Sepeda s2 = new Sepeda("S02", "Sepeda Lipat", 5, 10000);

        System.out.println("=== RENTAL SEPEDA ===");
        s1.tampilData();
        s2.tampilData();

        // Nilai return dipakai langsung
        double total = s1.hitungBiaya() + s2.hitungBiaya();
        System.out.println("Total pendapatan rental: Rp" + total);
    }
}
