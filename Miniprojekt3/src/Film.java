public class Film {
    protected String cim;
    protected int ar;
    protected int[] velemenyek;

    public Film(String cim, int ar) {
        this.cim = cim;
        this.ar = ar;
        this.velemenyek = new int[20];

    }

    public String getCim() {
        return cim;
    }

    public double getAr() {
        return ar;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }

    public void Velemenyezes(int ertek) {
        this.velemenyek[this.getVelemenyekSzama()]=ertek;
    }
    public double Atlag(){
        int i=0;
        double osszErtek=0;
        while(this.velemenyek[i]!=0){
            osszErtek+=this.velemenyek[i];
            i++;
        }
        return osszErtek/this.getVelemenyekSzama();
    }
    public int getVelemenyekSzama(){
        int darab=0;
        int i=-1;
        while(this.velemenyek[++i]!=0){
            darab++;
        }
        return darab;
    }

    @Override
    public String toString() {
        return "Film címe: " + cim + ", Film ára:" + ar;
    }
}
