import static java.lang.Math.abs;

public class HorrorFilm extends Film implements IKorhataros {
    private int korh;

    public HorrorFilm(String cim, int ar, int korh) {
        super(cim, ar);
        this.korh = korh;
    }

    public int Korhatar() {
        return this.korh;
    }

    public int Buntetes(int kor) {
        if (kor - this.korh < 0) {
            return abs(kor - this.korh) * this.ar;
        }
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + ", korhatár: " + korh;
    }
}
