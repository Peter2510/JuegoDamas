package src.tablero;
import java.util.*;
import src.fichas.Fichas;

public class Tablero {

    private int nColumnas = 8;
    private int nFilas = 8;
    private String[][] tablero = new String[nFilas][nColumnas];
    private Fichas ficha1 = new Fichas(true, 0, 1);
    private Fichas ficha2 = new Fichas(true, 0, 3);
    private Fichas ficha3 = new Fichas(true, 0, 5);
    private Fichas ficha4 = new Fichas(true, 0, 7);
    private Fichas ficha5 = new Fichas(true, 1, 0);
    private Fichas ficha6 = new Fichas(true, 1, 2);
    private Fichas ficha7 = new Fichas(true, 1, 4);
    private Fichas ficha8 = new Fichas(true, 1, 6);
    private Fichas ficha9 = new Fichas(false, 6, 1);
    private Fichas ficha10 = new Fichas(false, 6, 3);
    private Fichas ficha11 = new Fichas(false, 6, 5);
    private Fichas ficha12 = new Fichas(false, 6, 7);
    private Fichas ficha13 = new Fichas(false, 7, 0);
    private Fichas ficha14 = new Fichas(false, 7, 2);
    private Fichas ficha15 = new Fichas(false, 7, 4);
    private Fichas ficha16 = new Fichas(false, 7, 6);
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    public static final String ANSI_RESET = "\u001B[0m";
    private boolean pintada;
    Scanner sc = new Scanner(System.in);
    public Tablero() {

    }

    //agregar usuarios

    public void pintarTablero() {

        System.out.println(" 0   1  2  3  4  5  6  7 ");

        for (int i = 0; i < nFilas; i++) {

            for (int j = 0; j < nColumnas; j++) {

                int columnaPar = j % 2;
                int filaPar = i % 2;

                //fila par y columna par es blanco
                if (filaPar == 0 && columnaPar == 0) {

                    tablero[i][j] = ANSI_WHITE_BACKGROUND + "▒▒▒" + ANSI_RESET;
                    pintada = true;

                }

                //fila impar y columna par es negro
                if (filaPar != 0 && columnaPar == 0) {

                    tablero[i][j] = "   ";
                    pintada = false;

                }

                //fila par  y columnar impar
                if (filaPar == 0 && columnaPar != 0) {

                    tablero[i][j] = "   ";
                    pintada = false;

                }

                if (filaPar != 0 && columnaPar != 0) {

                    tablero[i][j] = ANSI_WHITE_BACKGROUND + "▒▒▒" + ANSI_RESET;
                    pintada = true;

                }

            }

        }

        for (int i = 0; i < nFilas; i++) {

            System.out.print(i);
            //Parte de arriba 
            tablero[ficha1.getPosIniX()][ficha1.getPosIniY()] = ficha1.pintarFichaRedonda();
            tablero[ficha2.getPosIniX()][ficha2.getPosIniY()] = ficha2.pintarFichaRedonda();
            tablero[ficha3.getPosIniX()][ficha3.getPosIniY()] = ficha3.pintarFichaRedonda();
            tablero[ficha4.getPosIniX()][ficha4.getPosIniY()] = ficha4.pintarFichaRedonda();
            tablero[ficha5.getPosIniX()][ficha5.getPosIniY()] = ficha5.pintarFichaRedonda();
            tablero[ficha6.getPosIniX()][ficha6.getPosIniY()] = ficha6.pintarFichaRedonda();
            tablero[ficha7.getPosIniX()][ficha7.getPosIniY()] = ficha7.pintarFichaRedonda();
            tablero[ficha8.getPosIniX()][ficha8.getPosIniY()] = ficha8.pintarFichaRedonda();

            //Parte de Abajo
            tablero[ficha9.getPosIniX()][ficha1.getPosIniY()] = ficha9.pintarFichaX();
            tablero[ficha10.getPosIniX()][ficha2.getPosIniY()] = ficha10.pintarFichaX();
            tablero[ficha11.getPosIniX()][ficha3.getPosIniY()] = ficha11.pintarFichaX();
            tablero[ficha12.getPosIniX()][ficha4.getPosIniY()] = ficha12.pintarFichaX();
            tablero[ficha13.getPosIniX()][ficha5.getPosIniY()] = ficha13.pintarFichaX();
            tablero[ficha14.getPosIniX()][ficha6.getPosIniY()] = ficha14.pintarFichaX();
            tablero[ficha15.getPosIniX()][ficha7.getPosIniY()] = ficha15.pintarFichaX();
            tablero[ficha16.getPosIniX()][ficha8.getPosIniY()] = ficha16.pintarFichaX();

            for (int j = 0; j < nColumnas; j++) {

                System.out.print(tablero[i][j]);

            }
            System.out.println("");

        }

    }

}