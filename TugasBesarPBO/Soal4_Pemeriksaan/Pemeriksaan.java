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
