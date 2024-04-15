import java.util.ArrayList;

public class TesztSzamlak {
    public static void main(String[] args) throws Exception {
        ArrayList<BankSzamla> szamlak = new ArrayList<>();
        RegularisSzamla reg1 = new RegularisSzamla("Nagy Lajos");
        RegularisSzamla reg2 = new RegularisSzamla("Kiss Peter");
        FolyoSzamla fo1 = new FolyoSzamla("Tóth Elek");
        FolyoSzamla fo2 = new FolyoSzamla("Mák Andor");
        TakarekSzamla tak1 = new TakarekSzamla("Lázár Bence", 1);
        TakarekSzamla tak2 = new TakarekSzamla("Benczés András", 4.5);
        try {
            reg1.betesz(40);
            reg1.kivesz(10);
            reg2.betesz(50);
            reg2.kivesz(20);
            fo1.betesz(30);
            fo1.kivesz(30);
            fo2.betesz(10);
            //fo2.kivesz(20);
            fo2.betesz(50);
            tak1.betesz(30);
            tak1.kivesz(5);
            tak2.betesz(25);
            tak2.kivesz(20);
            fo1.levonKoltseg();
            fo2.levonKoltseg();
            tak1.hozzaadKamat();
            tak2.hozzaadKamat();
            szamlak.add(reg1);
            szamlak.add(reg2);
            szamlak.add(fo1);
            szamlak.add(fo2);
            szamlak.add(tak1);
            szamlak.add(tak2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        for (BankSzamla szamla : szamlak) {
            System.out.println(szamla);
        }
        FolyoSzamla fo3 = fo1;
        System.out.println(fo3.equals(fo1));
        System.out.println(fo3.equals(fo2));
        TakarekSzamla tak3 = tak2;
        System.out.println(tak3.equals(tak2));
        System.out.println(tak3.equals(tak1));
        for (Tranzakcio tranz : fo2.tranzakciok) {
            switch (tranz.getTranztipus()) {
                case DEPOSIT -> System.out.println(tranz);
            }
        }

    }
}
