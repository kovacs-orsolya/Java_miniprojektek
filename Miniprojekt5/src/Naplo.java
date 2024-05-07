import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Naplo {
    private ArrayList<Hallgato> hallgatok = new ArrayList<>();

    public ArrayList<Hallgato> getHallgatok() {
        return hallgatok;
    }

    public Naplo(String file) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(file));
        while (scanner.hasNextLine()) {
            String adat = scanner.nextLine();
            String[] nev = adat.split(",");
            Hallgato hallgato = new Hallgato(nev[0], nev[1]);
            hallgatok.add(hallgato);
        }
        scanner.close();
    }

    public void ujJegy(int ID, Jegy jegy) {
        hallgatok.get(ID - 1).ujBejegyzes(jegy);
    }

    public void listazNevek() {
        for (Hallgato hallgato : hallgatok) {
            System.out.println(hallgato.getID() + ". " + hallgato.getVEZETEKNEV() + " " + hallgato.getKERESZTNEV());

        }
    }

    public void listazHallgatoiAdatok() {
        for (Hallgato hallgato : hallgatok) {
            hallgato.listazas();
        }
    }
}
