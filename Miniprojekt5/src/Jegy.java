public class Jegy {
    private final String NEV;
    private final int JEGY;

    public Jegy(String NEV, int JEGY) {
        this.NEV = NEV;
        this.JEGY = JEGY;
    }

    public String getNEV() {
        return NEV;
    }

    public int getJEGY() {
        return JEGY;
    }

    @Override
    public String toString() {
        return "Jegy{" +
                "NEV='" + NEV + '\'' +
                ", JEGY=" + JEGY +
                '}';
    }
}
