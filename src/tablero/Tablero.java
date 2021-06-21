package src.tablero;
import java.util.*;
import src.fichas.Fichas;

public class Tablero {

    private int columna;
    private int fila;
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
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_RESET = "\u001B[0m";
    private boolean pintada;
    Scanner sc = new Scanner(System.in);
    public Tablero() {

    }

    //agregar usuarios

    public void pintarTablero() {

        System.out.println(" 0    1   2   3   4   5   6   7 ");

        for (int i = 0; i < nFilas; i++) {

            for (int j = 0; j < nColumnas; j++) {

                int columnaPar = j % 2;
                int filaPar = i % 2;

                //fila par y columna par es blanco
                if (filaPar == 0 && columnaPar == 0) {

                    tablero[i][j] = ANSI_WHITE_BACKGROUND + "▒▒▒▒" + ANSI_RESET;
                    pintada = true;

                }

                //fila impar y columna par es negro
                if (filaPar != 0 && columnaPar == 0) {

                    
                    pintada = false;
                    tablero[i][j] = "▒▒▒▒" ;
                }

                //fila par  y columnar impar
                if (filaPar == 0 && columnaPar != 0) {

                    tablero[i][j] = "▒▒▒▒";
                    pintada = false;

                }

                if (filaPar != 0 && columnaPar != 0) {

                    tablero[i][j] = ANSI_WHITE_BACKGROUND + "▒▒▒▒" + ANSI_RESET;
                    pintada = true;

                }

            }

        }

        for (int i = 0; i < nFilas; i++) {

            System.out.print(i);
            //Parte de arriba 
            tablero[ficha1.getPosIniX()][ficha1.getPosIniY()] = ficha1.pintarFichaRedonda()+"01"+ficha1.pintarFichaRedonda();
            tablero[ficha2.getPosIniX()][ficha2.getPosIniY()] = ficha2.pintarFichaRedonda()+"02"+ficha2.pintarFichaRedonda();
            tablero[ficha3.getPosIniX()][ficha3.getPosIniY()] = ficha3.pintarFichaRedonda()+"03"+ficha3.pintarFichaRedonda();
            tablero[ficha4.getPosIniX()][ficha4.getPosIniY()] = ficha4.pintarFichaRedonda()+"04"+ficha4.pintarFichaRedonda();
            tablero[ficha5.getPosIniX()][ficha5.getPosIniY()] = ficha5.pintarFichaRedonda()+"05"+ficha5.pintarFichaRedonda();
            tablero[ficha6.getPosIniX()][ficha6.getPosIniY()] = ficha6.pintarFichaRedonda()+"06"+ficha6.pintarFichaRedonda();
            tablero[ficha7.getPosIniX()][ficha7.getPosIniY()] = ficha7.pintarFichaRedonda()+"07"+ficha7.pintarFichaRedonda();
            tablero[ficha8.getPosIniX()][ficha8.getPosIniY()] = ficha8.pintarFichaRedonda()+"08"+ficha8.pintarFichaRedonda();

            //Parte de Abajo
            tablero[ficha9.getPosIniX()][ficha9.getPosIniY()] = ficha9.pintarFichaX()+"09"+ficha9.pintarFichaX();
            tablero[ficha10.getPosIniX()][ficha10.getPosIniY()] = ficha10.pintarFichaX()+"10"+ficha10.pintarFichaX();
            tablero[ficha11.getPosIniX()][ficha11.getPosIniY()] = ficha11.pintarFichaX()+"11"+ficha11.pintarFichaX();
            tablero[ficha12.getPosIniX()][ficha12.getPosIniY()] = ficha12.pintarFichaX()+"12"+ficha12.pintarFichaX();
            tablero[ficha13.getPosIniX()][ficha13.getPosIniY()] = ficha13.pintarFichaX()+"13"+ficha13.pintarFichaX();
            tablero[ficha14.getPosIniX()][ficha14.getPosIniY()] = ficha14.pintarFichaX()+"14"+ficha14.pintarFichaX();
            tablero[ficha15.getPosIniX()][ficha15.getPosIniY()] = ficha15.pintarFichaX()+"15"+ficha15.pintarFichaX();
            tablero[ficha16.getPosIniX()][ficha16.getPosIniY()] = ficha16.pintarFichaX()+"16"+ficha16.pintarFichaX();

         

            for (int j = 0; j < nColumnas; j++) {

                System.out.print(tablero[i][j]);

            }
            System.out.println("");

        }

      

    
      
    }

   
      public void movimiento1(int columna, int fila){
            ficha1.setPosIniX(columna);
            ficha1.setPosIniY(fila);
        }


      public void movimiento2(int columna, int fila){
            ficha2.setPosIniX(columna);
            ficha2.setPosIniY(fila);
        }


      public void movimiento3(int columna, int fila){
            ficha3.setPosIniX(columna);
            ficha3.setPosIniY(fila);
        }


      public void movimiento4(int columna, int fila){
            ficha4.setPosIniX(columna);
            ficha4.setPosIniY(fila);
        }


      public void movimiento5(int columna, int fila){
            ficha5.setPosIniX(columna);
            ficha5.setPosIniY(fila);
        }


      public void movimiento6(int columna, int fila){
            ficha6.setPosIniX(columna);
            ficha6.setPosIniY(fila);
        }


      public void movimiento7(int columna, int fila){
            ficha7.setPosIniX(columna);
            ficha7.setPosIniY(fila);
        }


      public void movimiento8(int columna, int fila){
            ficha8.setPosIniX(columna);
            ficha8.setPosIniY(fila);
        }


      public void movimiento9(int columna, int fila){
            ficha9.setPosIniX(columna);
            ficha9.setPosIniY(fila);
        }


      public void movimiento10(int columna, int fila){
            ficha10.setPosIniX(columna);
            ficha10.setPosIniY(fila);
        }


      public void movimiento11(int columna, int fila){
            ficha11.setPosIniX(columna);
            ficha11.setPosIniY(fila);
        }


      public void movimiento12(int columna, int fila){
            ficha12.setPosIniX(columna);
            ficha12.setPosIniY(fila);
        }


      public void movimiento13(int columna, int fila){
            ficha13.setPosIniX(columna);
            ficha13.setPosIniY(fila);
        }


      public void movimiento14(int columna, int fila){
            ficha14.setPosIniX(columna);
            ficha14.setPosIniY(fila);
        }


      public void movimiento15(int columna, int fila){
            ficha15.setPosIniX(columna);
            ficha15.setPosIniY(fila);
        }


      public void movimiento16(int columna, int fila){
            ficha16.setPosIniX(columna);
            ficha16.setPosIniY(fila);
        }




}  