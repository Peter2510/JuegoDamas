package src.logica;

import src.usuarios.VectorUsuarios;
import java.util.Scanner;
//import src.tablero.Tablero;

public class Principal {

    Scanner ingreso = new Scanner(System.in);
    //Tablero tablero = new Tablero();

    public static void main(String[] args) {

        Principal inicio = new Principal();
      
        
    }

    private VectorUsuarios controlUsuarios = new VectorUsuarios();

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

                if (controlUsuarios.getContadorUsuarios()>9) {
                    
                    System.out.println("\nSe alcanzo el maximo de jugadores permitidos");
                }

                else {

                    System.out.println("\n***  Registrando Usuario ***");
                    controlUsuarios.agregarUsuario();
                    
                }

                

            }

            if (menu == 2) {
                System.out.println("\n***  Reporte de usuarios   ***\n");


                if (controlUsuarios.getContadorUsuarios()>0) {
                    
                    controlUsuarios.mostrarUsuariosRegistrados();    
                }

                else{

                    System.out.println("No hay usuarios registrados");
                }
                
            }

            if (menu == 3) {

                if (controlUsuarios.getContadorUsuarios()>1) {

                    System.out.println("_______________________________");

                    System.out.println("\nElige a los jugadores competirán\n");
                    
                    
                    controlUsuarios.mostrarUsuariosRegistrados();

                    System.out.println("Jugador 1");
                    int opcionJugadores1 = ingreso.nextInt();

                    System.out.println("Jugador 2");
                    int opcionJugadores2 = ingreso.nextInt();
                    
                    System.out.println("\n");
                    

                }

                else{
                    System.out.println("\n***  Deben de haber registrados al menos 2 jugadores  ***");
                }

                
                

            }

            if (menu == 4) {

                System.out.println("adios");
                

            }

        }

    }
}