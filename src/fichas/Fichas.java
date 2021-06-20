package src.fichas;

public class Fichas {

    public static final String ANSI_RESET = "\u001B[0m";
    private boolean redonda = true;
    private int posIniX;
    private int posIniY;
    private int posFinX;
    private int posFinY;
    private String fichaRedonda = ANSI_RED + " O " + ANSI_RESET;
    private String fichaX = ANSI_RED + " X " + ANSI_RESET;
    public static final String ANSI_RED = "\u001B[31m";

    public Fichas(boolean redonda, int posIniX, int posIniY) {

        this.redonda = redonda;
        this.posIniX = posIniX;
        this.posIniY = posIniY;

    }

    public Fichas(boolean redonda, int posIniX, int posIniY, int posFinX, int posFinY) {

        this.redonda = redonda;
        this.posIniX = posIniX;
        this.posIniY = posIniY;
        this.posFinX = posFinX;
        this.posFinY = posFinY;

    }

    public String pintarFichaRedonda() {
        return fichaRedonda;
    }

    public String pintarFichaX() {
        return fichaX;
    }

    public int getPosIniX() {
        return posIniX;
    }

    public int getPosIniY() {
        return posIniY;
    }

}