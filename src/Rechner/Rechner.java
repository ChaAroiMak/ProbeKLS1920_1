package Rechner;

public interface Rechner {

    public int addiere(int x) throws StackOverflowError;

    public int subtrahiere(int y);

    public int ergebnis();
    public void safeDaten();
}
