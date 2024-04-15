public interface BankSzamla {
    public void betesz(double osszeg);

    public void kivesz(double osszeg) throws Exception;

    public double getegyenleg();
}
