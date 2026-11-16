
public abstract class Rekening {
    protected int nomor;
    protected String pemilik;
    protected long saldo;

    public Rekening(int nomor, String pemilik, long saldo) {
        this.nomor = nomor;
        this.pemilik = pemilik;
        this.saldo = saldo;
    }

    public int getNomor() {
        return nomor;
    }

    public String getPemilik() {
        return pemilik;
    }

    public long getSaldo() {
        return saldo;
    }

    public void setor(long jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
        }
    }

    /*
     * Kontrak:
     * true jika penarikan berhasil.
     * false jika penarikan gagal.
     * Method ini tidak pernah melempar exception.
     */
    public abstract boolean tarik(long jumlah);

    public abstract long potongBiayaAdmin();

    public abstract String keterangan();
}
