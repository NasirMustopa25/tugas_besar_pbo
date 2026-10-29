public class Sepeda {
    private String kodeSepeda;
    private String jenisSepeda;
    private int lamaSewa;
    private double hargaPerJam;

    public Sepeda(String kodeSepeda, String jenisSepeda, int lamaSewa, double hargaPerJam) {
        this.kodeSepeda = kodeSepeda;
        this.jenisSepeda = jenisSepeda;
        this.lamaSewa = lamaSewa;
        this.hargaPerJam = hargaPerJam;
    }

    public double hitungBiaya() {
        return lamaSewa * hargaPerJam;
    }

    public void tampilData() {
        System.out.println("Kode Sepeda  : " + kodeSepeda);
        System.out.println("Jenis Sepeda : " + jenisSepeda);
        System.out.println("Lama Sewa    : " + lamaSewa + " jam");
        System.out.println("Harga/Jam    : Rp" + hargaPerJam);
        System.out.println("Total Biaya  : Rp" + hitungBiaya());
        System.out.println("-----------------------------");
    }
}
