
public class Tabungan extends Rekening implements BerBunga {

    private double bunga;

    public Tabungan(int nomor, String pemilik,
                    long saldo, double bunga) {
        super(nomor, pemilik, saldo);
        this.bunga = bunga;
    }

    @Override
    public boolean tarik(long jumlah) {
        if (jumlah > 0 && saldo >= jumlah) {
            saldo -= jumlah;
            return true;
        }
        return false;
    }

    @Override
    public long potongBiayaAdmin() {
        long admin = 5000;

        if (saldo >= admin) {
            saldo -= admin;
            return admin;
        }

        return 0;
    }

    @Override
    public long hitungBunga() {
        return Math.round(saldo * bunga / 100);
    }

    @Override
    public void tambahBunga() {
        saldo += hitungBunga();
    }

    @Override
    public String keterangan() {
        return String.format(
                "Tabungan, bunga %.1f%% per bulan", bunga
        );
    }
}
