
public class Deposito extends Rekening implements BerBunga {

    private double bunga;

    public Deposito(int nomor, String pemilik,
                    long saldo, double bunga) {
        super(nomor, pemilik, saldo);
        this.bunga = bunga;
    }

    @Override
    public boolean tarik(long jumlah) {
        // Percobaan awal LSP:
        // throw new UnsupportedOperationException(
        //     "Deposito tidak bisa ditarik"
        // );

        return false;
    }

    @Override
    public long potongBiayaAdmin() {
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
                "Deposito, bunga %.1f%% per bulan", bunga
        );
    }
}
