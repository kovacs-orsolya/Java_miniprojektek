import java.util.ArrayList;

public class RegularisSzamla implements BankSzamla {

    protected double egyenleg;
    protected String tulnev;

    protected int szamlaSzam;

    private static int kovSzamlaSzam = 1;

    protected ArrayList<Tranzakcio> tranzakciok;

    public RegularisSzamla(String tulnev) {
        this.tulnev = tulnev;
        this.szamlaSzam = ujSzamlaSzam();
        this.tranzakciok = new ArrayList<>();
    }

    private int ujSzamlaSzam() {

        return kovSzamlaSzam++;
    }

    @Override
    public String toString() {
        return "Szamla{" +
                "szamlaszam=" + szamlaSzam +
                ", tulnev='" + tulnev + '\'' +
                ", egyenleg=" + egyenleg +
                ", tranzakciok=" + tranzakciok +
                '}';
    }

    @Override
    public void betesz(double osszeg) {
        this.egyenleg += osszeg;
        this.tranzakciok.add(new Tranzakcio(Tranzakcio.TranzakcioTipus.DEPOSIT, osszeg));
    }

    @Override
    public void kivesz(double osszeg) throws Exception {
        if (osszeg > this.egyenleg) {
            throw new Exception("Nincs elég pénz a számlán!");
        } else {
            this.egyenleg -= osszeg;
            this.tranzakciok.add(new Tranzakcio(Tranzakcio.TranzakcioTipus.WITHDRAW, osszeg));
        }
    }

    @Override
    public double getegyenleg() {
        return this.egyenleg;
    }
}
