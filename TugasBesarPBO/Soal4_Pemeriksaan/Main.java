import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Pemeriksaan> daftar = new ArrayList<>();
        
        daftar.add(new Pemeriksaan("P001", "Andi Pratama", "dr. Rina", 150000));
        daftar.add(new Pemeriksaan("P002", "Sari Dewi", "dr. Budi", 200000));
        daftar.add(new Pemeriksaan("P003", "Joko Susilo", "dr. Rina", 175000));

        System.out.println("=== DATA PEMERIKSAAN KLINIK ===");
        double totalBiaya = 0;
        for (Pemeriksaan p : daftar) {
            p.tampilData();
            totalBiaya += p.hitungTotal();
        }
        System.out.println("TOTAL BIAYA SEMUA PEMERIKSAAN : Rp" + (int) totalBiaya);
    }
}
