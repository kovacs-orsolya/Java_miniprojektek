import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;

public class Teszter {
    public static int osszBuntetes(ArrayList<IKorhataros> filmek,int kor){
        int osszeg=0;
        for (IKorhataros film:filmek){
            osszeg+=film.Buntetes(kor);
        }
        return osszeg;
    }
    public static void main(String[] args) {
        ArrayList<Film> filmek = new ArrayList<>();
        filmek.add(new Film("Csillagok háborúja", 1250));
        filmek.add(new Film("ready Player One", 1310));
        filmek.add(new Film("Avatar", 1105));
        filmek.add(new Film("Avatar 2", 1205));
        filmek.add(new Film("Superman", 1290));
        filmek.add(new Film("Batman", 1305));
        filmek.add(new HorrorFilm("A kör", 1005, 18));
        filmek.add(new HorrorFilm("Démonok között", 1355, 16));
        filmek.add(new HorrorFilm("Az", 1325, 16));
        filmek.add(new HorrorFilm("Az 2", 1045, 18));
        filmek.add(new HorrorFilm("Démonok között 2", 1145, 18));
        filmek.add(new HorrorFilm("Az apáca", 1215, 18));
        for (Film film:filmek){
            System.out.println(film);
        }
        filmek.sort(Comparator.comparing(Film::getAr));
        System.out.println("\nRendezés után:");
        for (Film film:filmek){
            System.out.println(film);
        }
        ArrayList<IKorhataros> korhatarosFilmek = new ArrayList<>();
        for (Film film:filmek){
            if (film instanceof HorrorFilm){
                korhatarosFilmek.add((IKorhataros) film);
            }
        }
        System.out.println("\nHorrorfilmek:");
        for (IKorhataros film:korhatarosFilmek){
            System.out.println(film);
        }
        System.out.println("\nTeljes büntetés: "+osszBuntetes(korhatarosFilmek,15));
    }
}
