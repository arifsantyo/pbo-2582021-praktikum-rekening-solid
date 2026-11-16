
public class ProsesAkhirBulan {

    public void potongBiayaAdmin(Rekening[] semua) {
        for (Rekening r : semua) {
            long biaya = r.potongBiayaAdmin();

            System.out.printf(
                    "%d biaya admin  : Rp%,d%n",
                    r.getNomor(), biaya
            );
        }
    }

    public void tambahBunga(BerBunga[] berbunga) {
        for (BerBunga b : berbunga) {
            long bunga = b.hitungBunga();
            b.tambahBunga();

            // Nomor rekening ditampilkan melalui
            // implementasi interface yang disesuaikan.
            System.out.printf(
                    "bunga           : Rp%,d%n",
                    bunga
            );
        }
    }

    public void autodebet(Rekening[] semua, int jumlah) {
        for (Rekening r : semua) {
            boolean berhasil = r.tarik(jumlah);

            if (berhasil) {
                System.out.printf(
                        "%d autodebet    : Rp%,d%n",
                        r.getNomor(), jumlah
                );
            } else {
                System.out.printf(
                        "%d autodebet    : gagal%n",
                        r.getNomor()
                );
            }
        }
    }
}
