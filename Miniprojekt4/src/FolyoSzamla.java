public class FolyoSzamla extends RegularisSzamla {

    private int tranzakciokSzama = 0;

    private static final int INGYENES_TRANZ_SZAMA = 3;

    private static final double TRANZAKCIO_ARA = 2;

    public FolyoSzamla(String tulnev) {
        super(tulnev);
    }

    public double levonKoltseg() {
        double koltseg = 0;
        if (this.tranzakciokSzama > INGYENES_TRANZ_SZAMA) {
            koltseg = TRANZAKCIO_ARA * (this.tranzakciokSzama - INGYENES_TRANZ_SZAMA);
        }
        this.tranzakciokSzama = 0;
        return koltseg;
    }

    @Override
    public void betesz(double osszeg) {
        this.tranzakciokSzama++;
        this.egyenleg -= levonKoltseg();
        super.betesz(osszeg);
    }

    @Override
    public void kivesz(double osszeg) throws Exception {
        this.tranzakciokSzama++;
        this.egyenleg -= levonKoltseg();
        super.kivesz(osszeg);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FolyoSzamla)) return false;
        return (this.tranzakciokSzama == ((FolyoSzamla) o).tranzakciokSzama &&
                this.tulnev.equals(((FolyoSzamla) o).tulnev) &&
                this.szamlaSzam == ((FolyoSzamla) o).szamlaSzam);
    }

}
