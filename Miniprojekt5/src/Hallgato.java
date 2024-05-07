import java.util.ArrayList;

public class Hallgato {
    private static int nextID = 0;
    private final int ID;
    private final String VEZETEKNEV;
    private final String KERESZTNEV;
    private ArrayList<Jegy> jegyek = new ArrayList<>();

    public Hallgato(String VEZETEKNEV, String KERESZTNEV) {
        this.VEZETEKNEV = VEZETEKNEV;
        this.KERESZTNEV = KERESZTNEV;
        this.ID = nextID++;
    }

    public int getID() {
        return ID;
    }

    public String getVEZETEKNEV() {
        return VEZETEKNEV;
    }

    public String getKERESZTNEV() {
        return KERESZTNEV;
    }

    public void ujBejegyzes(Jegy jegy) {
        this.jegyek.add(jegy);
    }

    public double tantargyAtlag(String tantargy) {
        int darab = 0;
        double osszeg = 0;
        for (Jegy jegy : jegyek) {
            if (jegy.getNEV().equals(tantargy)) {
                darab++;
                osszeg += jegy.getJEGY();
            }
        }
        if (darab == 0) return 0;
        return osszeg / darab;
    }

    public ArrayList<String> getTantargyak() {
        ArrayList<String> tantargyak = new ArrayList<>();
        for (Jegy jegy : jegyek) {
            if (!(tantargyak.contains(jegy.getNEV())))
                tantargyak.add(jegy.getNEV());
        }
        return tantargyak;

    }

    public void listazas() {
        ArrayList<String> tantargyak = getTantargyak();
        System.out.println(getVEZETEKNEV() + " " + getKERESZTNEV());
        for (String tantargy : tantargyak) {
            System.out.printf("%5s %s: %.1f\n", "", tantargy, tantargyAtlag(tantargy));
        }
    }
}
