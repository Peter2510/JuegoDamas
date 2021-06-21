package src.fichas;

public class Fichas {

    public static final String ANSI_RESET = "\u001B[0m";
    private boolean numeral = true;
    private int posIniX;
    private int posIniY;
    private int posFinX;
    private int posFinY;
    private String fichaNumeral = ANSI_RED + "#" + ANSI_RESET;
    private String fichaAsterisco = ANSI_GREEN + "*" + ANSI_RESET;
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    public Fichas(boolean numeral, int posIniX, int posIniY) {

        this.numeral = numeral;
        this.posIniX = posIniX;
        this.posIniY = posIniY;

    }

    public Fichas(boolean numeral, int posIniX, int posIniY, int posFinX, int posFinY) {

        this.numeral = numeral;
        this.posIniX = posIniX;
        this.posIniY = posIniY;
        this.posFinX = posFinX;
        this.posFinY = posFinY;

    }

    public String pintarFichaNumeral() {
        return fichaNumeral;
    }

    public String pintarFichaAsterisco() {
        return fichaAsterisco;
    }

    public int getPosIniX() {
        return posIniX;
    }

    public int getPosIniY() {
        return posIniY;
    }

    public void setPosIniX(int posIniX){

        this.posIniX = posIniX;

    }

    public void setPosIniY(int posIniY){

        this.posIniY = posIniY;

    }

}