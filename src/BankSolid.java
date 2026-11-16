
public class BankSolid {

    public static void main(String[] args) {

        // Membuat objek rekening
        Tabungan ani = new Tabungan(
                101, "Ani", 1000000, 2.5
        );

        Tabungan citra = new Tabungan(
                102, "Citra", 300000, 2.0
        );

        Giro budi = new Giro(
                201, "Budi", 200000, 500000
        );

        Deposito dewi = new Deposito(
                301, "Dewi", 5000000, 4.0
        );

        // Menyusun seluruh rekening
        Rekening[] semua = {
                ani, citra, budi, dewi
        };

        // Menyusun rekening yang mendapatkan bunga
        BerBunga[] berbunga = {
                ani, citra, dewi
        };

        ProsesAkhirBulan proses = new ProsesAkhirBulan();
        LaporanBank laporan = new LaporanBank();

        // Laporan awal
        laporan.cetakDaftar("REKENING AWAL", semua);

        // Proses akhir bulan
        System.out.println();
        System.out.println("========== AKHIR BULAN ==========");

        proses.potongBiayaAdmin(semua);
        proses.tambahBunga(berbunga);
        proses.autodebet(semua, 50000);

        // Laporan akhir
        System.out.println();
        laporan.cetakDaftar("REKENING AKHIR", semua);
        laporan.cetakTotal(semua);
    }
}
