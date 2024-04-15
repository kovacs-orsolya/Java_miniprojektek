import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tranzakcio {

    enum TranzakcioTipus {
        DEPOSIT,
        WITHDRAW
    }

    private LocalDateTime idopont;

    private TranzakcioTipus tranztipus;

    private double osszeg;

    public Tranzakcio(TranzakcioTipus tranztipus, double osszeg) {
        this.tranztipus = tranztipus;
        this.osszeg = osszeg;
        this.idopont = LocalDateTime.now();
    }

    public TranzakcioTipus getTranztipus() {
        return tranztipus;
    }

    @Override
    public String toString() {
        return "Tranzakcio{" +
                "idopont=" + idopont.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")) +
                ", tranztipus=" + tranztipus +
                ", osszeg=" + osszeg +
                '}';
    }
}
