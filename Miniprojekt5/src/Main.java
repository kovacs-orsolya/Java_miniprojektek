import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hallgato hallgato = new Hallgato("Nagy", "Elemer");
        hallgato.ujBejegyzes(new Jegy("Matek", 10));

        hallgato.ujBejegyzes(new Jegy("Matek", 8));
        hallgato.ujBejegyzes(new Jegy("Roman", 7));
        hallgato.ujBejegyzes(new Jegy("Roman", 8));
        hallgato.ujBejegyzes(new Jegy("Magyar", 9));
        hallgato.listazas();
        Naplo naplo = null;
        try {
            naplo = new Naplo("hallgatok.csv");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        naplo.listazNevek();
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("jegyek.csv"));
            while (scanner.hasNextLine()) {
                String sor = scanner.nextLine();
                String[] adat = sor.split(",");
                for (Hallgato hallgato2 : naplo.getHallgatok()) {
                    if (hallgato2.getID() == Integer.parseInt(adat[0])) {
                        hallgato2.ujBejegyzes(new Jegy(adat[1], Integer.parseInt(adat[2])));
                    }
                }
            }
            naplo.listazHallgatoiAdatok();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            scanner.close();
        }


    }
}