import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Tiket> daftarTiket = new ArrayList<>();

        daftarTiket.add(new Tiket("T001", "Avengers: Endgame", "Reguler", 40000, 2));
        daftarTiket.add(new Tiket("T002", "Laskar Pelangi", "VIP", 75000, 3));
        daftarTiket.add(new Tiket("T003", "Frozen II", "Reguler", 40000, 4));

        double totalSemua = 0;
        for (Tiket t : daftarTiket) {
            t.tampilData();
            totalSemua += t.hitungTotal();
        }
        System.out.printf("%-12s: %d%n", "TOTAL SEMUA", (int) totalSemua);
        System.out.println("========================================");
    }
}
