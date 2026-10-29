// Soal 4 - Sistem Data Pemeriksaan Klinik
// Konsep: private attribute, this pada constructor, method kalkulasi
public class Pemeriksaan {
    private String noPemeriksaan;
    private String namaPasien;
    private String namaDokter;
    private double biayaPemeriksaan;

    public Pemeriksaan(String noPemeriksaan, String namaPasien,
                       String namaDokter, double biayaPemeriksaan) {
        this.noPemeriksaan = noPemeriksaan;
        this.namaPasien = namaPasien;
        this.namaDokter = namaDokter;
        this.biayaPemeriksaan = biayaPemeriksaan;
    }

    // Mengembalikan biaya agar bisa dijumlahkan di Main
    public double hitungTotal() {
        return biayaPemeriksaan;
    }

    public void tampilData() {
        System.out.println("No Pemeriksaan : " + noPemeriksaan);
        System.out.println("Nama Pasien    : " + namaPasien);
        System.out.println("Nama Dokter    : " + namaDokter);
        System.out.println("Biaya          : Rp" + (int) biayaPemeriksaan);
        System.out.println("-----------------------------");
    }
}
