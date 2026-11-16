
public class Giro extends Rekening {

    private long batasOverdraft;

    public Giro(int nomor, String pemilik,
                long saldo, long batasOverdraft) {
        super(nomor, pemilik, saldo);
        this.batasOverdraft = batasOverdraft;
    }

    @Override
    public boolean tarik(long jumlah) {
        if (jumlah > 0 &&
                saldo - jumlah >= -batasOverdraft) {
            saldo -= jumlah;
            return true;
        }
        return false;
    }

    @Override
    public long potongBiayaAdmin() {
        long admin = 15000;

        if (saldo - admin >= -batasOverdraft) {
            saldo -= admin;
            return admin;
        }

        return 0;
    }

    @Override
    public String keterangan() {
        return String.format(
                "Giro, batas overdraft Rp%,d", batasOverdraft
        );
    }
}
