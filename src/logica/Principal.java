package src.logica;

import src.usuarios.VectorUsuarios;
import java.util.Scanner;
import src.tablero.Tablero;

public class Principal {

    Scanner ingreso = new Scanner(System.in);
    private Tablero tablero = new Tablero();
    private PiedraPapelTijera suerte = new PiedraPapelTijera();
    private VectorUsuarios controlUsuarios = new VectorUsuarios();
    private int moverColumna;
    private int moverFila;
    int contador = 20;

    public static void main(String[] args) {

        Principal inicio = new Principal();

    }

    public Principal() {

        int menu = 0;

        while (menu != 4) {

            System.out.println("\n\n_______________________________   MENU   ______________________________________");
            System.out.println("\nSelecciona una opcion: ");
            System.out.println("\n1. Registrar usuarios ");
            System.out.println("2. Mostrar reporte de usuarios");
            System.out.println("3. Iniciar Partida");
            System.out.println("4. Salir");
            System.out.println("\nIngresa una opcion: ");
            menu = ingreso.nextInt();

            if (menu == 1) {

                if (controlUsuarios.getContadorUsuarios() > 4) {

                    System.out.println("\nSe alcanzo el maximo de jugadores permitidos");
                } else {

                    System.out.println("\n***  Registrando Usuario ***\n");
                    controlUsuarios.agregarUsuario();

                }

            }

            if (menu == 2) {
                System.out.println("\n***  Reporte de usuarios   ***\n");

                if (controlUsuarios.getContadorUsuarios() > 0) {

                    controlUsuarios.mostrarUsuariosRegistrados();
                } else {

                    System.out.println("No hay usuarios registrados");

                }

            }

            if (menu == 3) {

                if (controlUsuarios.getContadorUsuarios() > 1) {

                    System.out.println("_______________________________");

                    System.out.println("\nElige a los jugadores competirán\n");

                    controlUsuarios.mostrarUsuariosRegistrados();

                    System.out.println("Jugador 1");
                    int opcionJugadores1 = ingreso.nextInt();

                    System.out.println("Jugador 2");
                    int opcionJugadores2 = ingreso.nextInt();

                    // INICIO Piedra, papel o tijera 

                    while(suerte.getAccion()==0){

                    suerte.logica();
                    suerte.getAccion();
                    System.out.println(suerte.getResultado());

                    if (suerte.getAccion() == 0) {
                        suerte.logica();
                        System.out.println("\n");
                        suerte.getAccion();
                        System.out.println(suerte.getResultado());
                        System.out.println("\n");
                        tablero.pintarTablero();

                    } else {

                        if (suerte.getAccion() == 0) {

                            System.out.println("\n");
                            System.out.println("Empate, se realizara otro intento");

                        }

                        if (suerte.getAccion() == 1) {

                            System.out.println("\n");
                            System.out.println("El jugador uno empieza la partida");

                        }

                        if (suerte.getAccion() == 2) {

                            System.out.println("\n");
                            System.out.println("El jugador dos empieza la partida");

                        }

                    }


                        // FIN Piedra, papel o tijera

                        System.out.println("\n");
                        
                        tablero.pintarTablero();
                        //tablero.pintarTablero();

                        while(contador<=20){

                            pedirJugadro1();

                            pedirJugadro2();
                            contador--;



                        }

                      System.out.println("2");


                    }

                } else {
                    System.out.println("\n***  Deben de haber registrados al menos 2 jugadores  ***");
                }

            }

            if (menu == 4) {

                System.out.println("Vuelve Pronto");

            }

        }

    }

    public void pedirJugadro1(){
         System.out.println("Jugador1: Que pieza deseas mover");
                       int mover = ingreso.nextInt();
                       
                       if (mover==1) {
                           System.out.println("A que fila deseas mover la pieza");
                           moverColumna = ingreso.nextInt();
                           System.out.println("A que columna deseas mover la pieza");
                           moverFila = ingreso.nextInt();
                           tablero.movimiento1(moverColumna,moverFila);
                       }

                          if (mover==2) {
                           System.out.println("A que fila deseas mover la pieza");
                           moverColumna = ingreso.nextInt();
                           System.out.println("A que columna deseas mover la pieza");
                           moverFila = ingreso.nextInt();
                           tablero.movimiento2(moverColumna,moverFila);
                       }

                      if (mover==3) {
                           System.out.println("A que fina deseas mover la pieza");
                           moverColumna = ingreso.nextInt();
                           System.out.println("A que columna deseas mover la pieza");
                           moverFila = ingreso.nextInt();
                           tablero.movimiento3(moverColumna,moverFila);
                       }

                         if (mover==4) {
                           System.out.println("A que fila deseas mover la pieza");
                           moverColumna = ingreso.nextInt();
                           System.out.println("A que columna deseas mover la pieza");
                           moverFila = ingreso.nextInt();
                           tablero.movimiento4(moverColumna,moverFila);
                       }

                         if (mover==5) {
                           System.out.println("A que fila deseas mover la pieza");
                           moverColumna = ingreso.nextInt();
                           System.out.println("A que columna deseas mover la pieza");
                           moverFila = ingreso.nextInt();
                           tablero.movimiento5(moverColumna,moverFila);
                       }

                         if (mover==6) {
                           System.out.println("A que fila deseas mover la pieza");
                           moverColumna = ingreso.nextInt();
                           System.out.println("A que columna deseas mover la pieza");
                           moverFila = ingreso.nextInt();
                           tablero.movimiento6(moverColumna,moverFila);
                       }

                         if (mover==7) {
                           System.out.println("A que fila deseas mover la pieza");
                           moverColumna = ingreso.nextInt();
                           System.out.println("A que columna deseas mover la pieza");
                           moverFila = ingreso.nextInt();
                           tablero.movimiento7(moverColumna,moverFila);
                       }

                         if (mover==8) {
                           System.out.println("A que fila deseas mover la pieza");
                           moverColumna = ingreso.nextInt();
                           System.out.println("A que columna deseas mover la pieza");
                           moverFila = ingreso.nextInt();
                           tablero.movimiento8(moverColumna,moverFila);
                       }


                        tablero.pintarTablero();
                        //tablero.pintarTablero();tablero.pintarTablero();

    }

     public void pedirJugadro2(){
         System.out.println("Jugador2: Que pieza deseas mover");
                       int mover = ingreso.nextInt();
                       
                       if (mover==9) {
                           System.out.println("A que fila deseas mover la pieza");
                           moverColumna = ingreso.nextInt();
                           System.out.println("A que columna deseas mover la pieza");
                           moverFila = ingreso.nextInt();
                           tablero.movimiento9(moverColumna,moverFila);
                       }

                          if (mover==10) {
                           System.out.println("A que fila deseas mover la pieza");
                           moverColumna = ingreso.nextInt();
                           System.out.println("A que columna deseas mover la pieza");
                           moverFila = ingreso.nextInt();
                           tablero.movimiento10(moverColumna,moverFila);
                       }

                      if (mover==11) {
                           System.out.println("A que fila deseas mover la pieza");
                           moverColumna = ingreso.nextInt();
                           System.out.println("A que columna deseas mover la pieza");
                           moverFila = ingreso.nextInt();
                           tablero.movimiento11(moverColumna,moverFila);
                       }

                         if (mover==12) {
                           System.out.println("A que fila deseas mover la pieza");
                           moverColumna = ingreso.nextInt();
                           System.out.println("A que columna deseas mover la pieza");
                           moverFila = ingreso.nextInt();
                           tablero.movimiento12(moverColumna,moverFila);
                       }

                         if (mover==13) {
                           System.out.println("A que fila deseas mover la pieza");
                           moverColumna = ingreso.nextInt();
                           System.out.println("A que columna deseas mover la pieza");
                           moverFila = ingreso.nextInt();
                           tablero.movimiento13(moverColumna,moverFila);
                       }

                         if (mover==14) {
                           System.out.println("A que fila deseas mover la pieza");
                           moverColumna = ingreso.nextInt();
                           System.out.println("A que columna deseas mover la pieza");
                           moverFila = ingreso.nextInt();
                           tablero.movimiento14(moverColumna,moverFila);
                       }

                         if (mover==15) {
                           System.out.println("A que fila deseas mover la pieza");
                           moverColumna = ingreso.nextInt();
                           System.out.println("A que columna deseas mover la pieza");
                           moverFila = ingreso.nextInt();
                           tablero.movimiento15(moverColumna,moverFila);
                       }

                         if (mover==16) {
                           System.out.println("A que fila deseas mover la pieza");
                           moverColumna = ingreso.nextInt();
                           System.out.println("A que columna deseas mover la pieza");
                           moverFila = ingreso.nextInt();
                           tablero.movimiento16(moverColumna,moverFila);
                       }


                        tablero.pintarTablero();
                        //tablero.pintarTablero();tablero.pintarTablero();

}
}