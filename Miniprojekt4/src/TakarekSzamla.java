public class TakarekSzamla extends RegularisSzamla {

    private double kamatRata;

    public TakarekSzamla(String tulnev, double kamatRata) {
        super(tulnev);
        this.kamatRata = kamatRata;
    }

    public double getKamatRata() {
        return kamatRata;
    }

    public void setKamatRata(double kamatRata) {
        this.kamatRata = kamatRata;
    }

    public void hozzaadKamat() {
        this.egyenleg = egyenleg * kamatRata / 100;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FolyoSzamla)) return false;
        return (this.kamatRata == ((TakarekSzamla) o).kamatRata &&
                this.tulnev.equals(((TakarekSzamla) o).tulnev) &&
                this.szamlaSzam == ((TakarekSzamla) o).szamlaSzam);
    }
}
