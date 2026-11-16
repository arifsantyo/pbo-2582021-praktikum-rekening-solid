
public class LaporanBank {

    public void cetakDaftar(String judul, Rekening[] semua) {
        System.out.println("========== " + judul + " ==========");

        for (Rekening r : semua) {
            System.out.printf(
                    "%d | %-6s | Rp%,12d%n",
                    r.getNomor(),
                    r.getPemilik(),
                    r.getSaldo()
            );

            System.out.println("      " + r.keterangan());
        }
    }

    public void cetakTotal(Rekening[] semua) {
        System.out.println("-----------------------------------");

        long total = 0;

        for (Rekening r : semua) {
            total += r.getSaldo();
        }

        System.out.printf("Total dana bank : Rp%,d%n", total);
    }
}
